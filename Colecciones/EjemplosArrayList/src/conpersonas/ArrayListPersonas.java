package conpersonas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Comparator;

public class ArrayListPersonas {

    public static void main(String[] args) {

        // ==========================
        // CREAR ARRAYLIST
        // ==========================
        ArrayList<Persona> personas = new ArrayList<>();

        // add(E e)
        personas.add(new Persona("Ana", 25));
        personas.add(new Persona("Luis", 30));
        personas.add(new Persona("Pedro", 20));
        personas.add(new Persona("Ana", 25)); // repetido

        System.out.println("Lista inicial:");
        System.out.println(personas);

        // add(int index, E element)
        personas.add(1, new Persona("María", 28));
        System.out.println("\nDespués de add(1, María):");
        System.out.println(personas);

        // ==========================
        // contains()
        // ==========================
        System.out.println("\n¿Contiene a Ana (25)?");
        System.out.println(personas.contains(new Persona("Ana", 25)));

        // ==========================
        // indexOf() y lastIndexOf()
        // ==========================
        System.out.println("\nindexOf Ana(25): " +
                personas.indexOf(new Persona("Ana", 25)));

        System.out.println("lastIndexOf Ana(25): " +
                personas.lastIndexOf(new Persona("Ana", 25)));

        // ==========================
        // get()
        // ==========================
        System.out.println("\nElemento en índice 2:");
        System.out.println(personas.get(2));

        // ==========================
        // set()
        // ==========================
        personas.set(0, new Persona("Carlos", 40));
        System.out.println("\nDespués de set(0, Carlos):");
        System.out.println(personas);

        // ==========================
        // size() e isEmpty()
        // ==========================
        System.out.println("\nTamaño de la lista: " + personas.size());
        System.out.println("¿Está vacía? " + personas.isEmpty());

        // ==========================
        // remove(int) y remove(Object)
        // ==========================
        personas.remove(1);
        System.out.println("\nDespués de remove(1):");
        System.out.println(personas);

        personas.remove(new Persona("Ana", 25));
        System.out.println("\nDespués de remove(Ana,25):");
        System.out.println(personas);

        // ==========================
        // addAll()
        // ==========================
        ArrayList<Persona> nuevas = new ArrayList<>();
        nuevas.add(new Persona("Sofía", 22));
        nuevas.add(new Persona("Juan", 35));

        personas.addAll(nuevas);
        System.out.println("\nDespués de addAll():");
        System.out.println(personas);

        // addAll(int, Collection)
        personas.addAll(1, nuevas);
        System.out.println("\nDespués de addAll(1, nuevas):");
        System.out.println(personas);

        // ==========================
        // retainAll()
        // ==========================
        personas.retainAll(nuevas);
        System.out.println("\nDespués de retainAll():");
        System.out.println(personas);

        // ==========================
        // clear()
        // ==========================
        personas.clear();
        System.out.println("\nDespués de clear(): " + personas);

        // Volvemos a cargar datos
        personas.add(new Persona("Ana", 25));
        personas.add(new Persona("Luis", 30));
        personas.add(new Persona("Pedro", 20));
        personas.add(new Persona("María", 28));

        // ==========================
        // iterator() (hacia adelante)
        // ==========================
        System.out.println("\nRecorrido con Iterator:");
        Iterator<Persona> it = personas.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // ==========================
        // listIterator() al revés
        // ==========================
        System.out.println("\nRecorrido al revés con ListIterator:");
        ListIterator<Persona> lit = personas.listIterator(personas.size());
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

        /*
         * hasPrevious():
         * Devuelve true si existe un elemento anterior.
         * previous():
         * Retrocede y devuelve ese elemento.
         */
        
        
        
        

        // ==========================
        // removeIf()
        // ==========================
        personas.removeIf(p -> p.getEdad() > 28);
        System.out.println("\nDespués de removeIf(edad > 28):");
        System.out.println(personas);

        // ==========================
        // replaceAll()
        // ==========================
        personas.replaceAll(p ->
                new Persona(p.getNombre().toUpperCase(), p.getEdad())
        );
        System.out.println("\nDespués de replaceAll():");
        System.out.println(personas);

        // ==========================
        // SORT con LAMBDA
        // ==========================

        // Ordenar por EDAD
        personas.sort((p1, p2) ->
                Integer.compare(p1.getEdad(), p2.getEdad())
        );
        System.out.println("\nOrdenadas por edad:");
        System.out.println(personas);

        // Ordenar por NOMBRE
        personas.sort((p1, p2) ->
                p1.getNombre().compareTo(p2.getNombre())
        );
        System.out.println("\nOrdenadas por nombre:");
        System.out.println(personas);

        // ==========================
        // subList()
        // ==========================
        System.out.println("\nSublista (0,2):");
        System.out.println(personas.subList(0, 2));

        // ==========================
        // toArray()
        // ==========================
        Object[] array = personas.toArray();
        System.out.println("\nArray convertido:");
        for (Object o : array) {
            System.out.println(o);
        }

        // ==========================
        // clone()
        // ==========================
        ArrayList<Persona> copia = (ArrayList<Persona>) personas.clone();
        System.out.println("\nLista clonada:");
        System.out.println(copia);

       
    }
}
