package modelo.dao;

import java.util.List;
import java.util.ArrayList;
import modelo.javabeans.Evento;
import java.util.Date;

public class EventoDaoImpl implements IntEventoDao{
	//creamos una lista donde vamos a cargar los eventos, hacemos esto por no tener acceso a BBDD
	private List<Evento> lista;
	
	public EventoDaoImpl () {
		
		lista= new ArrayList <Evento>();
		cargardatos();
	}

	private void cargardatos () {
		
		IntTiposDao itipos = new TiposDaoImpl();
		
		lista.add(new Evento (1,"Concierto","Música clásica",new Date(),90,"Palacio de los deportes","activo","S",10000,100,80.00,itipos.buscarIdTipo(2)));
		lista.add(new Evento (2,"Despedida","Despedida Antonio",new Date(),600,"Discoteca Kapital","activo","",15,3,70.00,itipos.buscarIdTipo(4)));
		lista.add(new Evento (3,"Cumpleaños","Cumple de Maria",new Date(),300,"Calle de los Charcos 8","activo","",10,2,10.00,itipos.buscarIdTipo(3)));
		lista.add(new Evento (4,"Boda","Boda de Angel y Andrea",new Date(),600,"Finca los Martinez","activo","S",150,0,250.00,itipos.buscarIdTipo(1)));
		}
	
	// Al implementar la interfaz IntEventoDao implementamos todos los métodos de la misma, desarrollándolos.
	 
	
	/**
	 * El procedimiento buscarIdEvento utiliza la función indexOf para ver si un elemento existe o no.
	 * @param recibe un entero que es id del evento para poder realizar la búsqueda.
	 * @return nos devuelve un nulo si no encuentra el elemento o bien la posición si lo encuentra.
	 */
	@Override
	public Evento buscarIdEvento(int idEvento) {
		Evento event = new Evento();
		event.setIdEvento(idEvento);
		int posicion = lista.indexOf(event);
		if (posicion == -1)
			return null;
		else
			return lista.get(posicion);
		}

	/**
	 * El procedimiento buscarTodosIdEvento nos devuelve la lista completa de todos los eventos.
	 * 
	 */
	@Override
	public List<Evento> buscarTodosIdEvento() {
		return lista;
	}

	/**
	 * mostrarActivos es un procedimiento que recorre la lista de todos los eventos creando otra lista
	 * alternativa donde se introducen todos los eventos activos.
	 * @return nos devuelve la lista con los eventod activos.
	 * 
	 */
	@Override
	public List<Evento> mostrarActivos() {
		
		List<Evento> activos =new ArrayList<>();
		for (Evento ele:lista) {
			if (ele.getEstadoEvento().equals ("Activo")) 
				activos.add(ele);		
		}
		return activos;
	}

	/**
	 * El procedimiento altaEvento nos añade un nuevo elemento si este no existe y si existe nos devuelve 0.
	 * @param recibe un objeto evento.
	 * @return nos devuelve un 1 si ha añadido el elemento y un 0 si no lo ha hecho.
	 */
	@Override
	public int altaEvento(Evento evento) {
	
		if (!lista.contains(evento)) {
			lista.add(evento);
			return 1;
			}
		else
			return 0;			
	}

	/**
	 * Recibe un objeto evento, y extraigo su posicion en la lista con indexOf, una vez obtenida la posición
	 * lo modifica.
	 * @return si no existe me devuelve 0 (indexOf devuelve -1 pero return 0),en el caso en el que 
	 * exista, me devolverá 1 si se realiza la edicion del Evento o 0 si no se ha realizado	
	 */
	
	@Override
	public int editarEvento(Evento evento) {
		int posicion = lista.indexOf(evento);
		if (posicion == -1)
			return 0;
		else
			return (lista.set(posicion,evento)!= null)?1:0;			
	}

	/**
	 * El procedimiento EliminaEvento nos elimina un evento, el procedimiento lo elimina directamente.
	 * @param recibe un objeto evento.
	 * @return Si el evento se ha eliminado correctamente nos devuelve true, en caso contrario 
	 * nos devolverá false.
	 */
	@Override
	
	public boolean eliminarEvento(Evento evento) {
		return lista.remove(evento); 	
	}
	
	/**
	 * El procedimiento EliminaEvento nos elimina un evento, el procedimiento lo elimina directamente.
	 * @param recibe un entero idEvento.
	 * @return si no existe me devuelve 0 (indexOf devuelve -1 pero return 0),en el caso en el que 
	 * exista, me devolverá 1 si se realiza la eliminacion del Evento o 0 si no se ha realizado	
	 */
	
	@Override
	public int eliminarEvento(int idEvento) {
	
			Evento event = new Evento();
			event.setIdEvento(idEvento);
			int posicion = lista.indexOf(event);
			if (posicion == -1)
				return 0;
			else
				if (lista.remove(posicion)!=null) 
						return 1;
				
				else 
						return 0;
	}

	/**
	 * El procedimiento cancelarEvento nos pone el EstadoEvento como cancelado, 
	 * lo que afectaraa la lista de activos que no aparecerá.
	 * 
	 * @param recibe un entero que se corresponde con el id de un evento.
	 * @return nos devuelve 0 si el evento no existe o 1 si lo ha puesto correctamente como Cancelado.
	 */
	
	@Override
	public int cancelarEvento(int idEvento) {
		Evento event = buscarIdEvento(idEvento);
						
		if (event == null)
			return 0;
		else
			event.setEstadoEvento("Cancelado");
			return 1;
	}
	
}
	
	
	
	