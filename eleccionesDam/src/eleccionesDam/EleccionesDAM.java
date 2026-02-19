package eleccionesDam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EleccionesDAM {
	private final static Integer ESCANOS=8;
	public static void main(String[] args) {
		//partidos
		String[] partidos = {"Azul","Morado","Verde","Blanco","Negro"};
		
		//Estructura para almacenar los votos
		
		Map<String, Integer> votos = new HashMap<String,Integer>();
		
		//Inventar datos
		
		inventarDatos(votos,partidos);
		//metodo que imprime los votos totales ordenados de el que mas al que menos
		
		//imprimir partidos y escaños ordeanados por escaños de mas a menos escaños
		//generar la estructura de cocientes
		Map <String,ArrayList<Integer>>cocientes= generarCocientes(votos);
		System.out.println(cocientes);
		//estructura de datos para guardar el resultado definitivo de escaños
		Map<String,Integer>resultadoEscanos=new HashMap<String, Integer>();
		
		for(int i=0; i<ESCANOS;i++) {
			
			String pe = sacarEscano(cocientes);
			
			if(!resultadoEscanos.containsKey(pe)) {
				resultadoEscanos.put(pe, 0);
			}
			resultadoEscanos.put(pe, resultadoEscanos.get(pe)+1);
		}
		
		mostrarEscanosOrdenados(resultadoEscanos);
		
		

	}
	private static void mostrarEscanosOrdenados(Map<String, Integer> resultadoEscanos) {
		
		//mostrar mapa ordenado por valor
		
		ArrayList<Map.Entry<String, Integer>>listaOrdenada= new ArrayList<Map.Entry<String,Integer>>(resultadoEscanos.entrySet());
		//ordeno la lista
		listaOrdenada.sort((b,a)->a.getValue().compareTo(b.getValue()));
		for(Map.Entry<String, Integer> mp: listaOrdenada) {
			System.out.println("Partido: "+mp.getKey()+" /Escaños: "+mp.getValue());
		}
		
	}
	//String , metodo que me devulve el partido al que le corresponde el escaño
	private static String sacarEscano(Map<String, ArrayList<Integer>> cocientes) {

		String partido="";
		Integer numMayor=0;
		
		for( String p: cocientes.keySet()) {
			
			if(cocientes.get(p).get(0)>numMayor) {
				numMayor=cocientes.get(p).get(0);
				partido=p;
			}
		}
		//Debo quitar el cociente mayor de la lista
		
		cocientes.get(partido).remove(0);
		
		return partido;
	}
//generar estructura de cocientes
	
	private static Map<String, ArrayList<Integer>> generarCocientes(Map<String, Integer> votos) {

		Map<String , ArrayList<Integer>>resultados=new HashMap<String,ArrayList<Integer>>();
		//recorrer el mapa votos 
		for( String clave : votos.keySet()) {//la clave es el partido
			resultados.put(clave, new ArrayList<Integer>());
			//Añadir al ArrayList tantos cocientes como escaños
			for ( int i=1; i<=ESCANOS; i++) {

				resultados.get(clave).add(votos.get(clave)/i);
			}
		}

		return resultados;
	}

 // metodo que genera votos totales de prueba a cada partido (votos entre 10000 y 20000)
 
	private static void inventarDatos(Map<String, Integer> votos, String[] partidos) {
		
		for( String partido : partidos) {
			votos.put(partido, (int)(Math.random()*10000+10000));
		}
		
	}

}
