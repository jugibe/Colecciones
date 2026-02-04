package mapstiposmapas;

import java.util.*;

public class RecorrerMapas {

    public static void main(String[] args) {

        // Creamos un Map de ejemplo
        Map<String, Integer> edades = new HashMap<>();

        edades.put("Ana", 20);
        edades.put("Luis", 25);
        edades.put("Maria", 30);

        // ==================================================
        // FORMA 1: recorrer usando entrySet() (LA MÁS RECOMENDADA)
        // ==================================================
        // entrySet() devuelve un conjunto de pares clave-valor
        // Es la forma más eficiente y más usada

        System.out.println("Recorrer usando entrySet():");
        for (Map.Entry<String, Integer> entry : edades.entrySet()) {

            // getKey() -> obtiene la clave
            // getValue() -> obtiene el valor
            System.out.println("Clave: " + entry.getKey() +
                               " | Valor: " + entry.getValue());
        }


        // ==================================================
        // FORMA 2: recorrer usando keySet()
        // ==================================================
        // keySet() devuelve solo las claves
        // Luego usamos get(clave) para obtener el valor
        // Es menos eficiente que entrySet()

        System.out.println("\nRecorrer usando keySet():");
        for (String clave : edades.keySet()) {

            System.out.println("Clave: " + clave +
                               " | Valor: " + edades.get(clave));
        }


        // ==================================================
        // FORMA 3: recorrer usando values()
        // ==================================================
        // values() devuelve solo los valores
        // NO permite acceder a las claves

        System.out.println("\nRecorrer usando values():");
        for (Integer valor : edades.values()) {
            System.out.println("Valor: " + valor);
        }


        // ==================================================
        // FORMA 4: usando forEach() (Java 8 en adelante)
        // ==================================================
        // Forma moderna y compacta
        // Usa expresiones lambda

        System.out.println("\nRecorrer usando forEach():");
        edades.forEach((clave, valor) ->
                System.out.println("Clave: " + clave + " | Valor: " + valor)
        );


        // ==================================================
        // FORMA 5: usando Iterator (menos común)
        // ==================================================
        // Se usa cuando necesitas eliminar elementos mientras recorres

        System.out.println("\nRecorrer usando Iterator:");
        Iterator<Map.Entry<String, Integer>> iterator = edades.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Clave: " + entry.getKey() +
                               " | Valor: " + entry.getValue());
        }
    }
}
