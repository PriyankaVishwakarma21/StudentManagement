package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {
	static Connection con;

	public static Connection createConnection() throws SQLException {
		//create connection
		try {
			// loading the drive
			Class.forName("com.mysql.jdbc.Driver");
			// create the connection
			String username = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/student_manage?autoReconnect=true&useSSL=false";
			con = DriverManager.getConnection(url, username, password);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
