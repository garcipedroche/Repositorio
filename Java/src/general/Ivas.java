package general;

import utiles.Teclado;

public class Ivas {
	public static void main(String[] args) {
		double x, x1, x2, x3, sr = 1.04, r = 1.1, g = 1.21;
		System.out.println("Introduce precio sin IVA:");
		x = Teclado.leerDecimal();
		System.out.println("Precio sin IVA:" + x);
		x1 = (x * sr);
		x2 = (x * r);
		x3 = (x * g);
		System.out.println("Precio con IVA Superreducido:" + x1);
		System.out.println("Precio con IVA Reducido:" + x2);
		System.out.println("Precio con IVA General:" + x3);
	}
}
