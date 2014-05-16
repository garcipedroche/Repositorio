package listadoObjetos1;

import utiles.Teclado;

public class TestCirculo {
	public static void main(String[] args) {
		Circulo circulo = new Circulo();

		int radio;
		do {
			System.out.println("Introduce radio (m):");
			radio = Teclado.leerEntero();
			if (radio < 0)
				System.out.println("Error: El radio debe ser positivo.");
		} while (radio < 0);
		
		circulo.setRadio(radio);
		System.out.println("Circulo inicial:");
		circulo.mostrar();
		System.out.println("\n\n\nAumentando Radio:");
		for (int i = 0; i < 27; i++) {
			circulo.setRadio(1);
			System.out.println("");
			circulo.mostrar();
		}
		System.out.println("\n\n\nDisminuyendo Radio:");
		for (int i = 0; i < 10; i++) {
			circulo.setRadio(-1);
			System.out.println("");
			circulo.mostrar();
		}

	}
}
