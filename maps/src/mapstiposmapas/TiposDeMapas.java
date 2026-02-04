package mapstiposmapas;

import java.util.*;

public class TiposDeMapas {

    public static void main(String[] args) {

        // ==================================================
        // HASHMAP
        // ==================================================
        // - No mantiene ningún orden
        // - No permite claves duplicadas
        // - Permite un valor null y una clave null
        // - Es el más rápido en general

        Map<String, Integer> hashMap = new HashMap<>();

        // put(clave, valor)
        // Inserta un elemento en el mapa
        hashMap.put("Ana", 20);
        hashMap.put("Maria", 30);
        hashMap.put("Luis", 25);

        // Si insertamos una clave repetida, se sobreescribe el valor
        hashMap.put("Ana", 22);

        System.out.println("HashMap:");
        System.out.println(hashMap);


        // get(clave)
        // Devuelve el valor asociado a la clave
        System.out.println("Edad de Luis: " + hashMap.get("Luis"));

        // containsKey(clave)
        // Devuelve true si la clave existe
        System.out.println("Existe la clave Maria? " + hashMap.containsKey("Maria"));

        // containsValue(valor)
        // Devuelve true si el valor existe
        System.out.println("Existe el valor 30? " + hashMap.containsValue(30));

        // remove(clave)
        // Elimina el elemento asociado a la clave
        hashMap.remove("Luis");
        System.out.println("Después de eliminar a Luis: " + hashMap);

        // size()
        // Devuelve la cantidad de elementos
        System.out.println("Tamaño del HashMap: " + hashMap.size());

        // isEmpty()
        // Devuelve true si el mapa está vacío
        System.out.println("Está vacío? " + hashMap.isEmpty());


        // ==================================================
        // LINKEDHASHMAP
        // ==================================================
        // - Mantiene el orden de inserción
        // - No permite claves duplicadas
        // - Un poco más lento que HashMap

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Ana", 20);
        linkedHashMap.put("Luis", 25);
        linkedHashMap.put("Maria", 30);

        System.out.println("\nLinkedHashMap:");
        System.out.println(linkedHashMap);


        // ==================================================
        // TREEMAP
        // ==================================================
        // - Ordena los elementos automáticamente por la clave
        // - No permite claves null
        // - Es más lento que HashMap
        // - Usa un árbol para mantener el orden

        Map<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Ana", 20);
        treeMap.put("Luis", 25);
        treeMap.put("Maria", 30);
        treeMap.put("Ana", 20);

        System.out.println("\nTreeMap:");
        System.out.println(treeMap);


        // ==================================================
        // MÉTODOS COMUNES A TODOS LOS MAPAS
        // ==================================================

        // keySet()
        // Devuelve un Set con todas las claves
        System.out.println("\nClaves del HashMap:");
        for (String clave : hashMap.keySet()) {
            System.out.println(clave + " valor: " + hashMap.get(clave)+ "*********" );
        }

        // values()
        // Devuelve una colección con todos los valores
        System.out.println("\nValores del HashMap:");
        for (int valor : hashMap.values()) {
            System.out.println(valor);
        }

        // entrySet()
        // Devuelve un conjunto de pares clave-valor
        // Es la forma más usada para recorrer un Map
        System.out.println("\nRecorriendo HashMap con entrySet():");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + 
                               " | Valor: " + entry.getValue());
        }

        // clear()
        // Elimina todos los elementos del mapa
        hashMap.clear();
        System.out.println("\nHashMap después de clear(): " + hashMap);
    }
}
