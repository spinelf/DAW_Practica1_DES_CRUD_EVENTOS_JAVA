package modelo.dao;
import java.util.List;
import modelo.javabeans.Tipos;


public interface IntTiposDao {
	
	 Tipos buscarIdTipo(int idTipo);
	 List<Tipos> buscarTodosIdTipos();
	 int altaTipo(Tipos tipos);
	 int editarTipo(Tipos tipos);
	 boolean eliminarTipos(Tipos tipos);
	 int eliminarTipos(int idTipos);
	

}

