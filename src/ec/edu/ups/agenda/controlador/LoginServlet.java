package ec.edu.ups.agenda.controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ec.edu.ups.agenda.clases.Usuario;
import ec.edu.ups.agenda.dao.DAOFactory;
import ec.edu.ups.agenda.dao.UsuarioDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Usuario usuario;
	private UsuarioDAO usuarioDAO;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {

		usuarioDAO = DAOFactory.getFactory().getUsuarioDAO();
		usuario = new Usuario();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String usuar = request.getParameter("correo");
		String password = request.getParameter("password");
		
		usuario.setCorreo(usuar);
		usuario.setContrasenia(password);
		System.out.println("VALORES PASADOS DES >" + usuario.toString());

		Usuario usu = usuarioDAO.login(usuario);
		if (usu != null) {

			HttpSession sesion = request.getSession(true);
			sesion.setAttribute("usuario", usuario.getNombre());
			sesion.setAttribute("cedula", usuario.getCedula());
			System.out.println("sesion TRUE");
			String cedu = usuario.getCedula();
			request.getSession().setAttribute("usuario", usu.getNombre());
			request.getSession().setAttribute("cedula", usu.getCedula());
			request.setAttribute("peticion", "Conectado..");

			RequestDispatcher d = getServletContext().getRequestDispatcher("/sesion");
			d.forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String usuar = request.getParameter("correo");
		String password = request.getParameter("password");
		usuario.setCorreo(usuar);
		usuario.setContrasenia(password);
		System.out.println("VALORES PASADOS DES >" + usuario.toString());

		Usuario usu = usuarioDAO.login(usuario);
		if (usu != null) {

			HttpSession sesion = request.getSession(true);
			sesion.setAttribute("usuario", usuario.getNombre());
			sesion.setAttribute("cedula", usuario.getCedula());
			System.out.println("sesion TRUE");

			RequestDispatcher d = getServletContext().getRequestDispatcher("/sesion");
			d.forward(request, response);
		} else {
			HttpSession sesion = request.getSession(false);
			System.out.println("sesion FALSE");
			RequestDispatcher d = getServletContext().getRequestDispatcher("/errorLogin.jsp");
			d.forward(request, response);

		}

	}

}
