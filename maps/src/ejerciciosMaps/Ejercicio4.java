package ejerciciosMaps;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @Autor: Juanjo
 * 11/02/2026
 * Ejercicio 4.- Inventario sencillo
	Usa un Map<String, Integer> para almacenar productos y su cantidad en stock.
	Operaciones:
	• Añadir productos (sumar unidades o añadir nuevo)
	• Vender productos (restar unidades)
	• Mostrar los productos sin stock (unidadeds 0)
 */
public class Ejercicio4 {
	//Creo el mapa y le añado valores de prueba.
	//Lo hago global para no tener que pasaro a los métodos
	private static Map<String, Integer> inventario=new HashMap< >();
	
	public static void main(String[] args) {
		
		inventario.put("Agua", 3);
		inventario.put("Leche", 2);
		inventario.put("galletas", 5);
		inventario.put("Manzanas", 6);
		
		try {
			venderProductos("galletas",5);
		} catch (ProductoSinStockException | ProductoInexistenteException e) {
			System.out.println(e.getMessage());
		}
		
		addProductos("sarten",1);
		System.out.println(inventario);
		
		productosSinStock();
		

		

	}
	
	private static void addProductos(String nombre, int cantidad) {
		if(!inventario.containsKey(nombre)) {inventario.put(nombre, cantidad);}
		else {inventario.put(nombre, inventario.get(nombre)+cantidad);
			
		}
		
	}
	
	
	private static void productosSinStock() {
		for(String s:inventario.keySet()) {
			if (inventario.get(s)==0) {
				System.out.println("Producto: "+ s + " stock=0");
			}
		}
	}

	/**
	 * vender productos
	 * @throws ProductoSinStockException 
	 * @throws ProductoInexistenteException 
	 */
	private static void venderProductos(String nombre, Integer unidades) throws ProductoSinStockException, ProductoInexistenteException {
		if(!inventario.containsKey(nombre)) {throw new ProductoInexistenteException(nombre);}
		if(inventario.get(nombre)<unidades) {
			throw new ProductoSinStockException(nombre);}
		inventario.put(nombre,inventario.get(nombre)-unidades);
		
	}
	
	
	private static class ProductoSinStockException extends Exception {
		public ProductoSinStockException(String nombre) {
			super("Producto "+ nombre + " sin stock suficiente");
			
		}
		
	}
	private static class ProductoInexistenteException extends Exception {
		public ProductoInexistenteException(String nombre) {
			super("Producto "+ nombre + " inexistente");
			
		}
		
	}

}
