<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
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

<link rel="stylesheet" type="text/css" media="screen"
	href="css/FormularioRegistro.css" />
<title>Telefonos Listados</title>
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
				<a class="navbar-brand" href="/Agenda/BuscarPersona.jsp">Buscar
					Persona</a>
			</div>
			<div class="navbar-header">
				<a class="navbar-brand" href="/Agenda/login.jsp">Login</a>
			</div>
		</div>
	</nav>

	<div class="jumbotron text-center">
		<h1>Resultados de telefono por cedula</h1>
		<ul>  
			<c:forEach var="idioma" items="${p1.listaTelefono}">
				<h1>bucle</h1>
				<li style="color: red">${idioma}</li>
			</c:forEach>
		</ul>
	</div>

</body>
</html>