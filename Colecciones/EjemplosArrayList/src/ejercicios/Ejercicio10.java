package ejercicios;

import java.util.ArrayList;

/**
 * @author Mariano
 * @version 09/02/2026
 * Dada una lista de alumnos:
• Calcula la nota media del grupo
• Obtén la nota máxima y mínima
• Cuenta cuántos alumnos han aprobado
? Pistas: mapToDouble, average, coun
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		//crear la lista
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		//llenar la lista alumnosPrueba
		listaAlumnos.add(new Alumno("123456478Z", "Luis", 3.5));
		listaAlumnos.add(new Alumno("876543221A", "Maria", 7.5));
		listaAlumnos.add(new Alumno("134568452B", "Carlos", 5.5));
		listaAlumnos.add(new Alumno("258461378H", "Hector", 9.5));
		
		System.out.println("La cantidad de alumnos aprobados: "+alumnosAprobados(listaAlumnos));
		
		System.out.println("La nota media es: "+notaMediaGrupo(listaAlumnos));
		
		System.out.println("El alumno de mayor nota es: "+alumnoMayorNota(listaAlumnos));
		
		System.out.println("El alumno de menor nota es: "+alumnoMenorNota(listaAlumnos));

	}
	public static int alumnosAprobados (ArrayList<Alumno> listaAlumnos) {
		int contadorAlumnosAprobados = 0;
		for (Alumno a : listaAlumnos) {
			if (a.getNota() > 5) {
				contadorAlumnosAprobados++;
			}
		}
		return contadorAlumnosAprobados;
	}
	public static Double notaMediaGrupo(ArrayList<Alumno> listaAlumno) {
		Double notaTotal = 0.0;
		for (Alumno a : listaAlumno) {
			notaTotal += a.getNota();
		}
		return notaTotal / listaAlumno.size();
	}
	public static Alumno alumnoMayorNota(ArrayList<Alumno> listaAlumno) {
		Alumno alumno = listaAlumno.get(0);
		for (Alumno a : listaAlumno) {
			if (alumno.getNota() < a.getNota()) {
				alumno = a;
			}
		}
		return alumno;
	}
	public static Alumno alumnoMenorNota(ArrayList<Alumno> listaAlumno) {
		Alumno alumno = listaAlumno.get(0);
		for (Alumno a : listaAlumno) {
			if (alumno.getNota() > a.getNota()) {
				alumno = a;
			}
		}
		return alumno;
	}
}
