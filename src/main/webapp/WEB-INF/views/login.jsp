

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

  <title>LogIn</title>
  
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
	.footer {
		position: absolute;
		bottom: 0;
		width: 100%;
		height: 60px;
		background-color: #f5f5f5;
	}
</style>
</head>

<body>	

	<nav class="navbar navbar-default">

		<a href="/" class="navbar-brand">ToDo-WebApp</a>

		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="/list-todo.do">Todo's</a></li>
			<li><a target="_blank" href="https://github.com/imtannu">GitHub</a></li>
		</ul>

		<ul class="nav navbar-nav navbar-right">
			<li><a href="/login.do">Login</a></li>
		</ul>

	</nav>

	<div class="container">
	
  <form action="/login.do" method="POST">
  <table align="center">
  <tr>
  <td>
   <h1> LOGIN</h1><br>
       <h3> ${error} </h3><br>
      UserName:&nbsp;&nbsp;&nbsp;<input type="text" name="name"/> <br> <br>
      
       Password:&nbsp;&nbsp;&nbsp;&nbsp; <input type="password" name="password"/> <br><br>
       
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <input type="submit" value="LogIn">
          </td>
          </tr>
         </table>
     </form>
	</div>

	<footer class="footer" >
		<p align="center">CopyRight © 2018</p>
		<p align="center">UserName: TanVeeR  Password: tanveer </p>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>


     
     
   