package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.EventoDaoImpl;
import modelo.dao.IntEventoDao;
import modelo.javabeans.Evento;

/**
 * Servlet implementation class HomeControler
 */
@WebServlet("/inicio")
public class HomeControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	
    /**
     * El procedimiento service es el que nos permite cada vez que se llame a inicio, 
     * se cargara de nuevo la lista.
     * 
     */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IntEventoDao eventdao =new EventoDaoImpl();
		List<Evento> lista = eventdao.buscarTodosIdEvento();
		request.setAttribute("eventos", lista);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
