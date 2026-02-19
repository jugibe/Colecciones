package eleccionesDam;

import java.util.ArrayList;

public class Prueba <T>{
	
	private ArrayList<T> datos ;

	/**
	 * @param datos
	 */
	public Prueba() {
		super();
		this.datos = new ArrayList<T>();
	}
	
	public void add(T t) {
		datos.add(t);
	}

	@Override
	public String toString() {
		return "Prueba [datos=" + datos + "]";
	}
	
	
	
	

}
