package chapter7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

public class EmployeeDAO {
//	public EmployeeDTO selectEmployeeList() throws Exception {
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "KMS96", "java");
//		Statement statement = connection.createStatement();
//		StringBuilder builder = new StringBuilder();
//		builder.append("SELECT id, name, email, hp_number from employee");
//		ResultSet resultSet = statement.executeQuery(builder.toString());
//		List<EmployeeDTO> vo = null;
//		while (resultSet.next()) {
//			String empId = resultSet.getString("id");
//			String name = resultSet.getString("name");
//			String email = resultSet.getString("email");
//			String hpNumber = resultSet.getString("hp_number");
////			vo = new EmployeeDTO(empId, name, email, hpNumber);
//		}
//		resultSet.close();
//		statement.close();
//		connection.close();
////		return vo;
//
//	}

	public EmployeeDTO selectEmployee(String empId) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "KMS96", "java");
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT ID, NAME, EMAIL, HP_NUMBER FROM EMPLOYEE WHERE ID = ?");
		PreparedStatement statement = connection.prepareStatement(builder.toString());
		statement.setString(1, empId);
		ResultSet result = statement.executeQuery();
		EmployeeDTO vo = null;
		if (result.next()) {
			String id = result.getString("ID");
			String name = result.getString("NAME");
			String email = result.getString("EMAIL");
			String hpNumber = result.getString("HP_NUMBER");
			vo = new EmployeeDTO(id, name, email, hpNumber);
		}
		result.close();
		statement.close();
		connection.close();
		return vo;

	}

	public void insertEmployeeList(EmployeeDTO dto) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "KMS96", "java");
		Statement statement = connection.createStatement();
		StringBuilder builder = new StringBuilder();
		builder.append("INSERT INTO EMPLOYEE ");
		builder.append("(ID,NAME,EMAIL,HP_NUMBER) ");
		builder.append("VALUES ('" + dto.getId() + "', '" + dto.getName() + "', '" + dto.getEmail() + "', '"
				+ dto.getHpNubmer() + "')");
		int result = statement.executeUpdate(builder.toString());
		if (result > 0) {
			System.out.println("등록 완료");
		} else {
			System.out.println("등록 실패");
		}
		statement.close();
		connection.close();

	}

	public void updateEmployeeList(EmployeeDTO dto) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "KMS96", "java");
		String sql = "update employee set  name =?, email = ?, hp_number = ? where id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, dto.getName());
		statement.setString(2, dto.getEmail());
		statement.setString(3, dto.getHpNubmer());
		statement.setString(4, dto.getId());
		// setString은 알아서 ' '가 붙는다.
		// setInt는 붙지 않는다.
		int result = statement.executeUpdate();
		if (result > 0) {
			System.out.println("변경 성공");
		} else {
			System.out.println("실패");
		}
		statement.close();
		connection.close();

	}

	public void deleteEmployeeList(String id) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "KMS96", "java");
		String sql = "delete from employee where id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, id);
		int result = statement.executeUpdate();
		if (result > 0) {
			System.out.println("성공");
		} else {
			System.out.println("실패 : 삭제할 아이디가 존재 x");
		}
		statement.close();
		connection.close();
	}

}
