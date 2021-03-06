package curso;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// esto es lo ejecutable

		// crear un ArrayList vac�o
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
				
		// creamos el objeto de la clase Estudiante
		Estudiante estudiante1 = new Estudiante(5, 55, 55555, 0, 0.0, 0.0);
				
		// insertamos el objeto de la clase Estudiante en el ArrayList estudiantes
		estudiantes.add(estudiante1);
		
		//muestra por pantalla el numero de elementos
		System.out.println(estudiantes.size());
		
		// acceder a un elemento por una posici�n y guardarlo como objeto
		Estudiante estudianteGuardado = estudiantes.get(0);
			
		// invocaci�n a un m�todo no est�tico OBJETO.METODO_NO_ESTATICO
		estudiante1.mostrarInfo();
				
		// invocaci�n a un m�todo est�tico: CLASE.METODO_ESTATICO
		Estudiante.crearEstudiante();
		
		//agrega estudiantes con distinto id
		//for (int i = 0; i < 500; i++) {
		//	Estudiante nuevoEstudiante = new Estudiante(i, 55, 55555, 0, 0.0, 0.0);
		//	estudiantes.add(nuevoEstudiante);
		// }
		
		// System.out.println(estudiantes.size());
		
		// recorro el ArrayList desde la posici�n inicial (0) hasta la posici�n final
		// for (int i=0; i<estudiantes.size(); i++) {
		//	Estudiante nuevoEstudiante = estudiantes.get(i); //con el get extraemos del array
		//	System.out.printf("id: %d", nuevoEstudiante.getId()).println();
			//System.out.println(estudiante1.getId());
	//	}
		
		
		// insertamos 500 estudiantes dentro del ArrayList estudiantes
	for (int i = 0; i<500; i++ ) {
		estudiantes.add(new Estudiante(i, 55, 55555, 0, 0.0, 0.0));
	}
		
		// invocaci�n a un m�todo no est�tico OBJETO.METODO_NO_ESTATICO
//		estudiante1.mostrarInfo();
		
		// invocaci�n a un m�todo est�tico: CLASE.METODO_ESTATICO
//		Estudiante.crearEstudiante();

	}

}

