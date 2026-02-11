package ejerciciosMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * Javier Martin 11/02/2026
 * Crea un Map<String, Integer> donde la clave sea el nombre del alumno y el valor su nota.
	Operaciones:
	• Añadir o modificar notas
	• Mostrar los alumnos aprobados
	• Calcular la nota media del grupo
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> notas = new TreeMap<String, Integer>();
		//añadimos unos alumnos de prueba
		notas.put("Javier", 5);
		notas.put("Mariano", 9);
		notas.put("Eder", 8);
		notas.put("Esther", 4);
		notas.put("René", 5);
		mostrarAprobados(notas);
		System.out.println("La nota media es: "+mediaNotas(notas));
		reemplazarNota(notas, "Esther", 7);
		mostrarAprobados(notas);
		ordenarPorNota(notas);
	}
	
	public static void mostrarAprobados(TreeMap<String, Integer> notas) {
		for(String s : notas.keySet()) {
			if(notas.get(s)>=5) {
				System.out.printf("Alumno: %-10s Nota: %-5d \n",s,notas.get(s));
			}
		}
	}
	public static double mediaNotas(TreeMap<String, Integer> notas) {
		double resultado = 0;
		for(String s : notas.keySet()) {
			resultado = resultado+notas.get(s);
		}
		return resultado/notas.size();
	}
	public static void reemplazarNota(TreeMap<String, Integer> notas, String nombre, Integer notaNueva) {
		notas.replace(nombre, notaNueva); //devuelve null si el nombre no existe en el TreeMap
	}
	public static void ordenarPorNota(TreeMap<String, Integer> notas) {
		//transformarlo en una coleccion de Map.Entry
		List<Map.Entry<String, Integer>>notasLista = new ArrayList<>(notas.entrySet());
		notasLista.sort((e1, e2)->e2.getValue().compareTo(e1.getValue()));
		//System.out.println(notas);
		//System.out.println(notasLista);
		for(Map.Entry<String, Integer> m:notasLista) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
