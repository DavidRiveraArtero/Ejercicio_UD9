package Ejercicio4;

public class UD9_Ej4_App {

	public static void main(String[] args) {
		Raices rai = new Raices (1, -5, 6);
		double posibles = rai.getDiscrimante(1, -5, 6);
		
		if ( posibles < 0) {
			System.out.println("No hay soluciones");
			
		}else if (posibles == 0){
			System.out.println("Solo hay una solucion");
			System.out.println(rai.obtenerRaices(1, -5, 6, rai.getDiscrimante(1, -5, 6)));
			System.out.println(rai.tieneRaiz(rai.getDiscrimante(1, -5, 6)));
			
		}else {
			System.out.println("Hay mas de una solucion");
			System.out.println(rai.tieneRaices(rai.getDiscrimante(1, -5, 6)));
			System.out.println(rai.obtenerRaices(1, -5, 6, rai.getDiscrimante(1, -5, 6)));
		}
		
		
		

	}

}
