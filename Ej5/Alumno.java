package Ejercicio5;

public class Alumno extends Usuarios_Profes {

	String VeredictoFinal;
	
	public Alumno(String nombre, Integer edad,String sexo,Integer calificacion,String VeredictoFinal) {
		super(nombre,edad,sexo,calificacion);
		this.VeredictoFinal = VeredictoFinal;
	}
	
	

	@Override
	public String toString() {
		return "Alumno [VeredictoFinal=" + VeredictoFinal + ", Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo
				+ ", Calificacion=" + Calificacion + "]";
	}


	
	
	
}
