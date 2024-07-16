package modelo.dao;
import java.util.List;
import java.util.ArrayList;

import modelo.javabeans.Tipos;



public class TiposDaoImpl implements IntTiposDao{
	
	private List<Tipos> lista;
	
	public TiposDaoImpl () {
		
		lista= new ArrayList <>();
		cargardatos();
	}
	
	private void cargardatos () {
		lista.add(new Tipos (1,"Boda","Celebraciones de bodas"));
		lista.add(new Tipos (2,"Conciertos","Celebraciones de conciertos"));
		lista.add(new Tipos (3,"Cumpleaños","Celebraciones de cumpleaños infantiles"));
		lista.add(new Tipos (4,"Despedidas","Celebraciones de despedidas de solter@s"));
	}

	@Override
	public Tipos buscarIdTipo(int idTipo) {
		Tipos tipo = new Tipos();
		tipo.setIdTipo(idTipo);
		int posicion = lista.indexOf(tipo);
		if (posicion == -1)
			return null;
		else
			return lista.get(posicion);
	}

	
	

	@Override
	public List<Tipos> buscarTodosIdTipos() {
		
		return lista;
	}

	@Override
	public int altaTipo(Tipos tipos) {
		if (!lista.contains(tipos)) {
			lista.add(tipos);
			return 1;
			}
		else
			return 0;
	}

	@Override
	public int editarTipo(Tipos tipos) {
		int posicion = lista.indexOf(tipos);
		if (posicion == -1)
			return 0;
		else
			return (lista.set(posicion,tipos)!= null)?1:0;
	}

	

	@Override
	public boolean eliminarTipos(Tipos tipos) {
		
		return lista.remove(tipos);
	}

	@Override
	public int eliminarTipos(int idTipo) {
		Tipos tipo = new Tipos();
		tipo.setIdTipo(idTipo);
		int posicion = lista.indexOf(tipo);
		if (posicion == -1)
			return 0;
		else
			if (lista.remove(posicion)!=null) 
					return 1;
			
			else 
					return 0;
	}

	
	
	
	
}
