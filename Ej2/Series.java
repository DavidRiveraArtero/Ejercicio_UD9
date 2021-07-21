package Ejercicio2 ;

public class Series implements Entregable{

	protected String Titulo;
	
	protected Integer Temporadas;
	
	protected boolean Entregado;
	
	protected String Genero;
	
	protected String Creador;
	
	
	public Series() {
		this.Temporadas = 10;
		this.Entregado = false;
		this.Titulo = "";
		this.Genero = "";
		this.Creador = "";
		
	}


	public Series(String titulo, Integer temporadas, String genero, String creador) {
		Titulo = titulo;
		Temporadas = temporadas;
		Genero = genero;
		Creador = creador;
	}


	public Series(String titulo, String creador) {
		Titulo = titulo;
		Creador = creador;
	}


	public String getTitulo() {
		return Titulo;
	}


	public void setTitulo(String titulo) {
		Titulo = titulo;
	}


	public Integer getTemporadas() {
		return Temporadas;
	}


	public void setTemporadas(Integer temporadas) {
		Temporadas = temporadas;
	}


	public String getGenero() {
		return Genero;
	}


	public void setGenero(String genero) {
		Genero = genero;
	}


	public String getCreador() {
		return Creador;
	}


	public void setCreador(String creador) {
		Creador = creador;
	}


	@Override
	public String toString() {
		return "Series [Titulo=" + Titulo + ", Temporadas=" + Temporadas + ", Entregado=" + Entregado + ", Genero="
				+ Genero + ", Creador=" + Creador + "]";
	}


	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		Entregado = true;
		
	}


	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		Entregado = false;
	}


	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return Entregado;
	}
	
	
	
	
}
