package com.handong.cartapp.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	CartDAO cartDAO;

	@Override
	public int insertCart(CartVO vo) {
		return cartDAO.insertCart(vo);
	}

	@Override
	public int updateCart(CartVO vo) {
		return cartDAO.updateCart(vo);
	}

	@Override
	public int deleteCart(int seq) {
		return cartDAO.deleteCart(seq);
	}

	@Override
	public CartVO getCart(int seq) {
		return cartDAO.getCart(seq);
	}

}
