package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hr-scheme?useSSL=false&serverTimeZone=UTC";
		String user = "hbstudent";
		String pass = "hbstudent";
		try {
			Connection conn = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("connection is successful");
		}
		catch(Exception ex) {
			ex.printStackTrace();

		}
	}
}
