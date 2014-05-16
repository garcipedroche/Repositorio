package listadoBasico3;

/**
 * 12. Define la clase Resta que realice de forma repetitiva restas y las
 * muestre , siempre y cuando el usuario responda afirmativamente a la pregunta
 * : “¿Desea continuar? (s/n)”. Para ello utiliza un método continuar (ejercicio
 * anterior) e implementa también el método restar con los dos argumentos que
 * sean los operandos. Ha de devolver su diferencia. Documéntalo correctamente
 * (@ param y @ return)
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class Resta {
	public static void main(String[] args) {
		boolean resp;
		int x = 0, y = 0, difer;
		do {
			difer = restar(x, y);
			System.out.println("La diferencia es = " + difer);
			resp = DeseaContinuar.continuar();

		} while (resp == true);
	}

	/**
	 * 
	 * @param x
	 *            introduce un valor por teclado.
	 * @param y
	 *            introduce un valor por teclado.
	 * @return devuelve el valor de restar x-y.
	 */
	public static int restar(int x, int y) {
		int difer;
		x = Suma2.introducir();
		y = Suma2.introducir();
		difer = x - y;
		return difer;
	}
}
