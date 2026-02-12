package ejerciciosMaps;

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
public class Ejercicio5 {

	public static void main(String[] args) {
		TreeMap<String, String> diccionario = new TreeMap<>();
		
		agregarPalabras(diccionario, "Hola", "saludo");
		agregarPalabras(diccionario, "Adios", "despedida");
		agregarPalabras(diccionario, "Casa", "Hogar de alguien");
		agregarPalabras(diccionario, "Informatica", "Ciencia de la tecnologia");
		
		// Mostrar diccionario
		mostrarDiccionario(diccionario);
		System.out.println("================");
		// Mostrar definicion
		System.out.println("Definicion: "+buscarDefiniciones(diccionario, "Hola"));
	}
	public static void agregarPalabras (TreeMap<String, String> diccionario,
			String palabra, String definicion) {
		if (!diccionario.containsKey(palabra)) { // Este if me impide cambiar la definicion
			diccionario.put(palabra, definicion);
		}
	}
	public static void mostrarDiccionario (TreeMap<String, String> diccionario) {
		for (Map.Entry<String, String> entry : diccionario.entrySet()) {
			System.out.println("Palabra: "+entry.getKey()+"\n"+
							"Definicion: "+entry.getValue());
		}
	}
	public static String buscarDefiniciones (TreeMap<String, String> diccionario,
			String palabra) {
		if (diccionario.containsKey(palabra)) {
			return diccionario.get(palabra);
		}
		return "No existe la palabra";
	}
}
