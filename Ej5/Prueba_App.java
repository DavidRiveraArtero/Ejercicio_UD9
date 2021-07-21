package Ejercicio5;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Prueba_App {

	public static void main(String[] args) {
		
		ArrayList<Alumno> listaAprobados = new ArrayList<>();
		ArrayList<Alumno> listaSuspendidos = new ArrayList<>();
		
		Profesor prof = new Profesor();
		String materia=prof.Comprovar_Materia("filosofia");
		Profesor prof2 = new Profesor("Pedro", 25,"Hombre",materia,true);
		System.out.println(prof2);
		
		Aula aul = new Aula(1112,1,materia);
		System.out.println(aul);
		
		//COMPROBAR SI EL PROFE ESTA DISPONIBLE
		if (prof2.Estar_Disponible == true) {
			for (int i = 0; i < aul.Numero_Maximo_Aula; i++) {
				String Nombre = JOptionPane.showInputDialog("DAME EL NOMBRE DEL ALUMNO");
				Integer Edad = Integer.parseInt(JOptionPane.showInputDialog("DAME LA EDAD DEL ALUMNO"));
				String Genero = JOptionPane.showInputDialog("DAME EL GENERO DEL ALUMNO");
				Integer Calificacion = Integer.parseInt(JOptionPane.showInputDialog("DAME LA Calificacion DEL ALUMNO"));
				if (Calificacion < 0) {
					Calificacion = 0;
				}else if (Calificacion > 10) {
					Calificacion = 10;
				}else {
					break;
				}
				if (Calificacion < 5) {	//SI SU NOTA ES INFERIOR A 5 SUSPENDIDO
					Alumno Al = new Alumno(Nombre,Edad,Genero,Calificacion,"Suspendido");
					listaSuspendidos.add(Al);
				}else { //SI SU NOTA ES SUPERIOR A 5 APROBADO
					Alumno Al = new Alumno(Nombre,Edad,Genero,Calificacion,"Aprobado");
					
					listaAprobados.add(Al);
				}
				
			
				
			}
		}else {
			JOptionPane.showInternalMessageDialog(null, "LO SENTIMOS EL PROFESOR NO ESTA DISPONIBLE");
		}
		
		//IMPRIMO LOS ALUMNOS QUE ESTAN APROBADOS
		JOptionPane.showInternalMessageDialog(null, "APROBADOS");
		for (int x = 0; x < listaAprobados.size();x++) {
			JOptionPane.showInternalMessageDialog(null, listaAprobados.get(x));
		}
		//IMPRIMO LOS ALUMNOS QUE ESTAN SUSPENDIDOS
		JOptionPane.showInternalMessageDialog(null, "SUSPENDIDOS");
		for (int x = 0; x < listaSuspendidos.size();x++) {
			JOptionPane.showInternalMessageDialog(null, listaSuspendidos.get(x));
		}
	}
}
