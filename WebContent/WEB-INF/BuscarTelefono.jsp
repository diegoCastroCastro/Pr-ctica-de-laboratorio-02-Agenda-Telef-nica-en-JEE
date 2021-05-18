<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Telefono encontrado</title>
</head>
<body>
	<c:set var="t" scope="request" value="${telefono}" />
	<h1>Telefono encontrado</h1>
	
	<p>Cedula: ${t.cedula}</p>
	<p>Cedula: ${t.numero}</p>
	<p>Cedula: ${t.tipo}</p>
	<p>Cedula: ${t.operadora}</p>
	
	<a href="/Agenda/index.html">Regresar al index</a>

</body>
</html>