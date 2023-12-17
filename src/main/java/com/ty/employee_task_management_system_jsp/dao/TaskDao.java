package com.ty.employee_task_management_system_jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.employee_task_management_system_jsp.dto.Employee;
import com.ty.employee_task_management_system_jsp.dto.Task;

public class TaskDao {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public boolean createTask(Task task)
	{
		et.begin();
		em.persist(task);
		et.commit();
		return true;
	}
	
	public Task findTask(int tid)
	{
		Task task=em.find(Task.class, tid);
		return task;
	}
	
	public List<Task> displayAllTasks()
	{
		Query query=em.createQuery("SELECT t FROM Task t");
		List<Task> tasks=query.getResultList();
		return tasks;
	}
	
}
