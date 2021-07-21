package Ejercicio5;

public class Profesor extends Usuarios_Profes{
	
	//ATRIBUTO
	Boolean Estar_Disponible;
	
	//CONSTRUCTORES
	public Profesor(String nombre,Integer Edad,String Sexo, String Materia, Boolean Estar_Disponible) {
		super(nombre,Edad,Sexo,Materia);
		this.Estar_Disponible = Estar_Disponible;
	}
	
	
	public Profesor(Boolean estar_Disponible) {
		Estar_Disponible = estar_Disponible;
	}


	public Profesor() {
		
	}
	
	//COMPROBAR QUE LA MATERIA ES CORRECTA
	public String Comprovar_Materia(String materia) {
		switch(materia) {
			case("matematicas"):
				break;
			case("filosofia"):
				break;
			case("fisica"):
				break;
			default:
				materia="fisica";
		}
		return materia;
		
	}
	

	public Boolean getEstar_Disponible() {
		return Estar_Disponible;
	}

	public void setEstar_Disponible(Boolean estar_Disponible) {
		Estar_Disponible = estar_Disponible;
	}

	@Override
	public String toString() {
		return "Profesor [Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + ", Materia=" + Materia + "]";
	}
	
	
}
