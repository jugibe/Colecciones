package ejercicios;

import java.util.Objects;

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
public class Alumno implements Comparable{
	
	//Podemos usar la clase dni
	private String dni;
	private String nombre;
	private Double nota;
	
	public Alumno(String dni, String nombre, Double nota) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.nota = nota;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre, nota);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	@Override
	public String toString() {
		return "Alumno dni=" + dni + ", nombre=" + nombre + ", nota=" + nota ;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
