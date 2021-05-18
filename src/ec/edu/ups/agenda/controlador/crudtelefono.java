/**
 * 
 */
package ec.edu.ups.agenda.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author ADMINX *
 */

@WebServlet("/crudtelefono")
public class crudtelefono extends HttpServlet {
	
	
	@Override
	public void init() throws ServletException{
		System.out.println("Se instancia crud Telefono");
	}
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		if (request.getSession().getAttribute("usuario") != null
				&& request.getSession().getAttribute("cedula") != null) {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("\r\n" + 
				"<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
				"<link rel=\"stylesheet\"\r\n" + 
				"	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n" + 
				"<script\r\n" + 
				"	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n" + 
				"<script\r\n" + 
				"	src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n" + 
				"<script\r\n" + 
				"	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n" + 
				"<link rel=\"stylesheet\"\r\n" + 
				"	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n" + 
				"<script\r\n" + 
				"	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n" + 
				"<script\r\n" + 
				"	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n" + 
				"<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\"\r\n" + 
				"	href=\"css/estilo.css\" />\r\n" + 
				"<link rel=\"stylesheet\"\r\n" + 
				"	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n" + 
				" \r\n" + 
				"<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/FormularioRegistro.css\" />\r\n" + 
				"<title>Login</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" );

		out.println("<p ><span style='color: black'>Usuario: </span><span style='color: red'>"+ request.getSession().getAttribute("usuario")+"</span>     "+"<span style='color: black'>Cedula: </span><span style='color: red'> "+ request.getSession().getAttribute("cedula") +"</span>"+"</p>");
		 
		out.println(
				"	<nav class=\"navbar\">\r\n" + 
				"\r\n" + 
				"		<div class=\"container-fluid\">\r\n" + 
				"		\r\n" + 
				"			<div class=\"navbar-header\">\r\n" + 
				"				<a class=\"navbar-brand\" href=\"/Agenda/indexprivado.jsp\">Inicio</a>\r\n" + 
				"			</div>\r\n" + 
				"			<div class=\"navbar-header\">\r\n" + 
				"				<a class=\"navbar-brand\" href=\"/Agenda/formularioTelefono\">Crer Telefono</a>\r\n" + 
				"			</div>\r\n" + 
				"			<div class=\"navbar-header\">\r\n" + 
				"				<a class=\"navbar-brand\" href=\"/Agenda/BuscarPersona.jsp\">Eliminar Telefonos</a>\r\n" + 
				"			</div>\r\n" + 
				"			 <div class=\"navbar-header\">\r\n" + 
				"				<a class=\"navbar-brand\" href=\"/Agenda/login.jsp\">Actualizar Telefono</a>\r\n" + 
				"			</div>\r\n");
		out.println(
				 "  <div class=\"navbar-header\"> <a class=\"navbar-brand\" href=\"/Agenda/listartelefonosprivados\">Listar Telefonos</a> " + "</div>" );
		out.println(
				
				"\r\n" + 
				"		</div>\r\n" + 
				"	</nav>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"	<div class=\"jumbotron text-center\">\r\n" + 
				"		<h1>Bienvenido a Agenda Telefonica</h1>\r\n" + 
				"		<p>Esto es una practica de JEE usando bootstrap y estilos css</p>\r\n" + 
				"	</div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>");
		} else {
			RequestDispatcher d = getServletContext().getRequestDispatcher("/login.jsp");
			d.forward(request, response);
		}
		
	
		}

	@Override
	public void destroy() {
		System.out.println("Se destruye el Servlet Parametros");
	}

	

}
