package ejercicios;

import java.util.ArrayList;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0 4/2/2026
 * Ejercicio 4.-
 * A partir de una lista de alumnos:
 * • Evita añadir alumnos duplicados (mismo DNI)
 * • Muestra un mensaje si se intenta añadir uno repetido
 * Pista: redefinir equals() y usar contains()
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		// Crear lista Alumnos
		GrupoClase c=new GrupoClase("DAM1");
		try {
			c.insertarAlumno(new Alumno ("12345243z","Juan",5.6));
			c.insertarAlumno(new Alumno ("12345246z","Carlos",9.6));
			c.insertarAlumno(new Alumno ("12345245z","Jose",5.5));
			c.insertarAlumno(new Alumno ("12345242z","Jhon",3.6));
			c.insertarAlumno(new Alumno ("12345243z","Juan",5.6));
			System.out.println(c);
		} catch (AlumnoDuplicadoException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(c);
		System.out.println("Fin de programa");
	}

}
