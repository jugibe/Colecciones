package ejercicios;

import java.util.List;
import java.util.ListIterator;

/*
 * Ejercicio 7.- Recorrido inverso
Objetivo: ListIterator
Muestra una lista de palabras:
• En orden normal
• En orden inverso usando ListIterator
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		List<String> listaPalabras = List.of("Ana", "Pedro", "Juan", "Alberto", "Maria");

		
		ListIterator<String> iterador = listaPalabras.listIterator(listaPalabras.size());
		while(iterador.hasPrevious()) {
			System.out.println(iterador.previous());
		}
	}

}
