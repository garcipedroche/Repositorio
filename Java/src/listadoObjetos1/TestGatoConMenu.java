package listadoObjetos1;

import utiles.Teclado;

public class TestGatoConMenu {
	public static void main(String[] args) {
		Gato gato = new Gato();
		String nombre, raza;
		int peso;
		do {
			System.out.println("Nombre del gatito:");
			nombre = Teclado.leerCadena();
			if (nombre.length() < 1)
				System.out
						.println("Error: El nombre del gatito no puede estar vacío.");
		} while (nombre.length() < 1);
		do {
			System.out.println("Raza del gatito:");
			raza = Teclado.leerCadena();
			if (raza.length() < 1)
				System.out
						.println("Error: La raza del gatito no puede estar vacía.");
		} while (raza.length() < 1);
		do {
			System.out.println("Peso del gatito:");
			peso = Teclado.leerEntero();
			if (peso <= 1000 || peso >= 4000)
				System.out
						.println("Error: El peso del gatito no puede ser menor de 1000 ni mayor de 4000.");
		} while (peso <= 1000 || peso >= 4000);

		gato.setNombre(nombre);
		gato.setRaza(raza);
		gato.setPeso(peso);

		int numero = mostrarMenu(gato);
		menu(numero, gato);

	}

	public static int mostrarMenu(Gato gato) {
		if (gato.getEstado() == "muerto") {
			return 5;
		} else {
			System.out.println("+------------------------------+");
			System.out.println("|        Lindo Gatito          |");
			System.out.println("+------------------------------+");
			System.out.println("|       ¿Que desea hacer?      |");
			System.out.println("|    1. Jugar con el Gatito    |");
			System.out.println("|    2. Alimentar al Gatito    |");
			System.out.println("|    3. Acostar al Gatito      |");
			System.out.println("|    4. Mirar a los Ojos       |");
			System.out.println("|    5. Dejar de jugar         |");
			System.out.println("+------------------------------+");
			int numero = Teclado.leerEntero();
			return numero;
		}
	}

	public static void menu(int numero, Gato gato) {
		switch (numero) {
		case 1:
			System.out.println("El gatito está jugando.");
			System.out.println("El gatito ha adelgazado 100 gramos.");
			gato.jugar();
			numero = mostrarMenu(gato);
			menu(numero, gato);

			break;
		case 2:
			System.out.println("El gatito está comiendo.");
			System.out.println("El gatito ha engordado 100 gramos.");
			gato.comer();
			numero = mostrarMenu(gato);
			menu(numero, gato);

			break;
		case 3:
			System.out.println("El gatito está durmiendo.");
			gato.dormir();
			numero = mostrarMenu(gato);
			menu(numero, gato);
			break;
		case 4:
			gato.mostrar();
			numero = mostrarMenu(gato);
			menu(numero, gato);
			break;
		case 5:
			System.out.println("Hasta pronto.");
			break;
		default:
			System.out.println("Error, opción no válida.");
			numero = mostrarMenu(gato);
			menu(numero, gato);
			break;
		}
	}
}
