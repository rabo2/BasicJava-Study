package chapter7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// DAO : Data Access Object
public class LprodDao {
	public List<LprodVO> select() throws Exception {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "KMS96", "java");
		statement = connection.createStatement();
		// update, insert, delete = executeUpdateQuery
		resultSet = statement.executeQuery("SELECT LPROD_ID, LPROD_GU, LPROD_NM FROM LPROD");
		List<LprodVO> vo = new ArrayList<LprodVO>();
		int i = 0;
		while (resultSet.next()) {
			int lprodId = resultSet.getInt("LPROD_ID");
			String lprodGu = resultSet.getString("LPROD_GU");
			String lprodNm = resultSet.getString("LpROD_NM");
			vo.add(new LprodVO(lprodId, lprodGu, lprodNm));
		}
		resultSet.close();
		statement.close();
		connection.close();
		return vo;
	}

	public void insert() {

	}

	public void update() {

	}

	public void delete() {

	}
}
