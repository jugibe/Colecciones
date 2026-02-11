package ejerciciosMaps;

import java.util.HashMap;
import java.util.Scanner;

/*
 * Javier Martin 11/02/2026
 * Pide al usuario una serie de números.
   Utiliza un Map<Integer, Integer> para contar cuántas veces aparece cada número y muestra el resultado
 */
public class Ejercicio2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		HashMap<Integer, Integer> listado = new HashMap<Integer, Integer>(); 
		do {
			System.out.println("Introduzca un numero: ");
			numero=sc.nextInt();
			if(!listado.containsKey(numero)) {
				listado.put(numero, 0);
			}
			listado.put(numero, listado.get(numero)+1);
			System.out.println(listado);
		}while(numero!=0);
		System.out.println("Fin de programa");
	}
	
}
