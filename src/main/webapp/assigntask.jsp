<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

  body{
     display:flex;
     justify-content:center;
     align-items: center;
  }

  div{
     height:400px;
     width:400px;
     background-color: bisque;
     margin-top:100px;
  }
  form {

	height:350px;
    width:300px;
    font-weight:bolder;
    font-size: 25px;
  }
  
  legend{
    font-style: italic;
    font-size: 25px;
    font-weight: bold;
  }
 

</style>
</head>

<body>
     
     <div>
     <fieldset>
     <legend>ASSIGN TASKS:</legend>
     <form action="assign">
 
     Task ID:<input type="text", name="task_id">
     <br>
     <br>
     Employee ID:<input type="text", name="emp_id">
     <br>
     <br>
     
     <input type="submit", name="Assign Task">
     
     </form>
   </fieldset>
   </div>
</body>
</html>