package ec.edu.ups.agenda.filtro;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Filtro
 */
@WebFilter(servletNames={"/Sesion","listartelefonosprivados","crudtelefono","buscarpersona"})
public class Filtro implements Filter {

    /**
     * Default constructor. 
     */
    public Filtro() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	} 
	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		long inicio = System.currentTimeMillis();
		chain.doFilter(request, response);
		System.out.println("INFO: Tiempo de proceso("+(System.currentTimeMillis()-inicio)+" ms");

		System.out.println("SE MUESTRA LA SIGUIENTE CLASE FILTRADA");
		RequestDispatcher dispa = request.getServletContext().getRequestDispatcher("/login.jsp");

		dispa.forward(request, response);
		dispa.include(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
