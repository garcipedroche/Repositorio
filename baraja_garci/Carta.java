package baraja;

/**
 * Clase carta
 * 
 * @author Jose Manuel Garcia Valverde
 * @version 1.0
 * 
 */
public class Carta {
	/**
	 * Cada carta tiene un numero
	 */
	private Numero numero;
	/**
	 * Cada carta tiene un palo
	 */
	private Palo palo;

	/**
	 * Constructor de cada carta
	 * 
	 * @param numero
	 *            = enum numero de la carta
	 * @param palo
	 *            = enum palo de la carta
	 */
	Carta(Numero numero, Palo palo) {
		setNumero(numero);
		setPalo(palo);
	}

	/**
	 * Obtener numero
	 * 
	 * @return numero de la carta
	 */
	public Numero getNumero() {
		return numero;
	}

	/**
	 * Metodo para modificar el campo numero
	 * 
	 * @param numero
	 *            valor a introducir en el campo
	 */
	public void setNumero(Numero numero) {
		this.numero = numero;
	}

	/**
	 * Obtener palo
	 * 
	 * @return palo de la carta
	 */
	public Palo getPalo() {
		return palo;
	}

	/**
	 * Metodo para modificar el campo palo
	 * 
	 * @param palo
	 *            valor a introducir en el campo
	 */
	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	/**
	 * Metodo toString: muestra el numero y palo de la carta
	 */
	@Override
	public String toString() {
		return "[numero=" + numero + ", palo=" + palo + "]";
	}

}

/**
 * Enumeracion con los palos posibles de una baraja
 * 
 * @author Jose Manuel Garcia Valverde
 * @version 1.0
 * 
 */
enum Palo {
	OROS, COPAS, ESPADAS, BASTOS;
}

/**
 * Enumeracion con los numeros posibles de una baraja
 * 
 * @author Jose Manuel Garcia Valverde
 * @version 1.0
 * 
 */
enum Numero {
	AS, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, SOTA, CABALLO, REY;
}
