package baraja;


/**
 * Test de baraja y carta
 * 
 * @author Jose Manuel Garcia Valverde
 * @version 1.0
 * 
 */
public class TestBaraja {
	public static void main(String[] args) {

		Baraja barajaOrd = new Baraja();
		System.out.println("Baraja Ordenada: ");
		System.out.println(barajaOrd.toString());
		Baraja barajaDesord = new Baraja();
		System.out.println("Baraja Desordenada: ");
		barajaDesord.barajar();
		System.out.println(barajaDesord.toString());
		repartirCartas(5, barajaDesord);
		repartirCartas(Teclado.leerEntero("Cartas a repartir.........."),
				barajaDesord);
		repartirCartas(Teclado.leerEntero("Cartas a repartir.........."),
				barajaDesord);
		repartirCartas(Teclado.leerEntero("Cartas a repartir.........."),
				barajaDesord);
	}

	private static void repartirCartas(int numero, Baraja baraja) {
		System.out.println("Cartas a repartir..........");
		System.out.println(numero);
		Carta aux;
		for (int i = 0; i < numero; i++) {
			aux = baraja.repartirUna();
			if (aux != null)
				System.out.println(aux);
			else {
				break;
			}
		}

	}

}