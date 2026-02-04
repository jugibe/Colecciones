package recorrerlistas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import conpersonas.Persona;

public class Main {
	public static void main(String[] args) {
		ArrayList<Persona> listaPersonas=new ArrayList<Persona>();
		listaPersonas.add(new Persona("Adrian", 23));
		listaPersonas.add(new Persona("Carlos", 20));
		listaPersonas.add(new Persona("Carlos", 45));
		listaPersonas.add(new Persona("Evis", 23));
		
		for(Persona p: listaPersonas) {
			p.setNombre(p.getNombre()+" X");
			
		}
		

       //for(int i=0;i<listaPersonas.size();i++) {
    	//   listaPersonas.set(i, new Persona("David",29));
       //}
       
       System.out.println(listaPersonas);
       
       //Usando Iteradores
       
       Iterator<Persona> it = listaPersonas.iterator();
       while (it.hasNext()) {
           System.out.println(it.next());
       }
       
       ListIterator<Persona> itl=listaPersonas.listIterator(listaPersonas.size());
       while(itl.hasPrevious()) {
    	   System.out.println(itl.previous());
    	   itl.set(new Persona("Juan",34));
    	   
       }
       System.out.println(listaPersonas);

	}

}
