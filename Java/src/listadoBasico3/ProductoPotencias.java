package listadoBasico3;

/**
 * 7. Define la clase ProductoPotencias que calcule y visualice el producto de
 * las potencias de 2 entre 0 y 10 .
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class ProductoPotencias {
	public static void main(String[] args) {
		int i, x;
		for (i = 0; i < 11; i++) {
			x =(int) Math.pow(2, i);
			System.out.println("Producto de 2^" + i + ": " + x);

		}
	}
}
