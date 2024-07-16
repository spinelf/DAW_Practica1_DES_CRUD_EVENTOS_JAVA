package modelo.javabeans;

import java.io.Serializable;

// Aquí no hemos realizado comentarios ya que no los hemos utilizado para el ejercicio.

public class Tipos implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private int IdTipo;
	private String NombreTipo;
	private String Descripción;
	
	public Tipos() {
		super();
	}

	public Tipos(int idTipo, String nombreTipo, String descripción) {
		super();
		IdTipo = idTipo;
		NombreTipo = nombreTipo;
		Descripción = descripción;
	}

	public int getIdTipo() {
		return IdTipo;
	}

	public void setIdTipo(int idTipo) {
		IdTipo = idTipo;
	}

	public String getNombreTipo() {
		return NombreTipo;
	}

	public void setNombreTipo(String nombreTipo) {
		NombreTipo = nombreTipo;
	}

	public String getDescripción() {
		return Descripción;
	}

	public void setDescripción(String descripción) {
		Descripción = descripción;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + IdTipo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Tipos))
			return false;
		Tipos other = (Tipos) obj;
		if (IdTipo != other.IdTipo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tipos [IdTipo=" + IdTipo + ", NombreTipo=" + NombreTipo + ", Descripción=" + Descripción + "]";
	}
	
	

}
