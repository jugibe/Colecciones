package ejemplos;
/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * ejemplo
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejemplo1 {

	public static void main(String[] args) {
		// Definir ArrayList de numeros enteros
		ArrayList<Integer>lista=new ArrayList<Integer>();
		lista.add(1);
		lista.add(24);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		lista.add(71);
		lista.add(8);
		lista.add(9);
		lista.add(10);
		//Suma de numeros pares
		int sumaPares=lista.stream().mapToInt(Integer::intValue).filter(n -> n%2 == 0).sum();
		System.out.println(sumaPares);
		//Mostra los numeros pares
		lista.stream().filter(n -> n%2 == 0).filter(n -> n>5).forEach(n -> System.out.println(2*n));
		//Crear una lista con los numeros pares
		List<Integer>listaPares=lista.stream().filter(n -> n%2 == 0).sorted((n1,n2)->n2.compareTo(n1)).toList();
		System.out.println(listaPares);
		//Numero mayor de los pares
		Integer numeroMayor=lista.stream().filter(n -> n%2 == 0).max((n1,n2)->n1.compareTo(n2)).orElse(0);
		System.out.println(numeroMayor);
		//Numero menor de la lista
		Integer numeroMinimo=lista.stream().min((n1,n2)->n1.compareTo(n2)).orElse(0);
		System.out.println(numeroMinimo);
		//defino ArrayList de String
		ArrayList<String>nombre=new ArrayList<String>();
		nombre.add("David");
		nombre.add("Adrian");
		nombre.add("Gonzalo");
		nombre.add("Cristian");
		nombre.add("Alise");
		nombre.add("Alise");
		//Mostrar nombre que empiezan por vocal y tienen mas de 4 letras
		nombre.stream()
			.filter(n -> n.matches("[aeiouAEIOU].*"))
			.filter(n-> n.length()>=6)
			.forEach(n -> System.out.println(n));
		//Mostrar nombre que empiezan por vocal y tienen mas de 4 letras en mayusculas
		nombre.stream()
		.filter(n -> n.matches("[aeiouAEIOU].*"))
		.filter(n-> n.length()>=6)
		.map(n -> n.toUpperCase())
		.forEach(n -> System.out.println(n));
		//Mostrar la longitud de cada nombre
		nombre.stream()
			.map(n -> n.length())
			.forEach(n -> System.out.println(n));
		//Mostrar cuantos nombres empiezan por vocal
		long namePorVocal=nombre.stream()
				.filter(n -> n.matches("[aeiouAEIOU].*"))
				.count();
		System.out.println("nombres por vocales: "+namePorVocal);
		//Nueva lista con nombres que empiezan por vocal pasados a mayusculas
		List<String>nuevaLista=nombre.stream()
				.filter(n -> n.matches("[aeiouAEIOU].*"))
				.map(String::toUpperCase)
				.sorted()
				.toList();
		System.out.println(nuevaLista);
		//Multiplicar numeros impares
		int numerosImpares=lista.stream()
				.filter(n -> n%2 != 0)
				.reduce(1, (n1,n2) -> n1*n2 );
		System.out.println(numerosImpares);
		//Transformar lista de nombres a mapa de nombres
		Map<String, Integer>mapaNombres=nombre.stream()
				.distinct()
				.collect(Collectors.toMap(
						n -> n,
						n -> n.length()
						));
		System.out.println(mapaNombres);
		//Agraupar nombres por la letra que empiezan
		//Generar un map donde la clave es la primera letra y el valor son los elementos que cumplen con ese criterio
		//objeto a devolver un map donde la clave seria un char y el valor una lista de String
		Map<Character, List<String>>mapa=nombre.stream()
				.collect(Collectors.groupingBy(n -> n.charAt(0)));
		System.out.println(mapa);
		
		
		
		
		
		
		
	}

}
