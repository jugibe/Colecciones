package streams;

import java.util.ArrayList;

import ejercicios.Alumno;

public class Ejemplo2SumarNotas {
	public static void main(String[] args) {
		//crear la lista
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		//llenar la lista alumnosPrueba
		listaAlumnos.add(new Alumno("123456478Z", "Luis", 8.5));
		listaAlumnos.add(new Alumno("876543221A", "Maria", 7.5));
		listaAlumnos.add(new Alumno("134568452B", "Carlos", 5.5));
		listaAlumnos.add(new Alumno("258461378H", "Hector", 3.5));
		
		Double suma = listaAlumnos.stream().mapToDouble(Alumno::getNota).sum();
		
		System.out.println(suma);
	}
}
