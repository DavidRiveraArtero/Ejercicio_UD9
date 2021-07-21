package Ejercicio1;

public class UD9_Ej1_App {

	public static void main(String[] args) {
		Electrodomesticos ele = new Electrodomesticos ();

		
		

		Electrodomesticos Diccionario[] = new Electrodomesticos[10];

		Diccionario[0]=new Electrodomesticos (100,"Morado","F",19);
		Diccionario[1]=new Lavadora (100,"Morado","F",19, 40);
		Diccionario[2]=new Television (100,"Morado","F",19, 50, false);
		Diccionario[3]=new Electrodomesticos (100,"Morado","F",19);
		Diccionario[4]=new Lavadora (100,"Morado","F",19, 40);
		Diccionario[5]=new Television (100,"Morado","F",19, 50, false);
		Diccionario[6]=new Electrodomesticos (100,"Morado","F",19);
		Diccionario[7]=new Lavadora (100,"Morado","F",19, 40);
		Diccionario[8]=new Television (100,"Morado","F",19, 50, false);
		Diccionario[9]=new Electrodomesticos (100,"Morado","F",19);
		
		System.out.print(Diccionario[8]);
		
	
		
	}

}
