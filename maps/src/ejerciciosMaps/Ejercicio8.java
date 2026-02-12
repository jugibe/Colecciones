package ejerciciosMaps;

import java.util.HashMap;
import java.util.Map;

/**
 * Gestión de precios Usa un Map<String, Double> para guardar productos y
 * precios. Operaciones: • Mostrar el producto más caro • Mostrar el producto
 * más barato • Calcular el precio medio
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		Map<String, Double> listaPrecios = new HashMap<String, Double>();

		listaPrecios.put("pan", 1.20);
		listaPrecios.put("carne", 1.40);
		listaPrecios.put("leche", 3.90);
		listaPrecios.put("huevos", 2.80);

		// mostrar el producto mas caro
		Double precioMax = 0.0;
		String productoMax = "";
		for (String s : listaPrecios.keySet()) {
			if (listaPrecios.get(s) > precioMax) {
				precioMax = listaPrecios.get(s);
				productoMax = s;
			}
		}
		System.out.println("El producto con mas precio es " + productoMax + " y su precio es " + precioMax);

		// mostrar el producto mas barato (con streams)
		Map.Entry<String, Double> x = listaPrecios.entrySet().stream()
				.min((p1, p2) -> p1.getValue().compareTo(p2.getValue())).orElse(null);
		System.out.println(x.getKey());
		System.out.println(x.getValue());

		// Calcular el precio medio (programacion funcional)
		Double promedio = listaPrecios.entrySet().stream().mapToDouble(a -> a.getValue()).average().orElse(0.0);
		System.out.println(promedio);

		// calcular el precio medio con un foreach (programacion imperativa)
		Double sumaPrecios = 0.0;
		for (String s : listaPrecios.keySet()) {
			sumaPrecios += listaPrecios.get(s);
		}

		Double promedio2 = sumaPrecios / listaPrecios.size();
		System.out.println(promedio2);

	}

}
