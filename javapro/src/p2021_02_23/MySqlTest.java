package p2021_02_23;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlTest {
	public static void main(String[] args) {
		Connection conn;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306","root","12345");
			System.out.println("성공");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("실패");
		}
	}
}
