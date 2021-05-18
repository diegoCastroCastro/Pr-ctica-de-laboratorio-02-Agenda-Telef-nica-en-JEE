/**
 * 
 */
package ec.edu.ups.agenda.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author ADMINX *
 */

@WebServlet("/sesion")
public class Sesion extends HttpServlet {
	
	
	@Override
	public void init() throws ServletException{
		System.out.println("Se instancia Parametros servlet");
	}
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
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
				"				<a class=\"navbar-brand\" href=\"/Agenda/index.jsp\">Agenda</a>\r\n" + 
				"			</div>\r\n" + 
				"			<div class=\"navbar-header\">\r\n" + 
				"				<a class=\"navbar-brand\" href=\"/Agenda/crudtelefono\">Telefonos</a>\r\n" + 
				"			</div>\r\n" + 
				"			<div class=\"navbar-header\">\r\n" + 
				"				<a class=\"navbar-brand\" href=\"/Agenda/BuscarPersona.jsp\">Chat</a>\r\n" + 
				"			</div>\r\n" + 
				"			 <div class=\"navbar-header\">\r\n" + 
				"				<a class=\"navbar-brand\" href=\"/Agenda/login.jsp\">Cerrar Sesion</a>\r\n" + 
				"			</div>\r\n" + 
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
		
	
		}

	@Override
	public void destroy() {
		System.out.println("Se destruye el Servlet Parametros");
	}

	
	/*
	HttpSession session; 
	
	@Override
	public void init() throws ServletException{
		System.out.println("Se instancia Parametros servlet");
	}
	 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
  		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		 
		 
		int num = 0;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>SESIONES</title></head><body>");
		session = request.getSession(true);
		if(session.isNew()) {
			out.println("<h1>GRACIAS POR ACCEDER A LA CALCULADORA</h1>");
			out.println("<h1>Gracias por acceder a la calculadora</h1>");
			String user =(String) session.getAttribute("usuario");
			String cedu =(String) session.getAttribute("cedula");
			out.println("<p>Usuario:" +user+"</p>");
			out.println("<p>Cedula :"+cedu+"</p>");
			out.println("<p>Identificador de sesion:" +session.getId()+"</p>");
			out.println("<p>Fecha de creacion: "+new Date(session.getCreationTime())+" </p>");
			
			out.println("<p>Fecha del ultimo acceso: "+new Date(session.getLastAccessedTime())+" </p>");
			num = (Integer) session.getAttribute("accesos");
			out.println("<p> Acesos realizados: "+num+"</p>");
			out.println("<a href=\"#\">Cerrar Sesion</a>");
			session.setAttribute("accesos", num+1);
			
		}else {
			out.println("<h1>Gracias por acceder a la calculadora</h1>");
			String user =(String) session.getAttribute("usuario");
			String cedu =(String) session.getAttribute("cedula");
			out.println("<p>Usuario:" +user+"</p>");
			out.println("<p>Cedula :"+cedu+"</p>");
			out.println("<p>Identificador de sesion:" +session.getId()+"</p>");
			out.println("<p>Fecha de creacion: "+new Date(session.getCreationTime())+" </p>");
			
			out.println("<p>Fecha del ultimo acceso: "+new Date(session.getLastAccessedTime())+" </p>");
			num = (Integer) session.getAttribute("accesos");
			out.println("<p> Acesos realizados: "+num+"</p>");
			out.println("<a href=\"#\">Cerrar Sesion</a>");
			session.setAttribute("accesos", num+1);
			
		}
		out.println("</body></html>");
		
		
		
	}



	@Override
	public void destroy() {  
		System.out.println("Se destruye el Servlet Parametros");
	}*/

}
