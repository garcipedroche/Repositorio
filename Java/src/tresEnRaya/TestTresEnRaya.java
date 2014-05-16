package tresEnRaya;

import utiles.Teclado;

public class TestTresEnRaya {
	public static void main(String[] args) {
		System.out.println("Nombre de jugador 1:");
		String j1 = Teclado.leerCadena();
		System.out.println("Nombre de jugador 2:");
		String j2 = Teclado.leerCadena();

		Jugador jugador1 = new Jugador(j1);
		Jugador jugador2 = new Jugador(j2);

		Partida[] partidas = new Partida[15];
		int cont = 0;

		String ganador = jugador1.getNombre();
		String perdedor = jugador2.getNombre();

		boolean continuar;
		do {
			partidas[cont] = new Partida(ganador, perdedor);
			partidas[cont].jugarPartida();

			if (partidas[cont].ganador() == jugador1.getNombre()) {
				ganador = jugador1.getNombre();
				perdedor = jugador2.getNombre();
				jugador1.setPuntos();
			} else if (partidas[cont].ganador() == jugador2.getNombre()) {
				ganador = jugador2.getNombre();
				perdedor = jugador1.getNombre();
				jugador2.setPuntos();
			}

			System.out.println("+-------------------+");
			System.out.println("|      Ranking      |");
			System.out.println("+-------------------+");
			System.out.println(" " + jugador1.getNombre() + ": "
					+ jugador1.getPuntos());
			System.out.println(" " + jugador2.getNombre() + ": "
					+ jugador2.getPuntos());

			continuar = continuar();
			cont++;
		} while (continuar);

		for (int i = 0; i < cont; i++) {
			System.out.println("Partida " + (i + 1) + ": \nGanador: "+partidas[i].ganador());
			partidas[i].mostrarTablero();
		}
	}

	private static boolean continuar() {
		char resp;

		do {
			System.out.println("¿Quereis jugar otra partida? (S/N)");
			resp = Teclado.leerCaracter();
			if (resp != 's' && resp != 'S' && resp != 'n' && resp != 'N') {
				System.out.println("Error, debe contestar (S/N)");
			}
		} while (resp != 's' && resp != 'S' && resp != 'n' && resp != 'N');

		if (resp == 's' || resp == 'S') {
			return true;
		}

		return false;
	}
}
