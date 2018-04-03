

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Todos</title>
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

		<a href="#" class="navbar-brand">ToDo-WebApp</a>

		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="/list-todo.do">Todo's</a></li>
			<li><a target="_blank" href="https://github.com/imtannu">GitHub</a></li>
		</ul>

		<ul class="nav navbar-nav navbar-right">
			<li><a href="/logout.do">LogOut</a></li>
		</ul>

	</nav>

	<div class="container">
		<table align="center">
  <tr>
  <td>
<h1>Welcome ${name}</h1><br>
<h2>Your Todo's are:</h2>

<ol>
<c:forEach items="${todos}" var="todo"> 
<li>${todo} &nbsp;&nbsp;&nbsp;  <a href="/delete-todo.do?todo=${todo}">Delete </a> <br>
 </li>
</c:forEach>
</ol>
<br><br>

<a href="/Addtodo.do"><button>Add New ToDO</button></a>
</td></tr></table>
	</div>

	<footer class="footer">
		<p align="center">CopyRight © 2018</p>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>
