package listadoBasico3;

/**
 * 5. Indica el resultado de las siguientes expresiones, suponiendo que
 * inicialmente x vale 1: a. (1 > x) && ( 1 > x++) b. (1 == x) || (10 > x++) c.
 * (++x) + x; d. x + (++x) e. (1 > x) || ( 1 > x--) f. (1 > x) || ( 1 > --x)
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 */
public class XVale1 {
	public static void main(String[] args) {
		int x = 1;

		// Apartado a:
		if ((1 > x) && (1 > x++)) {
			System.out.println("Se cumple a.");
		}

		// Apartado b:
		if ((1 == x) || (10 > x++)) {
			System.out.println("Se cumple b.");
		}

		// Apartado c:
		System.out.println("c: " + ((++x) + x));

		// Apartado d:
		System.out.println("d: " + (x + (++x)));

		// Apartado e:
		if ((1 > x) || (1 > x--)) {
			System.out.println("Se cumple e." + x);
		}

		// Apartado f:
		if ((1 > x) || (1 > --x)) {
			System.out.println("Se cumple f.");
		}

	}
}
