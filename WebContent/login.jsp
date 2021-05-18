<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen" href="css/estilo.css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" media="screen"
	href="css/estilo.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 
<link rel="stylesheet" type="text/css" media="screen" href="css/FormularioRegistro.css" />

<title>Login</title>
</head>
<body>
<nav class="navbar">

		<div class="container-fluid">
		
			<div class="navbar-header">
				<a class="navbar-brand" href="/Agenda/index.jsp">Agenda</a>
			</div>
			<div class="navbar-header">
				<a class="navbar-brand" href="/Agenda/quienessomos.jsp">Quienes
					Somos</a>
			</div>
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Buscar Persona</a>
			</div>
			 <div class="navbar-header">
				<a class="navbar-brand" href="/Agenda/login.jsp">Login</a>
			</div>

		</div>
	</nav>

	<div id="contenedor1">
		<h1>Sing in</h1>
		<form action="/Agenda/LoginServlet"  method="get" id="form1">
			<img alt="" src="imagenes/login.PNG"> <input type="text"
				name="correo" placeholder="usuario/correo" />
			<hr>
			<img alt="" src="imagenes/login.PNG"> <input type="password"
				name="password" placeholder="Contraseña" />
			<hr>
			<input type="submit" value="Sing in" />
		</form>
	</div>
	<div id="contenedor2">
		<form  method="get" action="/Agenda/CrearUsuarioController" id="form2">
			<input type="submit" value="Create Account" />
		</form>
		<div id="referencias">
			<a>Diego</a> <a href="">Term of use</a> <a href="">Privacy Policy</a>
		</div>
	</div>
</body>
</html>