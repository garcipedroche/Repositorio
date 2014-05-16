package listadoBasico3;

import utiles.Teclado;

/**
 * 15. Define la clase IvaConMetodos que calcule los impuestos que se aplican a
 * un precio base en función de si el iva es superreducido (4%), reducido (10%)
 * o general (21%). Para ello define y usa los siguientes métodos: a. pedirIVA()
 * b. pedirPrecio() c. continuar() d. calcularIva(double, char)
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class IvaConMetodos {
	public static void main(String[] args) {
		boolean resp = true;
		char iva;
		double precio;
		do {
			iva = pedirIVA();
			if (iva != 's' && iva != 'r' && iva != 'g' && iva != 'S'
					&& iva != 'R' && iva != 'G') {
				System.out.println("Error: El iva debe ser s, r o g.");
				continue;
			}
			precio = pedirPrecio();
			calcularIva(precio, iva);
			resp = DeseaContinuar.continuar();
		} while (resp == true);

	}

	public static char pedirIVA() {
		char iva;
		System.out.println("Introduce IVA (debe ser s, r o g):");
		iva = Teclado.leerCaracter();
		return iva;
	}

	public static double pedirPrecio() {
		double precio;
		System.out.println("Introduce precio:");
		precio = Teclado.leerDecimal();
		return precio;
	}

	public static void calcularIva(double precio, char iva) {
		double resultado=0;
		if (iva == 's' || iva == 'S') {
			resultado = precio * 0.04;
		}
		if (iva == 'r' || iva == 'R') {
			resultado = precio * 0.10;
		}
		if (iva == 'g' || iva == 'G') {
			resultado = precio * 0.21;
		}
		System.out.println("El IVA para el precio " + precio + " es de "
				+ resultado);
		System.out.println("El precio final es:" + (resultado + precio));
	}
}
