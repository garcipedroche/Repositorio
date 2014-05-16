package listadoBasico3;

import utiles.Teclado;

/**
 * 10. Define la clase DeseaContinuar que realice la siguiente pregunta: “
 * ¿Desea continuar? (s/n) ”. En caso de que el usuario indique una “s”
 * (minúscula o mayúscula) el programa seguirá preguntando. En otro caso, que se
 * salga del programa. Para ello implementa el método continuar que devuelva
 * true en caso de introducir una s, y false en caso contrario. Documéntalo
 * correctamente (@return)
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class DeseaContinuar {
	public static void main(String[] args) {
		boolean resp;
		do {
			resp = continuar();
		} while (resp == true);
	}

	/**
	 * 
	 * @return devuelve true en caso de afirmar, false en caso de negar y error
	 *         en caso de cualquier otro caso.
	 */
	public static boolean continuar() {
		char resp;
		boolean error;
		System.out.println("¿Desea continuar? (s/n)");
		resp = Teclado.leerCaracter();
		if (resp == 's' || resp == 'S') {
			return true;
		} else {
			if (resp == 'n' || resp == 'N') {
				return false;
			} else {
				System.out.println("Error: Debe introducir (s/n)");
				error = continuar();
				return error;
			}
		}
	}
}
