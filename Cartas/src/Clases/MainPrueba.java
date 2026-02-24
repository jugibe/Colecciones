package Clases;

public class MainPrueba {

	public static void main(String[] args) {
		Palo p=Palo.Oros;
		System.out.println(p);
		p=Palo.Copas;
		System.out.println(p);
		Valor v=Valor.AS;
		System.out.println(v.getNumero());
		//recorrer un enum
		for(Palo x:Palo.values()) {
			System.out.println(x);
		}
		//Crear Baraja
		
		Baraja b=new Baraja();
		b.barajar();
		while(b.cartasRestantes()>0){
			Carta c=b.repartir();
			System.out.println(c);
		}
		System.out.println("#################");
		
		//Guerra de dos cartas
		Baraja b2=new Baraja();
		Carta c1=b2.repartir();
		Carta c2=b2.repartir();
		System.out.println(c1+ "\n"+c2);
		
		if (c1.getNumero()>c2.getNumero()) {
			System.out.println("Ganador "+ c1);
		}else if (c1.getNumero()<c2.getNumero()) {
			System.out.println("Ganador "+ c2);
		}else {
			System.out.println("Guerra");
		}
			
		
	}

}
