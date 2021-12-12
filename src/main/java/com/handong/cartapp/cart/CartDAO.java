package com.handong.cartapp.cart;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CartDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public int insertCart(CartVO vo) {
		int result = sqlSession.insert("Cart.insertCart", vo);
		return result;
	}
	
	public int updateCart(CartVO vo) {
		int result = sqlSession.update("Cart.updateCart", vo);
		return result;
	}
	
	public int deleteCart(int seq) {
		int result = sqlSession.delete("Cart.deleteCart", seq);
		return result;
	}
	
	public CartVO getCart(int seq) {
		CartVO one = sqlSession.selectOne("Cart.getCart", seq);
		return one;
	}

}
