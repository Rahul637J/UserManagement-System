package com.jsp.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.UserDao;
import com.jsp.entity.User;

@WebServlet(urlPatterns = "fetch")
public class getUserById extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
//		user.setUserId(Integer.parseInt(req.getParameter("id")));
//		user.setUserName(req.getParameter("userName"));
//		user.setUserEmail(req.getParameter("userEmail"));
//		user.setPassword(req.getParameter("userPwd"));
		
		int userId=Integer.parseInt(req.getParameter("id"));
		UserDao ud=new UserDao();
		User user=ud.getUserBYId(userId);
		
		req.setAttribute("user", user);
		req.getRequestDispatcher("Home.jsp").forward(req, resp);
		
	}
}
