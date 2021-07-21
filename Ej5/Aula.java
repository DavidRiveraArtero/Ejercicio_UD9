package Ejercicio5;

public class Aula extends Usuarios_Profes{

	Integer Identificador_Aula;
	Integer Numero_Maximo_Aula;
	
	
	public Aula() {
		this.Identificador_Aula=0;
		this.Numero_Maximo_Aula=0;
	}
	
	
	
	public Aula(Integer identificador_Aula, Integer numero_Maximo_Aula, String Materia) {
		super(Materia);
		Identificador_Aula = identificador_Aula;
		Numero_Maximo_Aula = numero_Maximo_Aula;
	}
	



	public Aula(String materia) {
		super(materia);
		
	}

	@Override
	public String toString() {
		return "Aula [Identificador_Aula=" + Identificador_Aula + ", Numero_Maximo_Aula=" + Numero_Maximo_Aula
				+ ", Materia_Aula=" + Materia + "]";
	}
	
	
	
}
