<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <!-- Popper JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script> 
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="css/bootstrap.min.css">   		
        <script src="js/bootstrap.min.js"></script> 
<title>Registro de cliente</title>
</head>
<body>
<h2 style="background-color:lavender;" class="text-center header">AGENDA TELEFONICA</h2>
<form   action="Calculadora.jsp" method="post" role="form" data-toggle="validator" style="background-color:orange;">
  <label for="ced"><h3>Cedula:</h3></label>
  <input type="text" id="ced"  class="btn btn-primary btn-lg" placeholder="Escriba su cedula" name="cedula"><br><br>
  <label for="nom"><h3>Nombre:</h3></label>
  <input type="text" id="nom" class="btn btn-primary btn-lg" placeholder="Escriba su nombre" name="nombre"><br><br>
  <label for="ape"><h3>Apellido:</h3></label>
  <input type="text" id="ape" class="btn btn-primary btn-lg" placeholder="Escriba su apellido" name="apellido"><br><br>
  <label for="cor"><h3>Correo:</h3></label>
  <input type="text" id="cor" class="btn btn-primary btn-lg" placeholder="Escriba su correo" name="correo"><br><br>
  <label for="con"><h3>Contraseña:</h3></label>
  <input type="password" id="con" class="btn btn-primary btn-lg" placeholder="Escriba su contraseña" name="contra"><br><br>
  
  <input type="submit"  value="Crear Cuenta"><br></br> 
</form>
</body>
</html>