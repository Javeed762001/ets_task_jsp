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
import com.ty.employee_task_management_system_jsp.dto.Employee;

@WebServlet(value = "/registration")
public class RegisterServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter printWriter=res.getWriter();
		
		String name = req.getParameter("user_name");
		String email=req.getParameter("user_email");
		String password=req.getParameter("user_password");
		String role=req.getParameter("user_role");
		String sal=req.getParameter("user_salary");
		
		double salary=Double.parseDouble(sal);
		
		Employee employee=new Employee();
		employee.setName(name);
		employee.setEmail(email);
		employee.setPassword(password);
		employee.setRole(role);
		employee.setSalary(salary);
		
		EmployeeDao empdao=new EmployeeDao();
		
        boolean result=empdao.registerEmployee(employee);
		
		if(result==true)
		{
			System.out.println("user registered successfully");
			
			printWriter.print("<h1> Registration Successfull </h1>");
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
			dispatcher.include(req, res);
		}
		else
		{
			System.out.println("failed to register");
			printWriter.print("<h2> Registration Unsuccessfull </h2>");
		}
	}
}
