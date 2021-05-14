<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen" href="css/FormularioRegistro.css" />
<title>Formulario Registro</title>
</head>
<body>
	
	<form action="/Agenda/CrearTelefonoController" class="form-register" method="post">
		<h4>Formulario Telefono</h4>
		<input class="controls" type="text" name="cedula" id="cedula" placeholder="Ingrese su cedula" /><br>
		<input class="controls" type="text" name="numero" id="nombres" placeholder="Ingrese numero" /><br>
		<input class="controls" type="text" name="operadora" id="apellidos" placeholder="Ingrese tipo" /><br>
		<input class="controls" type="text" name="tipo" id="correo" placeholder="Ingrese su operadora" /><br>
		<input class="botons" type="submit" value="Crear Telefono"> 
	</form>
	
</body>
</html>