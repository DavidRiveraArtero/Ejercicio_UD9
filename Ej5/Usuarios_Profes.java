package Ejercicio5;

public class Usuarios_Profes {

	//ATRIBUTOS
	protected String Nombre;
	protected Integer Edad;
	protected String Sexo;
	protected Integer Calificacion;
	protected String Materia;
	
	public Usuarios_Profes() {
		this.Nombre="";
		this.Edad=0;
		this.Sexo="";
		this.Calificacion=0;
		this.Materia="";
	}

	public Usuarios_Profes(String nombre, Integer edad, String sexo, Integer calificacion,String materia) {
		Nombre = nombre;
		Edad = edad;
		Sexo = sexo;
		Calificacion = calificacion;
		Materia = materia;
	}
	

	public Usuarios_Profes(String nombre, Integer edad, String sexo, Integer calificacion) {
		
		Nombre = nombre;
		Edad = edad;
		Sexo = sexo;
		Calificacion = calificacion;
	}
	
	

	public Usuarios_Profes(String nombre, Integer edad, String sexo, String materia) {
		
		Nombre = nombre;
		Edad = edad;
		Sexo = sexo;
		Materia = materia;
	}
	
	

	public Usuarios_Profes(String materia) {
		Materia = materia;
	}

	//Getters y Setters
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Integer getEdad() {
		return Edad;
	}

	public void setEdad(Integer edad) {
		Edad = edad;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public Integer getCalificacion() {
		return Calificacion;
	}

	public void setCalificacion(Integer calificacion) {
		Calificacion = calificacion;
	}

	public String getMateria() {
		return Materia;
	}

	public void setMateria(String materia) {
		Materia = materia;
	}
	
	
	@Override
	public String toString() {
		return "Usuarios_Profes [Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + ", Calificacion="
				+ Calificacion + ", Materia=" + Materia + "]";
	}

	
	
}
