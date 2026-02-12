package ejerciciosMaps;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Mariano Clavero - 12/02/2026
 * Implementa un diccionario usando un Map<String, String>.
Operaciones:
• Añadir palabras
• Buscar traducciones
• Mostrar el diccionario completo
Implementa con TreeMap.
¿Cómo permitirías la presencia de varias definiciones por palabra?

 */
public class Ejercicio5bis {

	public static void main(String[] args) {
		TreeMap<String, ArrayList<String>> diccionario = new TreeMap<>();
		
		agregarPalabras(diccionario, "Hola", "Saludo");
		agregarPalabras(diccionario, "Hola", "Introduccion");
		agregarPalabras(diccionario, "Casa", "Hogar");
		agregarPalabras(diccionario, "Casa", "Vivienda");
		
		// Mostrar diccionario
		mostrarDiccionario(diccionario);
		System.out.println("================");
		// Mostrar definicion
		System.out.println("Definicion: "+buscarDefiniciones(diccionario, "Hola"));
	}
	public static void agregarPalabras (TreeMap<String, ArrayList<String>> diccionario,
			String palabra, String definicion) {
		if (!diccionario.containsKey(palabra)) {
			diccionario.put(palabra, new ArrayList<String>());
		}
		diccionario.get(palabra).add(definicion);
	}
	public static void mostrarDiccionario (TreeMap<String, ArrayList<String>> diccionario) {
		for (Map.Entry<String, ArrayList<String>> entry : diccionario.entrySet()) {
			System.out.println("Palabra: "+entry.getKey()+"\n"+
							"Definicion: "+entry.getValue());
		}
	}
	public static ArrayList<String> buscarDefiniciones (TreeMap<String, ArrayList<String>> diccionario,
			String palabra) {
		if (diccionario.containsKey(palabra)) {
			return diccionario.get(palabra);
		}
		return null;
	}

}
