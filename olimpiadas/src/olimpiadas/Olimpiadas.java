package olimpiadas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Olimpiadas {

	public static void main(String[] args) {
		String[] paises = { "España", "Alemania", "Francia", "Italia", "Rusia", "Grecia", "Hungría", "EE.UU",
				"Nicaragua", "Venezuela" };
		String[] pruebas = { "100 metros lisos", "200 metros lisos", "400 metros lisos", "800 metros lisos",
				"1500 metros lisos", "salto de longitud", "salto de altura", "triple salto", "salto de pertiga",
				"maraton" };

		// crear una estructura que permita almacenar los resultados de las olimpiadas
		Map<String, ArrayList<String>> resultados = new HashMap<>();

		// llenar el mapa de resultados al azar (puede repetir un pais en una prueba,
		// los 8 primeros puestos)
		for (int i = 0; i < pruebas.length; i++) {
			// crear la entrada del mapa con la lista vacia
			resultados.put(pruebas[i], new ArrayList<String>());

			// llenamos esa lista con 8 paises al azar
			for (int j = 0; j < 8; j++) {
				int numero = (int) (Math.random() * (paises.length));
				resultados.get(pruebas[i]).add(paises[numero]);
			}
		}
		// crear un metodo que ponga PRUEBA x, POSICIONES x1,x2,x3... por linea
		// imprimirResultados(resultados);

		// medallero por paises (ranking)
		// segun los oros
		// si hay empate por oros, nº de platas
		// si hay empate por platas, nº de bronces
		Map<String, Medallero> ranking = new TreeMap<>();
		inicializarRanking(ranking, paises);
		llenarMedallero(ranking, resultados);
		imprimirRankingOrdenado(ranking);
		

	}

	public static void inicializarRanking(Map<String, Medallero> ranking, String[] paises) {
		for (String p : paises) {
			ranking.put(p, new Medallero(p));
		}
	}

	public static void llenarMedallero(Map<String, Medallero> ranking, Map<String, ArrayList<String>> resultados) {
		// recorrer resultados
		for (String prueba : resultados.keySet()) {
			// resultados.get(prueba) --> esto es la lista con los resultados de la prueba
			// resultados.get(prueba).get(0) --> pais que ha ganado el oro
			// resultados.get(prueba).get(1) --> pais que ha ganado la plata
			// resultados.get(prueba).get(2) --> pais que ha ganado el bronce
			ranking.get(resultados.get(prueba).get(0)).addOro();
			ranking.get(resultados.get(prueba).get(1)).addPlata();
			ranking.get(resultados.get(prueba).get(2)).addBronce();
		}
	}

	public static void imprimirResultados(Map<String, ArrayList<String>> resultados) {
		System.out.println("--- RESULTADOS ---");
		// recorremos el mapa con los resultados
		// lo vamos a recorrer con las claves
		for (String p : resultados.keySet()) {
			System.out.println(p);
			// recorro la lista con los resultados de cada prueba
			int contador = 1;

			for (String r : resultados.get(p)) {
				System.out.println(contador + " " + r);
				contador++;
			}
			System.out.println("*************");
		}
	}
	
	public static void imprimirRankingOrdenado(Map<String, Medallero> ranking) {
		/*
		 * Forma 1.- extraer del mapa la collection con los valores
		 * 
		 */
		Collection<Medallero> lista =  ranking.values();//obtengo la collection con los medalleros
		
		lista.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		/*
		 * Forma 2.- ordenar la lista Map.Entry
		 */
		
		List<Map.Entry<String, Medallero>> lista2 = new ArrayList<>(ranking.entrySet());
		lista2.sort((a,b)->b.getValue().compareTo(a.getValue()));
		for(Map.Entry<String, Medallero> mp:lista2){
			System.out.println("Pais"+mp.getValue().getPais());
			System.out.println("########################");
			System.out.println("Oros"+mp.getValue().getOro());
			System.out.println("Plata"+mp.getValue().getPlata());
			System.out.println("Bronce"+mp.getValue().getBronce());
			System.out.println("///////////////////////////////");
		}
		
	}
}
