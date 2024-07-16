package modelo.dao;

import java.util.List;

import modelo.javabeans.Evento;

/**
 * 
 * @author Benjamin Ruiz y Silvia Piñel
 * Creamos la interfaz donde vamos a determinar los métodos que posteriormente tendrán que ser desarrollados
 *
 */

public interface IntEventoDao {
	
	 Evento buscarIdEvento(int idEvento);
	 List<Evento> buscarTodosIdEvento();
	 List<Evento> mostrarActivos();
	 int altaEvento(Evento evento);
	 int editarEvento(Evento evento);
	 boolean eliminarEvento(Evento evento);
	 int eliminarEvento(int idEvento);
	 int cancelarEvento (int idEvento);
	 
	 
}
