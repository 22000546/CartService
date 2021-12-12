package com.handong.cartapp.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CartController {
	
	@Autowired
	CartService cartService;
	
	@RequestMapping(value = "/cart/add", method = RequestMethod.GET)
	public String addItem() {
		return "cart/addform";
	}
	
	@RequestMapping(value = "/cart/addok", method = RequestMethod.POST)
	public String addItemOK(CartVO vo) {
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
