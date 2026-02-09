package ejercicios;

import java.util.ArrayList;
import java.util.ListIterator;

import conpersonas.Persona;

/**
 *@author Carlos Abraham Chavarri Valera
 *@version 1.0 4/2/2026
 * Ejercicio 5.-
+ Dada una lista de alumnos:
+ • Elimina los alumnos con nota media < 5
+ • Muestra la lista antes y después

 */
public class Ejercicio5 {

	public static void main(String[] args) {
		//crear la lista
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		//llenar la lista alumnosPrueba
		listaAlumnos.add(new Alumno("123456478Z", "Luis", 1.5));
		listaAlumnos.add(new Alumno("876543221A", "Maria", 2.5));
		listaAlumnos.add(new Alumno("134568452B", "Carlos", 5.5));
		listaAlumnos.add(new Alumno("258461378H", "Hector", 3.5));
		/*
		for(Alumno a:listaAlumnos) {
			if (a.getNota()<5) {
				System.out.println(a+ "borrado");
				listaAlumnos.remove(a);}
		}
		*/
		System.out.println(listaAlumnos);
		/*ListIterator<Alumno> itl=listaAlumnos.listIterator();
		while(itl.hasNext()) {
			Alumno a=itl.next();
			if(a.getNota()<=5.0) {
				System.out.println(a);
				itl.remove(); //El que borra es el iterador no la lista
			}
		}*/
		
		listaAlumnos.removeIf(a -> a.getNota() <= 5.0);
		System.out.println(listaAlumnos);
		
	}

}
