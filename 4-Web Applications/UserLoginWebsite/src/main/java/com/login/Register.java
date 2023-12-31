package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Register")
public class Register extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		HttpSession session = req.getSession();

		DBRegister dbregister = new DBRegister();

		session.removeAttribute("usernameExists");

		if (dbregister.userRegister(username, password)) {

			session.setAttribute("username", username);
			res.sendRedirect("welcome.jsp");

		} else {
			session.setAttribute("usernameExists", "Username already exists");
			res.sendRedirect("register.jsp");
		}

	}

}
