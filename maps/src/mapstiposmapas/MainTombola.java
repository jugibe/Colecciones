package mapstiposmapas;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * David
 * 9/2/26
 */
public class MainTombola {

	public static void main(String[] args) {
		
		String[]nombres = {"David", "Carlos", "Victor", "Gonzalo", "Evis", "Cristian", "Juanjo"};
		String [] regalos = {"Cromo de futbol","botella de leche","Gafas", "Pañuelos", "Jamon", "Camiseta", "Microondas", "Curso de informatica"};
		
		HashMap<String, ArrayList<String>>mapa = new HashMap<String, ArrayList<String>>();
		for(String regalo:regalos) {
			int ganador=(int)(Math.random()*nombres.length);
			//primero chequear si el ganador esta en el mapa
			if(!mapa.containsKey(nombres[ganador])) {
				mapa.put(nombres[ganador], new ArrayList<String>());
			}
			mapa.get(nombres[ganador]).add(regalo);
		}
		
		
		
		for(String s:mapa.keySet()) {
			System.out.println("Alumno : "+ s + " Regalos "+ mapa.get(s));
		}
		
	}
	

}
