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
	
	<form action="/Agenda/CrearUsuarioController" class="form-register" method="post">
		<h4>Formulario Registro</h4>
		<input class="controls" type="text" name="cedula" id="cedula" placeholder="Ingrese su cedula" /><br>
		<input class="controls" type="text" name="nombres" id="nombres" placeholder="Ingrese sus nombres" /><br>
		<input class="controls" type="text" name="apellidos" id="apellidos" placeholder="Ingrese sus apellidos" /><br>
		<input class="controls" type="email" name="correo" id="correo" placeholder="Ingrese su email" /><br>
		<input class="controls" type="password" name="contrasenia" id="contrasenia" placeholder="Ingrese su contraseña" />
		<p>Estoy de acuerdo con <a href="#">Terminos y condiciones</a></p>
		<input class="botons" type="submit" value="Registrar">
		<p><a href="#">¿Ya tengo cuenta?</a></p>
	</form>
	
</body>
</html>