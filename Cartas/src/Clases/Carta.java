package Clases;

public class Carta {

    private final Palo palo;
    private final Valor valor;

    public Carta(Palo palo, Valor valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public Palo getPalo() {
        return palo;
    }

    public Valor getValor() {
        return valor;
    }
    public Integer getNumero(){
    	return valor.getNumero();
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}
