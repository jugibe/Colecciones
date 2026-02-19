package Clases;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {

    private final List<Carta> cartas = new ArrayList<>();

    public Baraja() {
        for (Palo palo : Palo.values()) {
            for (Valor valor : Valor.values()) {
                cartas.add(new Carta(palo, valor));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta repartir() {
        if (cartas.isEmpty()) {
            throw new IllegalStateException("No quedan cartas");
        }
        return cartas.remove(0);
    }

    public int cartasRestantes() {
        return cartas.size();
    }
}
