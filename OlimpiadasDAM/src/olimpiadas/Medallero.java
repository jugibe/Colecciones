package olimpiadas;

public class Medallero implements Comparable{
	//atributos
	private String pais;
	private Integer numeroOros=0;
	private Integer numeroPlatas=0;
	private Integer numeroBronces=0;

	public Medallero(String pais) {
		this.pais=pais;
		
	}

	//Getters
	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @return the numeroOros
	 */
	public int getNumeroOros() {
		return numeroOros;
	}

	/**
	 * @return the numeroPlata
	 */
	public int getNumeroPlatas() {
		return numeroPlatas;
	}

	/**
	 * @return the numeroBronce
	 */
	public int getNumeroBronces() {
		return numeroBronces;
	}

	@Override
	public String toString() {
		return "Medallero [pais=" + pais + ", numeroOros=" + numeroOros + ", numeroPlata=" + numeroPlatas
				+ ", numeroBronce=" + numeroBronces + "]";
	}
	
	// Añadir un oro, plata o bronce
	public void addOro() {
		numeroOros++;
	}
	
	public void addPlata() {
		numeroPlatas++;
	}
	
	public void addBronce() {
		numeroBronces++;
	}

	// Metodo de ordenación
	@Override
	public int compareTo(Object o) {
		Medallero m= (Medallero) o;
		if(numeroOros!=m.getNumeroOros()) {
			return numeroOros.compareTo(m.getNumeroOros());
		}else if(numeroPlatas!=m.getNumeroPlatas()) {
			return numeroPlatas.compareTo(m.getNumeroPlatas());
		}else {
			return numeroBronces.compareTo(m.getNumeroBronces());
		}
	}
	

	
	
	
}
