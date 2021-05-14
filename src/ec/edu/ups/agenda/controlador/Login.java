/**
 * 
 */
package ec.edu.ups.agenda.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ADMINX *
 */
@WebServlet("/login")
public class Login extends HttpServlet {
private static final long serialVersionUID = 1L;
	 
	@Override
	public void init() throws ServletException{
		System.out.println("Se instancia el Servlet...");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("lLLEGO UNA PETICION GET");
		String web = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n" + 
				"\"http://www.w3.org/TR/html4/loose.dtd\">\r\n" + 
				"\r\n" + 
				"<html>\r\n" + 
				"	<head>\r\n" + 
				"                                <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1256\">\r\n" + 
				"		<title>Login </title>\r\n" + 
				"	</head>\r\n" + 
				"\r\n" + 
				"	<body>\r\n" + 
				"		<form action=\"inicio\">\r\n" + 
				"\r\n" + 
				"			Usuario 		\r\n" + 
				"			<input type=\"text\" name=\"un\"/><br>		\r\n" + 
				"		\r\n" + 
				"			Contraseña\r\n" + 
				"			<input type=\"text\" name=\"pw\"/><br>\r\n" + 
				"			\r\n" + 
				"			<input type=\"submit\" value=\"submit\">			\r\n" + 
				"		\r\n" + 
				"		</form>\r\n" + 
				"	</body>\r\n" + 
				"</html>";
		response.setContentType("text/html");
		response.getWriter().append(web);
	}
 
	
	@Override
	public void destroy() {
		
		System.out.println("Se destruye el Servlet");
	}
	 
}
