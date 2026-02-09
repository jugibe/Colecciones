package ejercicios;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ejercicio6bis {

	public static void main(String[] args) {
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			listaNumeros.add((int) (Math.random() * 10 + 1));
		}
		System.out.println(listaNumeros);

		ListIterator<Integer> iterador = listaNumeros.listIterator();
		while (iterador.hasNext()) {
			Integer n = iterador.next();
			if (n % 2 == 0) {
				iterador.remove();
				//con el .set() podemos modificar el numero y/o podemos hacer un .set(n+1)
			}
		}
		System.out.println(listaNumeros);
	}

}
