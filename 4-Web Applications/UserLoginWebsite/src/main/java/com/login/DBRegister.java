package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBRegister {

	static String URL = "jdbc:mysql://localhost:3306/user_login_data";
	static String USER = "root";
	static String PASS = "root";
	static String query = "SELECT username FROM users where username=?;";
	static String query2 = "INSERT INTO users (userid, username, password) VALUES (null,?,?)";

	private boolean userIsAvailable(String username) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			PreparedStatement stmt = conn.prepareStatement(query);

			stmt.setString(1, username);

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				return false;
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return true;
	}

	public boolean userRegister(String username, String password) {

		if (!userIsAvailable(username)) {
			return false;
		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			PreparedStatement stmt2 = conn.prepareStatement(query2);

			stmt2.setString(1, username);
			stmt2.setString(2, password);

			int rs2 = stmt2.executeUpdate();

			if (rs2 == 1) {
				System.out.println(rs2);
				return true;
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return false;
	}

	public static void main(String[] args) {

		DBRegister registerobj = new DBRegister();
		System.out.println(registerobj.userRegister("user2", "pass$6"));

	}
}
