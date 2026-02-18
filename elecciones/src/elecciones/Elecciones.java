package elecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Programa que simula el calcuilo de escaños en unas elecciones
 * simulando la Ley D’Hondt 
 * Fecha: 18/02/2026
 */
public class Elecciones {
	//Numero de escaños
	private static final Integer  ESCANOS=8;
	public static void main(String[] args) {
		//Numero de escaños
		final Integer  ESCANOS=8;
		//Listado de partidos
		String [] listaPartidos= {"Rojo","Amarillo", "Verde", "Azul", "blanco"};
		//EStructura para guardar los votos totales
		Map<String,Integer> votosTotales =new TreeMap<>();//ordenara por orden alfabético de Partidos
		//Inventa los votos obtenidos por cada partido
		inicilizarValores(listaPartidos,votosTotales);
		//mostrar los votos totales ordenados de mas a menos votos
		//mostrarVotosOrdenados(votosTotales);
		
		//Estructura cocientes
		Map<String, ArrayList<Integer>> cocientes = generaCocientes(votosTotales);
		System.out.println(cocientes);
		
		

	}

	
/**
 * Genera los cocientes para calcular los escaños
 * @param votosTotales
 * @return
 */
	private static Map<String, ArrayList<Integer>> generaCocientes(Map<String, Integer> votosTotales) {
		Map<String, ArrayList<Integer>> resultados=new HashMap<String, ArrayList<Integer>>();
		//resultados.get("partido") lista de cocientes
		for(Map.Entry<String, Integer> mp: votosTotales.entrySet()) {
			//mp.getkey() partido
			//mp.getValue() votos totales
			resultados.put(mp.getKey(), new ArrayList<Integer>());
			for(int i=1;i<= ESCANOS; i++) {
				resultados.get(mp.getKey()).add(mp.getValue()/i);
			}
		}
		
		return resultados;
	}



	/**
	 * Metodo que muestra la lista de partidos y votos ordenados de mas a menos votos
	 * @param votosTotales
	 */
	private static void mostrarVotosOrdenados(Map<String, Integer> votosTotales) {
		//Genero un list de objetos Map.Entry
		ArrayList<Map.Entry<String, Integer>> resultadosVotos =new ArrayList<>(votosTotales.entrySet());
		//ordeno la lista
		resultadosVotos.sort((a,b)->b.getValue().compareTo(a.getValue()));	
		//Muestro la lista ordenada
		System.out.println("Resultados por votos obtenidos");
		System.out.println("###############################");
		for(Map.Entry<String,Integer> me:resultadosVotos) {
			System.out.println("Partido "+ me.getKey());
			System.out.println("Votos "+ me.getValue());
		}	
	}

	/**
	 * Metodo que genera al azar los votos totales para cad partido entre 10000 y 20000
	 * @param listaPartidos
	 * @param votosTotales
	 */
	private static void inicilizarValores(String[] listaPartidos, Map<String, Integer> votosTotales) {
		for(String s:listaPartidos) {
			votosTotales.put(s,(int) (Math.random()*10000+10000));
		}	
	}

}
