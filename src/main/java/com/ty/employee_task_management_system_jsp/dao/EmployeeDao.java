package com.ty.employee_task_management_system_jsp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.employee_task_management_system_jsp.dto.Employee;
import com.ty.employee_task_management_system_jsp.dto.Task;

public class EmployeeDao {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	TaskDao tdao=new TaskDao();
	
	public boolean registerEmployee(Employee employee)
	{
		et.begin();
		em.persist(employee);
		et.commit();
		return true;
	}
	
	public boolean findRole(String email,String password)
	{
		Query query=em.createQuery("SELECT e FROM Employee e WHERE e.email=?1 AND e.password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		
		List<Employee> emplist=query.getResultList();
		
		if(emplist.size()!=0)
		{
			Employee emp=emplist.get(0);
			if(emp.getRole().equals("Manager"))
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		return false;
	}
	
	public boolean assignTask(int taskid,int empid)
	{
		
		
		Task task=tdao.findTask(taskid);
		if(task!=null)
		{
		 Employee employee=em.find(Employee.class, empid);
		
		if(employee!=null)
		{
		List<Task> tasks=employee.getTasks();
		tasks.add(task);
		employee.setTasks(tasks);
		et.begin();
		em.merge(employee);
		et.commit();
		
		return true;
		}
		else
		{
			return false;
		}
		}
		
		else
		{
			return false;
		}
		
	}
}
