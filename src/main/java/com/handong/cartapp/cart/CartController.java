package com.handong.cartapp.cart;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class CartController {
	
	@Autowired
	CartService cartService;
	
	@RequestMapping(value = "/cart/add", method = RequestMethod.GET)
	public String addItem() {
		return "cart/addform";
	}
	
	@RequestMapping(value = "/cart/addok", method = RequestMethod.POST)
	public String addItemOK(CartVO vo) throws IllegalStateException, IOException {
		String fileName = null;
		MultipartFile uploadFile = vo.getUploadFile();
		if (!uploadFile.isEmpty()) {
			String originalFileName = uploadFile.getOriginalFilename();
			String ext = FilenameUtils.getExtension(originalFileName);	//확장자 구하기
			UUID uuid = UUID.randomUUID();	//UUID 구하기
			fileName = uuid+"."+ext;
			uploadFile.transferTo(new File("D:\\upload\\" + fileName));
		}
		vo.setImage(fileName);
		System.out.println("fileName : " + fileName);
		int i = cartService.insertCart(vo);
		if(i == 0) {
			System.out.println("데이터 추가 실패");
		} else {
			System.out.println("데이터 추가 성공");
		}
		return "redirect:list";
	}
	
	@RequestMapping(value = "/cart/edit/{id}", method = RequestMethod.GET)
	public String editItem(@PathVariable("id") int id, Model model) {
		CartVO cartVO = cartService.getCart(id);
		model.addAttribute("cartVO", cartVO);
		return "cart/editform";
	}
	
	@RequestMapping(value = "/cart/editok", method = RequestMethod.POST)
	public String editItemOK(CartVO vo) {
		int i = cartService.updateCart(vo);
		if(i == 0) {
			System.out.println("데이터 수정 실패");
		} else {
			System.out.println("데이터 수정 성공");
		}
		return "redirect:list";
	}

}
