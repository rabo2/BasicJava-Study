package chapter7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class JDBCTest {
	public static void main(String[] args) throws Exception {
		LprodDao lprodDao = new LprodDao();
		List<LprodVO> vos = lprodDao.select();
		System.out.println("ID\t구분\t이름");
		for (LprodVO vo : vos) {
			System.out.println(vo.getLprodId()+"\t"+vo.getLprodGu()+"\t"+vo.getLprodNm());
		}
		
	}
}
