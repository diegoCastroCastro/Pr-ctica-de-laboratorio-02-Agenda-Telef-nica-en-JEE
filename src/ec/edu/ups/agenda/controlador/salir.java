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

@WebServlet("/salir")
public class salir extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("SE DEBE DE CERRA SESION");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/// SE CIERA LA SESSION
		request.getSession().invalidate();
		request.getSession(false); 
		RequestDispatcher d = getServletContext().getRequestDispatcher("/index.jsp");
		d.forward(request, response);

	}

	@Override
	public void destroy() {
		System.out.println("Se destruye el Servlet Parametros");
	}

}
