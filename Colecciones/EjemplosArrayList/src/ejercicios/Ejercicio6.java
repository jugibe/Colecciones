package ejercicios;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0 4/2/2026
 * Ejercicio 6.-  Ordenación múltiple
 * Ordena una lista de alumnos:
 * 1. Por nota media (descendente)
 * 2. Si empatan, por nombre (ascendente)
 * Pista: thenComparing()

 */
public class Ejercicio6 {

	public static void main(String[] args) {
		//crear la lista
				ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
				//llenar la lista alumnosPrueba
				listaAlumnos.add(new Alumno("123456478Z", "Luis", 8.5));
				listaAlumnos.add(new Alumno("876543221A", "Maria", 8.5));
				listaAlumnos.add(new Alumno("87654322B", "Ana", 8.5));
				listaAlumnos.add(new Alumno("134568452B", "Carlos", 2.5));
				listaAlumnos.add(new Alumno("258461378H", "Hector", 3.5));
				/*
				listaAlumnos.sort((a,b)->{
				int compNota=-a.getNota().compareTo(b.getNota());
				if(compNota!=0) {
					return compNota;
				}
				else {
					return a.getNombre().compareTo(b.getNombre());
				}
				});
				*/
				
				listaAlumnos.sort(Comparator.comparing(Alumno::getNota).thenComparing(Alumno::getNombre).reversed());
				//reversed() invierte la lista
				System.out.println(listaAlumnos);
				
				
	}

}
