package Ejercicio3;

public class Libro {

	// Atributos
	
	private String isbn;
	private String titulo;
	private String autor;
	private int pags;
	
	// Constructores
	
	public Libro() {
		this.autor="";
		this.isbn="";
		this.pags=0;
		this.titulo="";
	}

	public Libro(String isbn, String titulo, String autor, int pags) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.pags = pags;
	}
	
	// Metodo de comparar paginas con otro objeto libro
	
	public void compare(Libro lib) {
		if(lib.getPags()<this.pags) {
			// Si nuestro libro tiene mas paginas, lo imprimimos
			System.out.println("'"+this.titulo+"' tiene más páginas que '"+lib.getTitulo()+"'\n");
		}else if(lib.getPags()>this.pags) {
			// Si el libro a comparar es el que tiene mas, imprimimos ese
			System.out.println("'"+lib.getTitulo()+"' tiene más páginas que '"+this.titulo+"'\n");
		}else {
			// Si entramos en el else es que son iguales
			System.out.println("Los dos libros tienen "+this.pags+" páginas");
		}
	}

	// Getters y Setters
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPags() {
		return pags;
	}

	public void setPags(int pags) {
		this.pags = pags;
	}
	
	// Metodo toString

	@Override
	public String toString() {
		return "El libro '"+titulo+"' con ISBN "+isbn+" creado por el autor "+autor+" tiene "+pags+" paginas";
	}

	
	
}

