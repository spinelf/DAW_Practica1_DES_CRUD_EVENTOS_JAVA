package modelo.javabeans;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * @author Benjamin Ruiz y Silvia Piñel
 * @creamos la clase evento, que debe implementar 
 * la interfaz Serializable que facilitará el almacenamiento 
 * y la transmisión del estado del objeto.
 *
 */
public class Evento implements Serializable {

	private static final long serialVersionUID = 1L;
	private int IdEvento;
	private String NombreEvento;
	private String DescripcionEvento;
	private Date FechaInicioEvento;
	private int DuracionEvento;
	private String DireccionEvento;
	private String EstadoEvento;
	private String DestacadoEvento;
	private int AforoMaximoEvento;
	private int AforoMinimoEvento;
	private double PrecioEvento;
	private Tipos tipos;
	
	//el constructor por defecto es indispensable
	public Evento() {
		super();
	}

	//el constructor con dos los parámetros.
	
	public Evento(int idEvento, String nombreEvento, String descripcionEvento, Date fechaInicioEvento,
			int duracionEvento, String direccionEvento, String estadoEvento, String destacadoevento,
			int aforoMaximoEvento, int aforoMinimoEvento, double precioEvento, Tipos tipos) {
		super();
		IdEvento = idEvento;
		NombreEvento = nombreEvento;
		DescripcionEvento = descripcionEvento;
		FechaInicioEvento = fechaInicioEvento;
		DuracionEvento = duracionEvento;
		DireccionEvento = direccionEvento;
		EstadoEvento = estadoEvento;
		DestacadoEvento = destacadoevento;
		AforoMaximoEvento = aforoMaximoEvento;
		AforoMinimoEvento = aforoMinimoEvento;
		PrecioEvento = precioEvento;
		this.tipos = tipos;
	}

	//Los getters y los setters
	
	public int getIdEvento() {
		return IdEvento;
	}

	public void setIdEvento(int idEvento) {
		IdEvento = idEvento;
	}

	public String getNombreEvento() {
		return NombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		NombreEvento = nombreEvento;
	}

	public String getDescripcionEvento() {
		return DescripcionEvento;
	}

	public void setDescripcionEvento(String descripcionEvento) {
		DescripcionEvento = descripcionEvento;
	}

	public Date getFechaInicioEvento() {
		return FechaInicioEvento;
	}

	public void setFechaInicioEvento(Date fechaInicioEvento) {
		FechaInicioEvento = fechaInicioEvento;
	}

	public int getDuracionEvento() {
		return DuracionEvento;
	}

	public void setDuracionEvento(int duracionEvento) {
		DuracionEvento = duracionEvento;
	}

	public String getDireccionEvento() {
		return DireccionEvento;
	}

	public void setDireccionEvento(String direccionEvento) {
		DireccionEvento = direccionEvento;
	}

	public String getEstadoEvento() {
		return EstadoEvento;
	}

	public void setEstadoEvento(String estadoEvento) {
		EstadoEvento = estadoEvento;
	}

	public String getDestacadoEvento() {
		return DestacadoEvento;
	}

	public void setDestacadoEvento(String destacadoEvento) {
		DestacadoEvento = destacadoEvento;
	}

	public int getAforoMaximoEvento() {
		return AforoMaximoEvento;
	}

	public void setAforoMaximoEvento(int aforoMaximoEvento) {
		AforoMaximoEvento = aforoMaximoEvento;
	}

	public int getAforoMinimoEvento() {
		return AforoMinimoEvento;
	}

	public void setAforoMinimoEvento(int aforoMinimoEvento) {
		AforoMinimoEvento = aforoMinimoEvento;
	}

	public double getPrecioEvento() {
		return PrecioEvento;
	}

	public void setPrecioEvento(double precioEvento) {
		PrecioEvento = precioEvento;
	}

	public Tipos getTipos() {
		return tipos;
	}

	public void setTipos(Tipos tipos) {
		this.tipos = tipos;
	}

	/*Porcesimiento toString por si queremos mostrar algun dato en consola y los procedimientos para poder
	realizar conparaciones mediante el id*/

	@Override
	public String toString() {
		return "Evento [IdEvento=" + IdEvento + ", NombreEvento=" + NombreEvento + ", DescripcionEvento="
				+ DescripcionEvento + ", FechaInicioEvento=" + FechaInicioEvento + ", DuracionEvento=" + DuracionEvento
				+ ", DireccionEvento=" + DireccionEvento + ", EstadoEvento=" + EstadoEvento + ", DestacadoEvento="
				+ DestacadoEvento + ", AforoMaximoEvento=" + AforoMaximoEvento + ", AforoMinimoEvento="
				+ AforoMinimoEvento + ", PrecioEvento=" + PrecioEvento + ", tipos=" + tipos + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + IdEvento;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Evento))
			return false;
		Evento other = (Evento) obj;
		if (IdEvento != other.IdEvento)
			return false;
		return true;
	}


	
	
}
	