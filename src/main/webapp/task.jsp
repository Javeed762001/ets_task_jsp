<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task Creation</title>
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
     <legend>TASK GENERATOR:</legend>
     <form action="taskcreation">
 
     Description:<input type="text", name="task_des">
     <br>
     <br>
     Status:<input type="text", name="task_status">
     <br>
     <br>
     
     <input type="submit", name="create Task">
     
     </form>
   </fieldset>
   </div>
</body>

</html>