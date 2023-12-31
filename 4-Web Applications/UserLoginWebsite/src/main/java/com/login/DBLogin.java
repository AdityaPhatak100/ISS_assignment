package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBLogin {

	static String URL = "jdbc:mysql://localhost:3306/user_login_data";
	static String USER = "root";
	static String PASS = "root";
	static String query = "SELECT * FROM users WHERE username=? and password=?";

	public boolean userLogin(String username, String password) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USER, PASS);

			PreparedStatement stmt = conn.prepareStatement(query);

			stmt.setString(1, username);
			stmt.setString(2, password);

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				return true;
			}

		} catch (Exception e) {

			System.out.println(e);
		}
		System.out.println("Incorrect username or password");
		return false;
	}

	public static void main(String[] args) {

		DBLogin loginobj = new DBLogin();
		loginobj.userLogin("user1", "pass$1");

	}

}
