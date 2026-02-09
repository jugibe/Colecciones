package streams;

import java.util.ArrayList;
import java.util.List;


public class Ejercicio7 {

	public static void main(String[] args) {
		ArrayList<String> listaPalabras=new ArrayList<String>();
		listaPalabras.add("Hola");
		listaPalabras.add("Adios");
		listaPalabras.add("Caracol");
		listaPalabras.add("Eercedes");
		listaPalabras.add("Lunes");
		/**
		 * A partior de un alista de palabras obtengo otra lista con las longitudes de las palabras
		 */
		List<Integer> longitudPalabras = listaPalabras.stream()
				.map(a->a.length()).toList();
		
		System.out.println(longitudPalabras);
		
		/** sumar todos los caracteres **/
		
		long suma = (listaPalabras.stream()
				.mapToLong(s->s.length()))
				.sum();
		System.out.println(suma);
		
		/** imprimir las palabras que empiecen con vocal en mayusculas **/
		listaPalabras.stream()
			.filter(a->a.matches("[aeiouAEIOU].*"))
			.forEach(System.out::println);

	}

}
