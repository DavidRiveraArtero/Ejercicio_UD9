package Ejercicio2;

import Ejercicio1.Electrodomesticos;

public class UD9_Ej2 {

	public static void main(String[] args) {
		
		//COMPROVAR QUE TIEMPO Y TEMPORADA SEAN LO MISMO
		Videojuego video = new Videojuego();
		Series serie = new Series();
		int horasJ = video.getHoras();
		String tiempoJ = horasJ +"";
		int horasS = serie.getTemporadas();
		String tiempoS = horasS + "";
		
		System.out.println(tiempoS.compareTo(tiempoJ));
		
		
		Videojuego Diccionario[] = new Videojuego[5];
		Series Diccionario2[] = new Series[5];
		
		//JUEGOS
		Diccionario[0]=new Videojuego ("Resident Evil",20,"Accion","Capcom");
		Diccionario[1]=new Videojuego ("Resident Evil 2",23,"Accion","Capcom");
		Diccionario[2]=new Videojuego ("Monster Hunter",40,"Accion","Capcom");
		Diccionario[3]=new Videojuego ("LOL",10000,"Accion","Capcom");
		Diccionario[4]=new Videojuego ("Dota",20,"Accion","Capcom");
		
		//PELICULAS 
		Diccionario2[0]=new Series ("Alien",3,"Accion","Capcom");
		Diccionario2[1]=new Series ("Juego de Tronos",9,"Accion","Capcom");
		Diccionario2[2]=new Series ("Vikingos",6,"Accion","Capcom");
		Diccionario2[3]=new Series ("Los Simpson",20,"Comedia","Capcom");
		Diccionario2[4]=new Series ("Walle",2,"Accion","Capcom");
		
		int mayor = Diccionario[0].Horas;
		String juego = "";
		for (int i = 0; i < Diccionario.length; i++) {
			if (Diccionario[i].Horas > mayor) {
				mayor = Diccionario[i].Horas;
				
			}	
		}
		int mayorS = Diccionario2[0].Temporadas;
		for (int i = 0; i < Diccionario2.length; i++) {
			if (Diccionario2[i].Temporadas > mayorS) {
				mayorS = Diccionario2[i].Temporadas;
				
			}	
		}
		System.out.println("El juego con mayor horas es de: " + mayor);
		System.out.println("La serie con mas temporadas es: " + mayorS);
	}

}
