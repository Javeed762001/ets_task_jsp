<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ETS</title>
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
    font-style: italic;
    font-size: 25px;
  }
  
  legend{
    font-style: italic;
    font-size: 25px;
    font-weight: bold;
  }
 

</style>

</head>

<body >
     
     <div>
     <fieldset>
     <legend>Employee Registration:</legend>
     <form action="registration">
   
     Name:<input type="text", name="user_name">
     <br>
     <br>
     Email:<input type="text", name="user_email">
     <br>
     <br>
     Password:<input type="password", name="user_password">
     <br>
     <br>
      Role:<input type="text", name="user_role">
     <br>
     <br>
      Salary:<input type="number", name="user_salary">
     <br>
     <br>
     
     <input type="submit", name="Register Employee">
     
   </form>
   </fieldset>
   </div>
</body>

</html>