package ejercicios;

import java.util.ArrayList;
import java.util.List;

/*
 * Ejercicio 9.- Sublistas y copias
Dada una lista de 10 productos:
• Crea una sublista con los 5 primeros
• Clona la lista original
• Modifica la sublista y analiza qué ocurre
Pregunta clave: ¿afecta a la lista original?
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		listaProductos.add(new Producto("Leche",1.20));
		listaProductos.add(new Producto("Pan",0.80));
		listaProductos.add(new Producto("Huevos",3.40));
		listaProductos.add(new Producto("Manzana",1.30));
		listaProductos.add(new Producto("Cebolla",1.40));
		
		System.out.println("Lista productos original");
		System.out.println(listaProductos);
		
		List<Producto> subLista = listaProductos.subList(0, 2);
		
		List<Producto> listaClonada = (List<Producto>) listaProductos.clone();
		
		subLista.get(1).setPrecio(1.10);
		System.out.println("Lista productos original despues de modificar la sublista");
		System.out.println(listaProductos);
		System.out.println("Lista productos clonada");	
		System.out.println(listaClonada);
		System.out.println("sublista de la lista original");	
		System.out.println(subLista);
		
		System.out.println("-----------------------------------");
		subLista.set(1, new Producto("Seat Ibiza", 1000.0));
		System.out.println("Lista productos original despues de modificar la sublista");
		System.out.println(listaProductos);
		System.out.println("Lista productos clonada");	
		System.out.println(listaClonada);
		System.out.println("sublista de la lista original");	
		System.out.println(subLista);
		
		

		
		


	}

}
