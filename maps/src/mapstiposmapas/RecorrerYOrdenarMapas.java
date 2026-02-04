package mapstiposmapas;

import java.util.*;

public class RecorrerYOrdenarMapas {

    public static void main(String[] args) {

        // ==================================================
        // MAPA DE EJEMPLO
        // ==================================================
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Maria", 30);
        edades.put("Ana", 20);
        edades.put("Luis", 25);
        edades.put("Pedro", 18);

        // ==================================================
        // RECORRER EL MAPA (entrySet)
        // ==================================================
        System.out.println("Mapa original (HashMap, sin orden):");

        for (Map.Entry<String, Integer> entry : edades.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


        // ==================================================
        // ORDENAR POR CLAVE USANDO COMPARATOR (TreeMap)
        // ==================================================
        // Creamos un Comparator para ordenar las claves alfabéticamente
        Comparator<String> comparadorPorClave =
                (c1, c2) -> c1.compareTo(c2);

        // Pasamos el Comparator al TreeMap
        Map<String, Integer> mapaOrdenadoPorClave =
                new TreeMap<>(comparadorPorClave);
        
        //Equivalente a
        /*
        Map<String, Integer> mapaOrdenadoPorClave =
                new TreeMap<>((c1, c2) -> c1.compareTo(c2));
        
         */
        
        // Copiamos los datos del HashMap al TreeMap
        mapaOrdenadoPorClave.putAll(edades);

        System.out.println("\nMapa ordenado por CLAVE (Comparator):");

        for (Map.Entry<String, Integer> entry : mapaOrdenadoPorClave.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


        // ==================================================
        // ORDENAR POR CLAVE EN ORDEN INVERSO
        // ==================================================
        Comparator<String> comparadorClaveInversa =
                (c1, c2) -> c2.compareTo(c1);

        Map<String, Integer> mapaClaveInversa =
                new TreeMap<>(comparadorClaveInversa);

        mapaClaveInversa.putAll(edades);

        System.out.println("\nMapa ordenado por CLAVE INVERSA:");

        for (Map.Entry<String, Integer> entry : mapaClaveInversa.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


        // ==================================================
        // ORDENAR POR VALOR USANDO COMPARATOR
        // ==================================================
        // Los Map NO se ordenan por valor directamente
        // Convertimos el entrySet() a una lista

        List<Map.Entry<String, Integer>> lista =
                new ArrayList<>(edades.entrySet());

        // Comparator para ordenar por valor
        lista.sort((e1, e2) -> e1.getValue().compareTo(e2.getValue()));

        System.out.println("\nMapa ordenado por VALOR:");

        for (Map.Entry<String, Integer> entry : lista) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


        // ==================================================
        // ORDENAR POR VALOR DE FORMA INVERSA
        // ==================================================
        lista.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        System.out.println("\nMapa ordenado por VALOR INVERSO:");

        for (Map.Entry<String, Integer> entry : lista) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
