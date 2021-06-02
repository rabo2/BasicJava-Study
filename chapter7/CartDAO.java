package chapter7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

public class CartDAO {
	public List<CartVO> selectCartList() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "KMS96", "java");
		Statement statement = connection.createStatement();
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT CART_MEMBER, CART_NO, CART_PROD, CART_QTY");
		builder.append("  FROM CART");
		builder.append(" WHERE CART_NO LIKE '200505%");
		ArrayList<CartVO> list = new ArrayList<CartVO>();
		ResultSet resultSet = statement.executeQuery(builder.toString());
		while(resultSet.next()) {
			String cartMember = resultSet.getNString("CART_MEMBER");
			String cartNo = resultSet.getString("CART_NO");
			String cartProd = resultSet.getString("CART_PROD");
			int cartQty = resultSet.getInt("CART_QTY");
			list.add(new CartVO(cartMember, cartNo, cartProd, cartQty));
			}
		resultSet.close();
		statement.close();
		connection.close();
		return list;
	}
}
