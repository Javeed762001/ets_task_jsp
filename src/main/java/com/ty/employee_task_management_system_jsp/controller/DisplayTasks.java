package com.ty.employee_task_management_system_jsp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.employee_task_management_system_jsp.dao.TaskDao;
import com.ty.employee_task_management_system_jsp.dto.Task;

@WebServlet(value = "/displaytasks")
public class DisplayTasks extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		TaskDao tdao=new TaskDao();
		List<Task> tasks=tdao.displayAllTasks();
		
		req.setAttribute("my_tasks", tasks);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("displaytasks.jsp");
		dispatcher.include(req, res);
		
	}

}
