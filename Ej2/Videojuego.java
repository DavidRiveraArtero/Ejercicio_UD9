package Ejercicio2;

public class Videojuego implements Entregable{
	
	//ATRIVUTOS
	protected String Titulo;
	protected Integer Horas;
	protected boolean Entregado;
	protected String Genero;
	protected String Compa�ia;
	
	public Videojuego() {
		this.Horas = 10;
		this.Entregado = false;
		this.Titulo = "";
		this.Genero = "";
		this.Compa�ia = "";
	}

	public Videojuego(String titulo, Integer horas) {
		super();
		Titulo = titulo;
		Horas = horas;
	}

	public Videojuego(String titulo, Integer horas, String genero, String compa�ia) {
		
		this.Titulo = titulo;
		this.Horas = horas;
		this.Genero = genero;
		this.Compa�ia = compa�ia;
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

	public String getCompa�ia() {
		return Compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		Compa�ia = compa�ia;
	}

	@Override
	public String toString() {
		return "Videojuego [Titulo=" + Titulo + ", Horas=" + Horas + ", Entregado=" + Entregado + ", Genero=" + Genero
				+ ", Compa�ia=" + Compa�ia + "]";
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
