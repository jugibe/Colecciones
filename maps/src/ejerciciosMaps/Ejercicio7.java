package ejerciciosMaps;

import java.util.TreeMap;

/**
 * Ejercicio 7.- Contador de letras
Dado un String introducido por el usuario, utiliza un Map<Character, Integer> para contar cuántas veces 
aparece cada letra.

@author Eder Gracia - 12/2/26
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		String palabra= "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos electrónicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creación de las hojas \"Letraset\", las cuales contenian pasajes de Lorem Ipsum, y más recientemente con software de autoedición, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.";
		palabra = procesarPalabra(palabra);
		
		
		TreeMap<Character, Integer> contadores = new TreeMap<>();
		
		for (int i = 0; i<palabra.length(); i++) {
			if (!contadores.containsKey(palabra.charAt(i))) {
				contadores.put(palabra.charAt(i), 1);	
			} else {
			contadores.put(palabra.charAt(i), contadores.get(palabra.charAt(i))+1);
			}
		}
			
		
		System.out.println(contadores);
	}
	
	/**
	 * elimina todo lo que no sean caracteres
	 * @param palabra
	 * @return
	 */
	private static String procesarPalabra(String palabra) {
		palabra = palabra.toUpperCase();
		String resultado = "";
		for (int i = 0; i<palabra.length(); i++) {
			if (Character.isAlphabetic(palabra.charAt(i))){
				resultado = resultado + palabra.charAt(i);
			}
		}
		
		
		return resultado;
	}

	
}
