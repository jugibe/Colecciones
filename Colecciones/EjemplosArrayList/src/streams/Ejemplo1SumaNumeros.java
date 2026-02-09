package streams;

import java.util.ArrayList;
/**
 * Sumar numeros de un arrayList usando streams o flujos
 */
public class Ejemplo1SumaNumeros {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(3);
        numeros.add(7);

        // Sumar usando streams
        int suma = numeros.stream()
                          .mapToInt(Integer::intValue)  // convierte Integer a int
                          .sum();                       // suma todos

        System.out.println("La suma es: " + suma);
    }
}
