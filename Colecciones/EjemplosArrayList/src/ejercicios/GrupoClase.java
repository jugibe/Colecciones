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
public class GrupoClase {
	//Atributos
	private ArrayList<Alumno>listaAlumnos=new ArrayList<Alumno>();
	private String nombreClase;
	/**
	 * @param nombreClase
	 */
	public GrupoClase(String nombreClase) {
		this.nombreClase = nombreClase;
	}
	
	public void insertarAlumno(Alumno a) throws AlumnoDuplicadoException{
		//permite alumnos con el mismo dni pero distinto nombre
		if (listaAlumnos.contains(a)){throw new AlumnoDuplicadoException();}
		
		/*
		 * no  permite alumos con el mismo dni aunque el nombre sea distinto
		for (Alumno alumno : listaAlumnos) {
			if(a.getDni().equals(alumno.getDni())) {
				throw new AlumnoDuplicadoException();
			}
		}
		*/
		
		listaAlumnos.add(a);
	}
	public ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}
	public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	public String getNombreClase() {
		return nombreClase;
	}
	public void setNombreClase(String nombreClase) {
		this.nombreClase = nombreClase;
	}
	@Override
	public String toString() {
		return "GrupoClase [listaAlumnos=" + listaAlumnos + ", nombreClase=" + nombreClase + "]";
	}
	
	
}
