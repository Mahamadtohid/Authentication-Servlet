package com.company.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static final String URL = "jdbc:mysql://localhost:3306/authenticationservlet";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "sadik";
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		System.out.println("Connecting With Database...");
		return DriverManager.getConnection(URL , USERNAME , PASSWORD);
	}
	

}
