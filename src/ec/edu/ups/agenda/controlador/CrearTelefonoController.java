package ec.edu.ups.agenda.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.agenda.dao.TelefonoDAO;
import ec.edu.ups.agenda.dao.UsuarioDAO;
import ec.edu.ups.agenda.clases.Telefono;
import ec.edu.ups.agenda.clases.Usuario;
import ec.edu.ups.agenda.dao.DAOFactory;

/**
 * Servlet implementation class CrearUsuarioController
 */
@WebServlet("/CrearTelefonoController")
public class CrearTelefonoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TelefonoDAO telefonoDAO;

	private UsuarioDAO usuarioDAO;
	private List<Telefono> listaTelefono;
	private Usuario usuario;
	private Telefono telefono;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CrearTelefonoController() {
		telefonoDAO = DAOFactory.getFactory().getTelefonoDAO();
		usuarioDAO = DAOFactory.getFactory().getUsuarioDAO();
		usuario = new Usuario();
		telefono = new Telefono();
		listaTelefono = new ArrayList<Telefono>();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("ESTE ES LA CEDULA QUE SE RECIBE > " + request.getParameter("cedula"));
		//String ced = request.getParameter("cedula");
		//usuario.setCedula(ced);

		listaTelefono = telefonoDAO.find1(request.getParameter("cedula"));
		System.out.println("-------------" + listaTelefono.toString());

		if (listaTelefono != null) {
			if (request.getSession().getAttribute("usuario") != null
					&& request.getSession().getAttribute("cedula") != null) {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.println("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>\r\n" + "\r\n" + "<!DOCTYPE html>\r\n"
						+ "<html>\r\n" + "<head>\r\n" + "<meta charset=\"ISO-8859-1\">\r\n"
						+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
						+ "<link rel=\"stylesheet\"\r\n"
						+ "	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n"
						+ "<script\r\n"
						+ "	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n"
						+ "<script\r\n"
						+ "	src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n"
						+ "<script\r\n"
						+ "	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n"
						+ "<link rel=\"stylesheet\"\r\n"
						+ "	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n"
						+ "<script\r\n"
						+ "	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n"
						+ "<script\r\n"
						+ "	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n"
						+ "<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\"\r\n"
						+ "	href=\"css/estilo.css\" />\r\n" + "<link rel=\"stylesheet\"\r\n"
						+ "	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n"
						+ "\r\n" + "<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\"\r\n"
						+ "	href=\"css/FormularioRegistro.css\" />\r\n" + "<title>Telefonos Listados</title>\r\n"
						+ "</head>\r\n" + "<body>\r\n" + "\r\n");
				out.println("<p ><span style='color: black'>Usuario: </span><span style='color: red'>"
						+ request.getSession().getAttribute("usuario") + "</span>     "
						+ "<span style='color: black'>Cedula: </span><span style='color: red'> "
						+ request.getSession().getAttribute("cedula") + "</span>" + "</p>");

				out.print("	<nav class=\"navbar\">\r\n" + "\r\n"
						+ "		<div class=\"navbar-header\">\\r\\n\" + \r\n"
						+ "				\"				<a class=\"navbar-brand\" href=\"/Agenda/sesion\">Agenda</a>\\r\\n\" + \r\n"
						+ "				\"			</div>\\r\\n\" + \r\n"
						+ "				\"			<div class=\"navbar-header\">\\r\\n\" + \r\n"
						+ "				\"				<a class=\"navbar-brand\" href=\"/Agenda/crudtelefono\">Telefonos</a>\\r\\n\" + \r\n"
						+ "				\"			</div>\\r\\n\" + \r\n"
						+ "				\"			<div class=\"navbar-header\">\\r\\n\" + \r\n"
						+ "				\"				<a class=\"navbar-brand\" href=\"/Agenda/buscarpersona\">Buscar Persona</a>\\r\\n\" + \r\n"
						+ "				\"			</div>\" + \r\n"
						+ "				\"			 <div class=\"navbar-header\">\\r\\n\" + \r\n"
						+ "				\"				<a class=\"navbar-brand\" href=\"/Agenda/salir\">Cerrar Sesion</a>\\r\\n\" + \r\n"
						+ "				\"			</div>\r\n" + "	</nav>\r\n" + "\r\n"
						+ "	<div class=\"jumbotron text-center\">\r\n"
						+ "		<h1>Resultados de telefono por cedula</h1>\r\n");

				for (Telefono telefono : listaTelefono) {
					out.println("<div class='lis'>"); 
					out.println("<h5>Numero :" + telefono.getNumero() + "</h5>");
					out.println("<h5>Tipo :" + telefono.getTipo() + "</h5>");
					out.println("<h5>Operadora :" + telefono.getOperadora() + "</h5>");
					out.println("</div>");

				}
				out.println("					\"	</div>\\r\\n\"\r\n"
						+ "					+ \"<div id='verlista'></div>\" + \r\n" + "				\r\n"
						+ "					\"\\r\\n\" + \r\n" + "					\"</body>\\r\\n\" + \r\n"
						+ "					\"</html>\"");
				 

			} else {
				RequestDispatcher d = getServletContext().getRequestDispatcher("/login.jsp");
				d.forward(request, response);
			}

		} else {
			getServletContext().getRequestDispatcher("/Error.jsp").forward(request, response);

			response.getWriter().append("Served at: ").append(request.getContextPath());

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = null;
		try {
			telefono.setNumero(request.getParameter("numero"));
			telefono.setOperadora(request.getParameter("operadora"));
			telefono.setTipo(request.getParameter("tipo"));
			
			Integer cedu = Integer.parseInt(request.getParameter("cedula"));
			System.out.println("Valor de ced > "+cedu);
			usuario = usuarioDAO.read(cedu);
			System.out.println("VALOR DESDE EL CREAR TELEFONO > "+usuario.toString());
			telefono.setUsuario(usuario);
			
			telefonoDAO.crear(telefono);

			System.out.println("Registro: " + telefono.toString() + ",");

			url = "/indexprivado.jsp";

		} catch (Exception e) {
			url = "/Error.jsp";
		}

		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}
