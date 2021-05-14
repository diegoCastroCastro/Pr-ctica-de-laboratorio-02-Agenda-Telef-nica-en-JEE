package ec.edu.ups.agenda.controlador;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.agenda.clases.Telefono;
import ec.edu.ups.agenda.dao.DAOFactory;
import ec.edu.ups.agenda.dao.UsuarioDAO;

import java.io.IOException;
import java.util.List;

@WebServlet("/listartelefonos")
public class ListarTelefonos  extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private List<Telefono> lisTelefonos;
	
	


	private UsuarioDAO usuarioDAO;
	public ListarTelefonos() {

        usuarioDAO = DAOFactory.getFactory().getUsuarioDAO();
	}




	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("/FormularioRegistro.jsp").forward(request, response);

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
}
