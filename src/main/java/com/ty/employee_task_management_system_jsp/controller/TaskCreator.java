package com.ty.employee_task_management_system_jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.employee_task_management_system_jsp.dao.TaskDao;
import com.ty.employee_task_management_system_jsp.dto.Task;

@WebServlet(value = "/taskcreation")
public class TaskCreator extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter printWriter=res.getWriter();
		
		String des=req.getParameter("task_des");
		String status=req.getParameter("task_status");
		
		Task task=new Task();
		task.setDescription(des);
		task.setStatus(status);
		
		TaskDao tdao=new TaskDao();
		boolean result=tdao.createTask(task);
		
		if(result==true)
		{
            System.out.println("Task created successfully");
			
			printWriter.print("<h1> Task created successfully </h1>");
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("managerpage.jsp");
			dispatcher.include(req, res);
		}
		else
		{
            System.out.println("Failed to create Task");
			
			printWriter.print("<h1> Failed to create Task </h1>");
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("managerpage.jsp");
			dispatcher.include(req, res);
		}
	}

}
