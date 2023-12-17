<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manager Page</title>

<style type="text/css">

  body{
    display: flex;
    align-items: center;
    justify-content: space-around;
  }

  nav{
    background-color: bisque;
    height: 700px;
    width:100%;
    display: flex;
    align-items: center;
    justify-content: space-around;
  }
  
  div{
    height:100px;
    width:130px;
    background-color: white;
    display: flex;
    align-items: center;
    justify-content: space-around;
    font-weight: bolder;
    
  }

</style>
</head>
<body>

   <h1>Manager DashBoard</h1>
   <nav>
     
     
     <div>
     
     <a href="register.jsp"> Add Employee </a>
     
     </div>
     
     <div>
     
     <a href="task.jsp"> create Task </a>
     
     </div>
     
     <div>
     
     <a href="assigntask.jsp"> Assign Task </a>
     
     </div>
     
     <div>
     
     <a href="displaytasks"> Display All Tasks </a>
     
     </div>
     
     <div >
     
     <a href=""> Display All Employees </a>
     
     </div>
     
     
   </nav>
</body>
</html>