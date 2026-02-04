package conpersonas;

import java.util.Objects;

public class Persona {

    // Atributos de la clase
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters (necesarios para ordenar y mostrar datos)
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // toString() para mostrar el objeto de forma legible
    @Override
    public String toString() {
        return nombre + " - " + edad + " años";
    }

    /*
     * equals():
     * Se usa para comparar si DOS OBJETOS son IGUALES en contenido,
     * no si están en la misma posición de memoria.
     * 
     * Aquí decimos que dos personas son iguales
     * si tienen el mismo nombre y la misma edad.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;           // mismo objeto
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad &&
               nombre.equals(persona.nombre);
    }

    public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	/*
     * hashCode():
     * Devuelve un número que representa al objeto.
     * 
     * Se usa en colecciones como HashSet o HashMap.
     * 
     * Regla MUY IMPORTANTE:
     * Si dos objetos son iguales según equals(),
     * DEBEN tener el MISMO hashCode().
     */
    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }
}
