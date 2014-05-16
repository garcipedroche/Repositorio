package baraja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Clase baraja
 * hola hola hola
 * @author Jose Manuel Garcia Valverde
 * @version 1.0
 * 
 */
public class Baraja {
	/**
	 * Baraja
	 */
	private ArrayList<Carta> baraja = new ArrayList<Carta>();
	private Iterator<Carta> iterador;

	/**
	 * Constructor de baraja
	 */
	Baraja() {
		for (Palo palo : Palo.values()) {
			for (Numero numero : Numero.values()) {
				baraja.add(new Carta(numero, palo));
			}
		}

	}// constructor

	/**
	 * Metodo toString. Muestra el estado de cada objeto. Es sobreescrito
	 */
	@Override
	public String toString() {
		return "Baraja [baraja=" + baraja + "]";
	}

	/**
	 * Reparte cartas de una en una
	 * 
	 * @return carta a repartir si hay, sino null
	 */
	public Carta repartirUna() {
		if (iterador.hasNext()) {
			return iterador.next();
		} else {
			System.out.println("No hay mas cartas");
			return null;
		}
	}

	/**
	 * Metodo que baraja la baraja de cartas (orden aleatorio dentro del
	 * arraylist)
	 */
	void barajar() {
		Collections.shuffle(baraja);
	}
}