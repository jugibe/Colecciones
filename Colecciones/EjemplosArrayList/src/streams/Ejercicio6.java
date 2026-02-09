package streams;

import java.util.ArrayList;
import java.util.List;

import ejercicios.Alumno;

/**
 * Escribir el nombre de los alumnos en mayusculas
 */
		
public class Ejercicio6 {

	public static void main(String[] args) {
		//crear la lista
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		//llenar la lista alumnosPrueba
		listaAlumnos.add(new Alumno("123456478Z", "Luis", 8.5));
		listaAlumnos.add(new Alumno("876543221A", "Maria", 2.5));
		listaAlumnos.add(new Alumno("134568452B", "Carlos", 5.5));
		listaAlumnos.add(new Alumno("258461378H", "Hector", 3.5));
		
		//Cada elemento de la lista lo escribo en mayuscula
		listaAlumnos.stream().forEach(a->System.out.println(a.getNombre().toUpperCase()));
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
		//Solo escribir en mayuscula los aprobados
		listaAlumnos.stream()
			.filter(a->a.getNota()>=5.0)		
			.forEach(a->System.out.println(a.getNombre().toUpperCase()));
		
		//Lista con los nombres de los alumnos aprobados en mayusculas
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
		List<String> lista=listaAlumnos.stream()
				.filter(a->a.getNota()>7.0)
				.map(a->a.getNombre().toUpperCase())
				.sorted()
				.toList();
				
		System.out.println(lista);


	}

}
