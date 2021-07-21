package Ejercicio3;


public class UD9_Ej3_App {

	public static void main(String[] args) {
		
		// Creamos dos instancias de la clase Libro
				Libro lib1=new Libro("978-84-450-0068-7", "El Retorno del Rey", "J.R.R. Tolkien", 604);
				Libro lib2=new Libro("978-84-204-6028-4", "Gambito de Dama", "Walter Tevis", 311);
				
				// Mostramos por pantalla
				System.out.println(lib1);
				System.out.println("\n"+lib2+"\n");
				
				// Mostramos cual tiene más paginas usando el metodo compare
				lib2.compare(lib1);		
	
	}

}
