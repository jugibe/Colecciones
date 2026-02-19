package Clases;

public enum Valor {
	//Son como constructores del Enum 
	//El numero entre paréntesis es el valor del atributo numero
    AS(13),
    DOS(2),
    TRES(3),
    CUATRO(4),
    CINCO(5),
    SEIS(6),
    SIETE(7),
    ORDENADOR (8),
    SOTA(10),
    CABALLO(11),
    REY(12);
	//Atributo del enum Valor
    private final int numero;
    //Constructor
    Valor(int numero) {
        this.numero = numero;
    }
    //metodo que devuelve el numero del a carta
    public int getNumero() {
        return numero;
    }
}
