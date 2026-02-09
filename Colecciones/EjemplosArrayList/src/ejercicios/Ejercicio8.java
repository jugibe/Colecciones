package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * Ejercicio 8.- Transformación de datos
Dada una lista de nombres:
• Convierte todos los nombres a mayúsculas
• Crea una nueva lista con la longitud de cada nombre
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		ArrayList<String> listaPalabras = new ArrayList<String>();
		listaPalabras.add("Ana");
		listaPalabras.add("Pedro");
		listaPalabras.add("Juan");
		listaPalabras.add("Alberto");
		listaPalabras.add("Maria");

		ArrayList<Integer> listaEnteros = new ArrayList<>();
			
		
		ListIterator<String> iterador = listaPalabras.listIterator();
		while (iterador.hasNext()) {
			String s = iterador.next();
			iterador.set(s.toUpperCase());
			
			listaEnteros.add(s.length());
			
		}
		System.out.println(listaPalabras);
		System.out.println(listaEnteros);

		

	}

}
