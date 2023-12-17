<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.ty.employee_task_management_system_jsp.dto.Task" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <h1>Tasks Information: </h1>
   <%
   
   List<Task> tasks=(List<Task>)request.getAttribute("my_tasks");
   
   
   %>
   
   <%= tasks %>
   
   
   
</body>
</html>