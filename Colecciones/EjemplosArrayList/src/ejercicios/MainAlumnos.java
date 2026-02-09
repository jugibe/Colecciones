package ejercicios;

import java.util.ArrayList;

/*
 * 04/02/26
 * David Gil
 * Ejercicio 3.- Crea una clase Alumno con:
• dni
• nombre
• notaMedia
Usa un ArrayList<Alumno> para:
• Añadir alumnos
• Buscar un alumno por DNI
• Eliminar un alumno
• Mostrar todos ordenados por nota media
Pistas: equals(), Comparator, contains()
 */
public class MainAlumnos {

	public static void main(String[] args) {
		//crear la lista
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		//llenar la lista alumnosPrueba
		listaAlumnos.add(new Alumno("123456478Z", "Luis", 8.5));
		listaAlumnos.add(new Alumno("876543221A", "Maria", 7.5));
		listaAlumnos.add(new Alumno("134568452B", "Carlos", 5.5));
		listaAlumnos.add(new Alumno("258461378H", "Hector", 3.5));
		
		//Buscar alumno por dni
		System.out.println(buscarAlumnoDni(listaAlumnos,"123456478Z"));
		
		//Eliminar Alumno
			listaAlumnos.remove(buscarAlumnoDni(listaAlumnos,"876543221A"));
			System.out.println(listaAlumnos);
			
		//Ordenar por nota
			
			listaAlumnos.sort((a1,a2)->a1.getNota().compareTo(a2.getNota())); 
			System.out.println(listaAlumnos);

	}
	private static Alumno buscarAlumnoDni(ArrayList <Alumno>lista, String dni) {
			//recorrer lista
		for (Alumno a: lista) {
			if (a.getDni().equals(dni)) {
				return a;
			}
		}
		return null;
	}
}
