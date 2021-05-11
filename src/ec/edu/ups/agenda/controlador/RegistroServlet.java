package ec.edu.ups.agenda.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ec.edu.ups.agenda.conexion.ConexionMySQL;

/**
 * Servlet implementation class RegistroServlet
 */
@WebServlet("/RegistroServlet")
public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = (HttpSession)request.getSession();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String cedula = request.getParameter("cedula");
		String nombres = request.getParameter("nombres");
		String apellidos = request.getParameter("apellidos");
		String correo = request.getParameter("correo");
		String contrasenia = request.getParameter("contrasenia");
		
		System.out.println("Cuenta: " + cedula + " " + " " + nombres + " " + apellidos + " " + correo + " " + contrasenia );
		ConexionMySQL bd = new ConexionMySQL();
		try {
			bd.Conectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sql = "INSERT INTO usuarios";
		out.println("<h3>Usuario Creado</h3>");
		RequestDispatcher d = request.getRequestDispatcher("index.jsp");
		d.include(request, response);
		out.close();
		
	
	}

}
