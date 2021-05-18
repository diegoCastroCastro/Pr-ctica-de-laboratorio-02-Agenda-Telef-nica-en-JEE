package ec.edu.ups.agenda.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.agenda.clases.Usuario;
import ec.edu.ups.agenda.dao.DAOFactory;
import ec.edu.ups.agenda.dao.UsuarioDAO;

/**
 * Servlet implementation class BuscarPersonaController
 */
@WebServlet("/BuscarPersonaController")
public class BuscarUsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioDAO usuarioDAO;
	private Usuario usuario;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarUsuarioController() {
    	usuarioDAO = DAOFactory.getFactory().getUsuarioDAO();
    	usuario = new Usuario();
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
		String url = null;
		
		try {
			int id = Integer.valueOf(request.getParameter("id"));
			usuario = usuarioDAO.read(id);
			request.setAttribute("usuario", usuario);
			url = "/BuscarUsuario.jsp";
		} catch (Exception e) {
			url = "/Error.jsp";
		}
		
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}
