package olimpiadas;

public class Medallero implements Comparable {
	private Integer oro = 0;
	private Integer plata = 0;
	private Integer bronce = 0;
	private String pais;

	/**
	 * @param oro
	 * @param plata
	 * @param bronce
	 * @param pais
	 */
	public Medallero(String pais) {
		this.pais = pais;
	}

	/**
	 * @return the oro
	 */
	public Integer getOro() {
		return oro;
	}

	/**
	 * @return the plata
	 */
	public Integer getPlata() {
		return plata;
	}

	/**
	 * @return the bronce
	 */
	public Integer getBronce() {
		return bronce;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	public void addOro() {
		oro++;
	}

	public void addPlata() {
		plata++;
	}

	public void addBronce() {
		bronce++;
	}

	@Override
	public int compareTo(Object o) {
		Medallero m = (Medallero) o;
		if (oro != m.getOro()) {
			return oro.compareTo(m.getOro());
		} else if (plata != m.getPlata()) {
			return plata.compareTo(m.getPlata());
		} else {
			return bronce.compareTo(m.getBronce());
		}
	}

	@Override
	public String toString() {
		return "Medallero [oro=" + oro + ", plata=" + plata + ", bronce=" + bronce + ", pais=" + pais + "]";
	}

}
