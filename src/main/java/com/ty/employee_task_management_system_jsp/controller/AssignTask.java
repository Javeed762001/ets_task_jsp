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

@WebServlet(value = "/assign")
public class AssignTask extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter printWriter=res.getWriter();
		
		String tid=req.getParameter("task_id");
		String eid=req.getParameter("emp_id");
		
		int taskid=Integer.parseInt(tid);
		int empid=Integer.parseInt(eid);
		System.out.println(taskid);
		System.out.println(empid);
		
		EmployeeDao empdao=new EmployeeDao();
		
		boolean result=empdao.assignTask(taskid,empid);
		
		if(result==true)
		{
            System.out.println("Task Assigned to Employee");
			
			printWriter.print("<h1> Task Assigned to Employee </h1>");
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("managerpage.jsp");
			dispatcher.include(req, res);
		}
		else
		{
            System.out.println("Failed to Assign");
			
			printWriter.print("<h1> Failed to Assign </h1>");
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("managerpage.jsp");
			dispatcher.include(req, res);
		}
	}
	
}
