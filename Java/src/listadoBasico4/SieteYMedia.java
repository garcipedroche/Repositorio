package listadoBasico4;

import utiles.Teclado;

/**
 * 12. Define la clase SieteYMedia que permita al usuario jugar a las siete y
 * media. Para ello, has de almacena r las 40 cartas en un array bidimensional.
 * Utiliza el método Math.random() para seleccionar una de ellas. Recuerda que
 * no pueden seleccionarse dos veces. El jugador decide si seguir arriesgando o
 * no mediante una pregunta.
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class SieteYMedia {
	public static void main(String[] args) {
		boolean continuar;
		do {
			int[][] cartas = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
					{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
					{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
					{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } };
			System.out.println("+------------------+");
			System.out.println("|  Siete y Media   |");
			System.out.println("+------------------+");
			int njugadores = pedirDimension("Nº de jugadores (max 5):");
			if (njugadores > 5) {
				System.out.println("Error: El máximo de jugadores es 5.");
			} else {
				double[] puntos = new double[njugadores];
				int ganador;
				for (int i = 0; i < njugadores; i++) {
					puntos[i] = jugar(i, cartas);
				}

				System.out.println("+-----------------------+");
				System.out.println("|      Resultados:      |");
				for (int i = 0; i < njugadores; i++) {
					if (puntos[i] < 10)
						System.out.println("|    Jugador " + i + ": "
								+ puntos[i] + "     |");
					else
						System.out.println("|    Jugador " + i + ": "
								+ puntos[i] + "    |");
				}
				System.out.println("+-----------------------+");
				ganador = ganador(puntos);
				if (ganador == -1) {
					System.out
							.println("+--------------------------------------------------+");
					System.out
							.println("| ¡OHHHH! Todos los jugadores se han pasado de 7.5 |");
					System.out
							.println("|                 No hay ganador                   |");
					System.out
							.println("+--------------------------------------------------+");
				} else {
					System.out
							.println("+--------------------------------------------------+");
					System.out
							.println("|             ¡¡¡¡¡ENHORABUENA!!!!!                |");
					System.out.println("|          ¡¡Ha ganado el Jugador "
							+ ganador + "!!              |");
					System.out
							.println("+--------------------------------------------------+");
				}
			}
			continuar = continuar("Quiere jugar de nuevo");
		} while (continuar == true);
	}

	private static int pedirDimension(String string) {
		int dimension;
		System.out.println(string);
		dimension = Teclado.leerEntero();
		return dimension;
	}

	private static boolean continuar(String string) {
		char resp;
		boolean error;
		System.out.println("¿" + string + "? (s/n)");
		resp = Teclado.leerCaracter();
		if (resp == 's' || resp == 'S') {
			return true;
		} else {
			if (resp == 'n' || resp == 'N') {
				return false;
			} else {
				System.out.println("Error: Debe introducir (s/n)");
				error = continuar(string);
				return error;
			}
		}
	}

	private static int ganador(double[] puntos) {
		int ganador = 0;
		for (int i = 1; i < puntos.length; i++) {
			if (puntos[i] > 7.5) {
				continue;
			} else {
				if (puntos[i] > puntos[ganador] || puntos[ganador] > 7.5) {
					ganador = i;
				}
			}
		}

		System.out.println(ganador);
		if (puntos[ganador] > 7.5) {
			ganador = -1;
		}
		return ganador;
	}

	private static double jugar(int jugador, int[][] cartas) {
		boolean pedircarta;
		double puntos = 0;
		double carta;
		System.out.println("Jugador " + jugador + ":");
		do {
			carta = generarCarta(cartas);
			if (carta == 8.0 || carta == 9.0 || carta == 10.0)
				carta = 0.5;
			puntos += carta;
			System.out.println("Lleva " + puntos + " puntos.");
			if (puntos > 7.5) {
				pedircarta = false;
				System.out
						.println("Te has pasado de 7.5, ya no puedes coger mas cartas.");
			} else {
				pedircarta = continuar("Desea otra carta");
			}
			System.out.println("---------------------------");
			System.out.println("---------------------------");
		} while (pedircarta == true);
		return puntos;
	}

	private static double generarCarta(int[][] cartas) {
		int i = ((int) (Math.random() * 4));
		int j = ((int) (Math.random() * 10));
		int carta;
		String palo = "";
		if (i == 0) {
			palo = "Copas";
		}
		if (i == 1) {
			palo = "Bastos";
		}
		if (i == 2) {
			palo = "Espadas";
		}
		if (i == 3) {
			palo = "Oros";
		}
		carta = cartas[i][j];
		if (carta != -1) {
			if (j != 0 && j != 7 && j != 8 && j != 9) {

				System.out.println("Te ha tocado el " + carta + " de " + palo
						+ ".");
			} else {
				if (j == 9)
					System.out.println("Te ha tocado el Rey de " + palo + ".");
				if (j == 8)
					System.out.println("Te ha tocado el Caballo de " + palo
							+ ".");
				if (j == 7)
					System.out.println("Te ha tocado la Sota de " + palo + ".");
				if (j == 0)
					System.out.println("Te ha tocado el As de " + palo + ".");
			}
			cartas[i][j] = -1;
		} else {// La carta ya se ha creado
			carta = (int) generarCarta(cartas);
		}
		return (double) carta;
	}

	/*private static int cuantasCartasQuedan(int[][] cartas) {
		int cartasQueQuedan = cartas.length * cartas[0].length;
		for (int i = 0; i < cartas.length; i++) {
			for (int j = 0; j < cartas[0].length; j++) {
				if (cartas[i][j] == -1) {
					cartasQueQuedan--;
				}
			}
		}
		return cartasQueQuedan;
	}*/
}
