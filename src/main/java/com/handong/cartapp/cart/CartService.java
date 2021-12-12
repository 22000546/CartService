package com.handong.cartapp.cart;

public interface CartService {
	
	public int insertCart(CartVO vo);
	public int updateCart(CartVO vo);
	public int deleteCart(int seq);

}
