package com.jsp.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ResponseCache;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.UserDao;
import com.jsp.entity.User;

@WebServlet(urlPatterns = "/save-user")
public class UserService extends HttpServlet
{
	UserDao dao = new UserDao();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("userName");
		String email=req.getParameter("userEamil");
		String pwd=req.getParameter("userPwd");

		User u=new User();
		u.setUserName(name);
		u.setUserEmail(email);
		u.setPassword(pwd);
		
		UserDao ud=new UserDao();
		String msg=ud.userSave(u);
		PrintWriter pw=resp.getWriter();
		pw.write("<h1>"+msg+"<h1>");
		
		resp.sendRedirect("Home.jsp");
		
	}
	
		

		
		
		
	
	

}
