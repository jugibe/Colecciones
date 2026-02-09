package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo3FiltrarPares {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(4);
        numeros.add(7);
        numeros.add(8);

        // Filtrar solo los pares
        List<Integer> pares = numeros.stream()
                                     .filter(n -> n % 2 == 0) // solo números pares
                                     .collect(Collectors.toList()); // devuelve una lista

        System.out.println("Números pares: " + pares);
        
        int sumaPares = numeros.stream().filter(n -> n%2 == 0).mapToInt(Integer::intValue).sum();
        
        System.out.println("Suma de pares: "+sumaPares);
    }
}
