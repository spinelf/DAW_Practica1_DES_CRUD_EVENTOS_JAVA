package Controlador;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.EventoDaoImpl;
import modelo.dao.IntEventoDao;
import modelo.javabeans.Evento;

/**
 * Servlet implementation class GestionEventos
 */
@WebServlet(description = "Gestion de los eventos", urlPatterns = { "/eventos" })
public class GestionEventos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionEventos() {
        super();
        
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
		
	//la opción elegida a través del jsp index vendrá aquí, donde a través del switch determinará la acción a realizar
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opcion =request.getParameter("opcion");
		switch (opcion) {
			case "alta":
				procAlta(request, response);
				break;
			case "editar":
				procEditar(request, response);
				break;
			case "eliminar":
				procEliminar(request, response);
				break;
			case "activos":
				procActivos(request, response);
				break;
			case "cancelar":
				procCancelar(request, response);
				break;
			default:
				System.out.println("Seleccione una opción correcta");
		}
	
	}
	
	/**
	 * Con el procAlta, creamos un nuevo objeto evento, obtenemos los parámetros con getParameter y los metemos en cada unos
	 * de los campos de evento.
	 * Utilizamos una variable String para guardar el mensaje que vamos a mostrar por pantalla.
	 * Con el request.getRequestDispatcher("inicio") llamamos al HomeControler para que muestre de nuevo la
	 * lista con el mesaje de alta correcta o incorrecta.
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void procAlta (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		IntEventoDao ievento =new EventoDaoImpl();
		Evento evento =new Evento();
		request.getParameter("submit");
		evento.setIdEvento(Integer.parseInt(request.getParameter("id")));
		evento.setNombreEvento(request.getParameter("nombre"));
		evento.setDescripcionEvento(request.getParameter("descripcion"));
		evento.setNombreEvento(request.getParameter("fechaInicio"));
		evento.setDuracionEvento(Integer.parseInt(request.getParameter("duracion")));
		evento.setDireccionEvento(request.getParameter("direccion"));
		evento.setEstadoEvento(request.getParameter("estado"));
		evento.setAforoMaximoEvento(Integer.parseInt(request.getParameter("maximo")));
		evento.setAforoMinimoEvento(Integer.parseInt(request.getParameter("minimo")));
		evento.setPrecioEvento(Double.parseDouble(request.getParameter("precio")));
				
			String mensaje = null;
			if (ievento.altaEvento(evento)==1)
				mensaje = "Alta realizada correctamente";
			else
				mensaje = "Error";
			request.setAttribute("mensaje", mensaje);
			request.getRequestDispatcher("inicio").forward(request, response);
			
	}
	
	/**
	 * En el procedimiento procEditar lo primero que hacemos es convertir el id en entero ya que por el request
	 * nos llega siempre tipo String, esto lo hacemos porque el procedimiento buscarIdevento recibe como parametro
	 * un entero.
	 * 
	 * Ahora para editar deberiamos completar el jsp editar evento pero no nos ha dado tiempo a completarlo.
	 * Con el request.getRequestDispatcher("inicio") llamamos al HomeControler para que muestre de nuevo la
	 * lista.
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void procEditar (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IntEventoDao ievento =new EventoDaoImpl();
		int id =Integer.parseInt(request.getParameter("id"));
		Evento evento = ievento.buscarIdEvento(id);
		request.setAttribute("eventos", evento);
		request.getRequestDispatcher("inicio").forward(request, response);
	}
	
	
	/**
	 * En el procedimiento procEliminar lo primero que hacemos es convertir el id en entero ya que por el request
	 * nos llega siempre tipo String, esto lo hacemos porque el procedimiento eliminarEvento recibe como parametro
	 * un entero. 
	 * 
	 * Con el request.getRequestDispatcher("inicio") llamamos al HomeControler para que muestre de nuevo la
	 * lista.
	 * 
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void procEliminar (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IntEventoDao ievento =new EventoDaoImpl();
		int id =Integer.parseInt(request.getParameter("id"));
		ievento.eliminarEvento(id);
		request.getRequestDispatcher("inicio").forward(request, response);
	}
	
	/**
	 * En el procedimiento procActivos ejecuta el procedimiento mostrar activos que nos muestra 
	 * todos los eventos activos.
	 * 
	 * Con el request.getRequestDispatcher("inicio") llamamos al HomeControler para que muestre de nuevo la
	 * lista.
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void procActivos (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IntEventoDao ievento =new EventoDaoImpl();
		ievento.mostrarActivos();
		request.getRequestDispatcher("inicio").forward(request, response);
	}
	
	/**
	 * En el procedimiento proCancelar lo primero que hacemos es convertir el id en entero ya que por el request
	 * nos llega siempre tipo String, esto lo hacemos porque el procedimiento procCancelar recibe como parametro
	 * un entero. 
	 * 
	 * Con el request.getRequestDispatcher("inicio") llamamos al HomeControler para que muestre de nuevo la
	 * lista.
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void procCancelar (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IntEventoDao ievento =new EventoDaoImpl();
		int id =Integer.parseInt(request.getParameter("id"));
		ievento.cancelarEvento(id);
		request.getRequestDispatcher("inicio").forward(request, response);
	}
}


