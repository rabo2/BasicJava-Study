package chapter7;

import java.util.List;

public class CartTest {
	public static void main(String[] args) throws Exception {
		CartDAO cartDAO = new CartDAO();
		List<CartVO> select = cartDAO.selectCartList();
		for(CartVO vo : select) {
			System.out.println(vo.getCartMember()+"\t"+vo.getCartNo()+"\t"+vo.getCartProd()+"\t"+vo.getCartQty());
		}
		
	}
}
