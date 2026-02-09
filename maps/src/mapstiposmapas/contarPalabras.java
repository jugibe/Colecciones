package mapstiposmapas;

import java.util.TreeMap;

/*
 * Victor
 * 9/02/2026
 * Contar las veces que aparece cada letra en una frase
 */

public class contarPalabras {

	public static void main(String[] args) {
		String frase="Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?";
		frase=frase.toUpperCase();
		TreeMap<Character, Integer>frecuencias= new TreeMap<Character, Integer>();
		
		//recorrer bucle
		for(int i=0; i<frase.length(); i++) {
			if(!frecuencias.containsKey(frase.charAt(i))) {
				frecuencias.put(frase.charAt(i), 1);
				
			}else {frecuencias.put(frase.charAt(i), frecuencias.get(frase.charAt(i))+1);};
			
		}
		System.out.println(frecuencias);
	}

}
