package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

//		+--------+----------+----------+
//		| userid | username | password |
//		+--------+----------+----------+
//		|      1 | user1    | pass$1   |
//		|      2 | user2    | pass$2   |
//		|      3 | user3    | pass$3   |
//		|      4 | user4    | pass$4   |
//		+--------+----------+----------+

		String username = req.getParameter("username");
		String password = req.getParameter("password");

		DBLogin dblogin = new DBLogin();

		if (dblogin.userLogin(username, password)) {

			HttpSession session = req.getSession();
			session.setAttribute("username", username);
			res.sendRedirect("welcome.jsp");

		} else {
			HttpSession session = req.getSession();
			session.setAttribute("loginerror", "Incorrect Username or Password");
			res.sendRedirect("login.jsp");
		}

	}

}
