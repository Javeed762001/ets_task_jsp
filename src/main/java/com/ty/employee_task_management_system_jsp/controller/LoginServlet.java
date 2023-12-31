package com.ty.employee_task_management_system_jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.employee_task_management_system_jsp.dao.EmployeeDao;

@WebServlet(value = "/loginemp")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter printWriter=res.getWriter();
		
		String email=req.getParameter("user_email");
		String password=req.getParameter("user_password");
		
		EmployeeDao empdao=new EmployeeDao();
		boolean result=empdao.findRole(email, password);
		System.out.println(result);
		printWriter.print("<h1> login Successfull </h1>");
		
		if(result==true)
		{
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("managerpage.jsp");
			dispatcher.forward(req, res);
		}
		else
		{
			RequestDispatcher dispatcher=req.getRequestDispatcher("employeepage.jsp");
			dispatcher.forward(req, res);
		}
	}
	
}
