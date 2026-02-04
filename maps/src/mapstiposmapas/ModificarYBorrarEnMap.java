package mapstiposmapas;

import java.util.*;

public class ModificarYBorrarEnMap {

    public static void main(String[] args) {

        // ==================================================
        // MAPA DE EJEMPLO
        // ==================================================
        Map<String, Integer> edades = new HashMap<>();

        edades.put("Ana", 20);
        edades.put("Luis", 25);
        edades.put("Maria", 30);

        System.out.println("Mapa inicial:");
        System.out.println(edades);


        // ==================================================
        // MODIFICAR ELEMENTOS DEL MAPA
        // ==================================================

        // 1️⃣ put(clave, nuevoValor)
        // Si la clave existe -> MODIFICA el valor
        // Si la clave NO existe -> CREA un nuevo elemento
        edades.put("Ana", 22);

        System.out.println("\nDespués de modificar a Ana:");
        System.out.println(edades);


        // 2️⃣ replace(clave, nuevoValor)
        // Solo modifica si la clave existe
        // NO crea una nueva clave
        edades.replace("Maria", 31);

        System.out.println("\nDespués de replace a Maria:");
        System.out.println(edades);


        // 3️⃣ replace(clave, valorViejo, valorNuevo)
        // Modifica SOLO si el valor actual coincide con el valorViejo
        boolean cambiado = edades.replace("Luis", 25, 26);
        System.out.println("\n¿Se modificó Luis? " + cambiado);
        System.out.println(edades);


        // 4️⃣ compute()
        // Permite recalcular el valor a partir del valor actual
        edades.compute("Ana", (clave, valor) -> valor + 1);

        System.out.println("\nDespués de compute (sumar 1 a Ana):");
        System.out.println(edades);


        // ==================================================
        // BORRAR ELEMENTOS DEL MAPA
        // ==================================================

        // 1️⃣ remove(clave)
        // Elimina el elemento con esa clave
        edades.remove("Luis");

        System.out.println("\nDespués de eliminar a Luis:");
        System.out.println(edades);


        // 2️⃣ remove(clave, valor)
        // Elimina SOLO si la clave tiene ese valor
        boolean eliminado = edades.remove("Maria", 30); // no se borra
        System.out.println("\n¿Se eliminó Maria con valor 30? " + eliminado);
        System.out.println(edades);


        // 3️⃣ clear()
        // Elimina TODOS los elementos
        edades.clear();

        System.out.println("\nDespués de clear():");
        System.out.println(edades);


        // ==================================================
        // COSAS QUE DAN ERROR (MUY IMPORTANTE)
        // ==================================================

        Map<String, Integer> mapaError = new HashMap<>();
        mapaError.put("A", 1);
        mapaError.put("B", 2);

        // ❌ ERROR 1: modificar el Map mientras se recorre con for-each
        try {
            for (String clave : mapaError.keySet()) {
                mapaError.remove(clave); // ConcurrentModificationException
            }
        } catch (Exception e) {
            System.out.println("\nERROR al borrar en for-each: " + e);
        }

        // ✅ Forma CORRECTA de borrar mientras recorres
        Iterator<Map.Entry<String, Integer>> it =
                mapaError.entrySet().iterator();

        while (it.hasNext()) {
            it.next();
            it.remove(); // seguro
        }

        System.out.println("\nMapa después de borrar con Iterator:");
        System.out.println(mapaError);


        // ==================================================
        // OTROS ERRORES COMUNES
        // ==================================================

        // ❌ TreeMap NO permite claves null
        try {
            Map<String, Integer> treeMap = new TreeMap<>();
            treeMap.put(null, 10); // NullPointerException
        } catch (Exception e) {
            System.out.println("\nERROR TreeMap con clave null: " + e);
        }

        // ❌ get() devuelve null si la clave no existe
        // Si intentas usar ese null como int -> NullPointerException
        Integer valor = edades.get("NoExiste");
        System.out.println("\nget() de clave inexistente devuelve: " + valor);

        // ❌ ERROR típico:
        // int x = edades.get("NoExiste"); // NullPointerException
    }
}
