package olimpiadas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Olimpiadas {

	public static void main(String[] args) {
		// 
		String[]paises= {"España", "Portugal", "Cuba", "Costa Rica", "Republica Dominicana", "Brasil", "Argentina", "Venezuela", "Chile", "México"};
		String[]pruebas= {"Salto Altura", "100 metros lisos", "Salto de longitud", "Triple salto","200 metros lisos", "110 metros vallas", "maraton", "1500 metros lisos"};
		// Estructura para almacenar el resultado de las pruebas
		HashMap<String, ArrayList<String>> resultados= new HashMap<String, ArrayList<String>>();
		// Llenar los resultados
		// Recorro la lista de pruebas
		for(String p:pruebas) {
			// Añado la clave "p" con una lista vacía
			resultados.put(p, new ArrayList<String>());
			// Añado a esta lista vacía 8 paises al azar
			for(int c=0; c<8;c++) {
				int numero= (int)(Math.random()*paises.length);
				resultados.get(p).add(paises[numero]);
				
			}
		}

		// Imprimir los resultados
		imprimeResultados(resultados);
		// Establecer un ranking de resultados ordenado 1º numero de oros, si empatan en oros, numero de platas, si empatan, numero de bronces
		// Vamos a crear la estructura del ranking vacía
		HashMap<String, Medallero> ranking= new HashMap<String, Medallero>();
		for(String pais:paises) {
			ranking.put(pais, new Medallero(pais));
			
		}
		// Llenamos el ranking con los resultados
		llenarRanking(ranking, resultados);
		
		// Ordenamos el ranking
		mostrarRankingOrdenado(ranking);
	}

	public static void imprimeResultados(HashMap<String, ArrayList<String>> mapa) {
		// Recorro el mapa usando la lista keySet de las claves
		System.out.println("Resultados:");
		System.out.println("*****************");
		for(String clave:mapa.keySet()) {
			System.out.println(clave);
			System.out.println("---------------");
			// Recorro los resultados de esa prueba
			for(String r:mapa.get(clave)) {
				System.out.println(r);
			}
			System.out.println("/////////////");
		}
	}
	
	public static void llenarRanking(HashMap<String, Medallero> ranking, HashMap<String, ArrayList<String>> resultados) {
		// Recorro los resultados
		for(String prueba:resultados.keySet()) {
			// resultados.get(prueba) -> Es el ArrayList con los resultados de dicha prueba
			// resultados.get(prueba).get(0) -> Es el país que ha ganado el oro
			// resultados.get(prueba).get(1) -> Es el país que ha ganado el plata
			// resultados.get(prueba).get(2) -> Es el país que ha ganado el bronce
			ranking.get(resultados.get(prueba).get(0)).addOro();
			ranking.get(resultados.get(prueba).get(1)).addPlata();
			ranking.get(resultados.get(prueba).get(2)).addBronce();

		}
	}
	
	public static void mostrarRankingOrdenado(HashMap<String, Medallero> ranking) {
		
		//puedo ordenar los valores 
		
		
		
		List<Map.Entry<String, Medallero>> lista =
                new ArrayList<>(ranking.entrySet());
		lista.sort((e2, e1)-> e1.getValue().compareTo(e2.getValue()));
		for (Map.Entry <String, Medallero> m:lista) {
			System.out.println(m.getKey());
			System.out.println("/////////////");
			System.out.println("Oros: "+m.getValue().getNumeroOros());
			System.out.println("Platas: "+m.getValue().getNumeroPlatas());
			System.out.println("Bronces: "+m.getValue().getNumeroBronces());
			System.out.println("****************");
		}
	}
}
