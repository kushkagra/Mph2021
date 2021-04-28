package com.mph.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class MyDBConnection {
	
	static Connection con;
	public static Connection getDBConnection() {
		
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "123456");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		System.out.println(getDBConnection());
		
	}

}
