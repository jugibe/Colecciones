package ejerciciosMaps;

import java.util.HashMap;
import java.util.Map;

/*
 * Javier Martin 11/02/2026
 * Usa un HashMap<String, String> para guardar nombres y teléfonos
 * Operaciones:
	• Añadir contacto
	• Buscar contacto por nombre
	• Mostrar todos los contactos
 */
public class Ejercicio1 {
	public static void main(String[] args) {
		HashMap<String, String> listado = new HashMap<>();
		//Añadimos datos de prueba 
		listado.put("Javier", "123456");
		listado.put("Mariano", "654312");
		System.out.println(listado.put("Juanjo", "123456"));
		System.out.println(listado.put("Juanjo", "1234567"));
		
		
		//añadir un contacto con el metodo addContacto
		addContacto("Eder", "123456", listado);
		System.out.println(listado);
		//buscar por nombre
		String telefono = buscarContacto("Javier", listado);
		if(telefono==null) {
			System.out.println("Esta persona no esta en la lista");
		}else {
			System.out.println("El telefono es: "+telefono);
		}
		//mostrar todos los contactos de la lista
		mostrarContactos(listado);
	}
	
	public static void addContacto(String nombre, String telef, HashMap<String, String> listado) {
		listado.put(nombre, telef);
	}
	
	public static String buscarContacto(String nombre, HashMap<String, String> listado) {
		return listado.get(nombre);
	}
	
	public static void mostrarContactos(HashMap<String, String> listado) {
		for(String s : listado.keySet()) {
			System.out.printf("Nombre: %-10s Telefono: %-10s \n",s,listado.get(s));
		}
	}
}
