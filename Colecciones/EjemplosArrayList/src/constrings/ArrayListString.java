package constrings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Comparator;

public class ArrayListString {

    public static void main(String[] args) {

        // Creamos el ArrayList
        ArrayList<String> nombres = new ArrayList<>();

        // add(E e) – agrega al final
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Pedro");
        nombres.add("Ana"); // repetido
        System.out.println("Lista inicial: " + nombres);

        // contains(Object o) – verifica si existe
        System.out.println("¿Contiene 'Luis'? " + nombres.contains("Luis"));

        // indexOf(Object o) – primera aparición
        System.out.println("indexOf('Ana'): " + nombres.indexOf("Ana"));

        // lastIndexOf(Object o) – última aparición
        System.out.println("lastIndexOf('Ana'): " + nombres.lastIndexOf("Ana"));

        // isEmpty() – verifica si está vacía
        System.out.println("¿Está vacía? " + nombres.isEmpty());

        // get(int index) – obtiene un elemento
        System.out.println("Elemento en índice 1: " + nombres.get(1));

        // set(int index, E element) – reemplaza un elemento
        nombres.set(2, "Carlos");
        System.out.println("Después de set(): " + nombres);

        // size() – tamaño de la lista
        System.out.println("Tamaño: " + nombres.size());

        // remove(int index) – elimina por índice
        nombres.remove(1);
        System.out.println("Después de remove(1): " + nombres);

        // remove(Object o) – elimina por objeto
        nombres.remove("Ana"); // elimina la primera
        System.out.println("Después de remove(\"Ana\"): " + nombres);

        // addAll(Collection c) – agrega otra colección
        ArrayList<String> invitados = new ArrayList<>();
        invitados.add("María");
        invitados.add("José");

        nombres.addAll(invitados);
        System.out.println("Después de addAll(): " + nombres);

        // addAll(int index, Collection c) – agrega en posición específica
        nombres.addAll(1, invitados);
        System.out.println("Después de addAll(1, invitados): " + nombres);

        // retainAll(Collection c) – conserva solo los que coinciden
        nombres.retainAll(invitados);
        System.out.println("Después de retainAll(): " + nombres);

        // clear() – elimina todos los elementos
        nombres.clear();
        System.out.println("Después de clear(): " + nombres);

        // Volvemos a agregar datos
        nombres.add("Juan");
        nombres.add("Sofía");
        nombres.add("Andrés");
        nombres.add("Lucía");

        // iterator() – recorrer con Iterator
        System.out.println("Recorrido con Iterator:");
        Iterator<String> it = nombres.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // listIterator() – recorrer hacia adelante y atrás
        System.out.println("Recorrido con ListIterator:");
        ListIterator<String> lit = nombres.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }
        
        
     // Creamos el ListIterator empezando desde el final
        ListIterator<String> iterador = nombres.listIterator(nombres.size());

        System.out.println("Recorriendo al revés:");

        while (iterador.hasPrevious()) {
            System.out.println(iterador.previous());
        }
        
        
        //Recorre con un for each
        
       for(String s:nombres) {
    	   System.out.println("recorrido con for "+ s);
    	   
       }
       

       //Recorre con un for each
       //atencion no se puede cambiar
       
      for(String s:nombres) {
   	   s=s=s+"cambiado";
   	   
      }
      System.out.println("Después de recorrer con un foreach y cambiar" + nombres);
      

        // removeIf(Predicate) – elimina con condición
        nombres.removeIf(n -> n.startsWith("A"));
        System.out.println("Después de removeIf(): " + nombres);

        // replaceAll(UnaryOperator) – reemplaza todos
        nombres.replaceAll(n -> n.toUpperCase());
        System.out.println("Después de replaceAll(): " + nombres);

        // sort(Comparator) – ordenar
        nombres.sort(Comparator.naturalOrder());
        System.out.println("Después de sort(): " + nombres);

        // subList(from, to) – sublista
        nombres.add("PEDRO");
        nombres.add("ALBERTO");
        System.out.println("Lista completa: " + nombres);
        System.out.println("Sublista (1, 3): " + nombres.subList(1, 3));

        // toArray() – convertir a arreglo
        Object[] arreglo = nombres.toArray();
        System.out.println("Array resultante:");
        for (Object o : arreglo) {
            System.out.println(o);
        }

        // clone() – clonar la lista
        ArrayList<String> copia = (ArrayList<String>) nombres.clone();
        System.out.println("Lista clonada: " + copia);

        
    }
}
