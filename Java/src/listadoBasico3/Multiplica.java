package listadoBasico3;

/**
 * 11. Define la clase Multiplica que realice de forma repetitiva
 * multiplicaciones y las muestre, siempre y cuando el usuario responda
 * afirmativamente a la pregunta : “¿Desea continuar? (s/n)”. Para ello utiliza
 * un método continuar (ejercicio anterior) e implementa también el método
 * multiplicar con los dos argumentos que sean los factores. Ha de devolver su
 * producto. Documéntalo correctamente ( @ param y @ return)
 * 
 * 
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class Multiplica {
	public static void main(String[] args) {
		boolean resp;
		int x = 0, y = 0, prod;
		do {
			prod = multiplicar(x, y);
			System.out.println("El producto es = " + prod);
			resp = DeseaContinuar.continuar();

		} while (resp == true);
	}

	/**
	 * 
	 * @param x
	 *            introduce un valor por teclado.
	 * @param y
	 *            introduce un valor por teclado.
	 * @return devuelve el valor de multiplicar x*y.
	 */
	public static int multiplicar(int x, int y) {
		int prod;
		x = Suma2.introducir();
		y = Suma2.introducir();
		prod = x * y;
		return prod;
	}
}
