package listadoBasico3;

/**
 * 13. Define la clase Pares que de forma repetitiva indique si un n�mero es par
 * o impar. Define el m�todo esPar(int)
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class Pares {
	public static void main(String[] args) {
		boolean resp;
		int x = 0, par;
		do {
			par = esPar(x);
			if (par == 1)
				System.out.println("El n�mero es impar.");
			if (par == 0)
				System.out.println("El n�mero es par.");
			resp = DeseaContinuar.continuar();

		} while (resp == true);
	}

	/**
	 * 
	 * @param x
	 *            introduce un valor por teclado.
	 * @return devuelve 0 si es par y 1 si es impar.
	 */
	public static int esPar(int x) {
		int par;
		x = Suma2.introducir();
		par = x % 2;
		return par;
	}
}
