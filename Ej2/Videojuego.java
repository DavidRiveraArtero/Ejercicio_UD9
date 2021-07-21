package Ejercicio2;

public class Videojuego implements Entregable{
	
	//ATRIVUTOS
	protected String Titulo;
	protected Integer Horas;
	protected boolean Entregado;
	protected String Genero;
	protected String Compañia;
	
	public Videojuego() {
		this.Horas = 10;
		this.Entregado = false;
		this.Titulo = "";
		this.Genero = "";
		this.Compañia = "";
	}

	public Videojuego(String titulo, Integer horas) {
		super();
		Titulo = titulo;
		Horas = horas;
	}

	public Videojuego(String titulo, Integer horas, String genero, String compañia) {
		
		this.Titulo = titulo;
		this.Horas = horas;
		this.Genero = genero;
		this.Compañia = compañia;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public Integer getHoras() {
		return Horas;
	}

	public void setHoras(Integer horas) {
		Horas = horas;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getCompañia() {
		return Compañia;
	}

	public void setCompañia(String compañia) {
		Compañia = compañia;
	}

	@Override
	public String toString() {
		return "Videojuego [Titulo=" + Titulo + ", Horas=" + Horas + ", Entregado=" + Entregado + ", Genero=" + Genero
				+ ", Compañia=" + Compañia + "]";
	}

	@Override
	public void entregar() {
		Entregado = true;
		
	}

	@Override
	public void devolver() {
		Entregado = false;
		
	}

	@Override
	public boolean isEntregado() {
		return Entregado;
		
	}
	
	
	
}
