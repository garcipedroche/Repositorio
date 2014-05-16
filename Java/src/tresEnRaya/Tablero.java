package tresEnRaya;

import utiles.Teclado;

public class Tablero {
	private Ficha[][] fichas;

	Tablero() {
		fichas = new Ficha[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				fichas[i][j] = new Ficha(' ');
			}
		}
	}

	void crearFicha(char tipoFicha, String jugador) {
		boolean posicionOcupada;
		do {
			int[] posicion = seleccionarFicha(jugador,
					"¿En que posición desea colocar la ficha? (entre 1 y 3)");

			posicionOcupada = estaPosicionOcupada(posicion);
			if (!posicionOcupada) {
				fichas[posicion[0]][posicion[1]].setTipoFicha(tipoFicha);
			} else {
				System.out.println("Esa posición ya está ocupada.");
			}
		} while (posicionOcupada);
	}

	void moverFicha(char tipoFicha, String jugador) {
		boolean posicionOcupada;
		do {
			int[] posicionOrigen = seleccionarFicha(jugador,
					"¿Que ficha desea mover? (entre 1 y 3)");

			posicionOcupada = estaPosicionOcupada(posicionOrigen);
			if (posicionOcupada) {
				if (fichas[posicionOrigen[0]][posicionOrigen[1]].getTipoFicha() == tipoFicha) {
					if (!estaRodeada(posicionOrigen)) {
						boolean posicionOcupadaDestino;
						do {
							int[] posicionDestino = seleccionarFicha(jugador,
									"¿A que posición desea mover la ficha? (entre 1 y 3)");
							boolean posicionAdyacente = esPosicionAdyacente(
									posicionOrigen, posicionDestino);
							if (posicionAdyacente) {
								posicionOcupadaDestino = estaPosicionOcupada(posicionDestino);
								if (!posicionOcupadaDestino) {
									fichas[posicionOrigen[0]][posicionOrigen[1]]
											.setTipoFicha(' ');
									fichas[posicionDestino[0]][posicionDestino[1]]
											.setTipoFicha(tipoFicha);
								} else {
									System.out
											.println("Esa posición ya está ocupada.");
								}
							} else {
								System.out
										.println("Las posiciones no son adyacentes.");
								posicionOcupadaDestino = true;
							}
						} while (posicionOcupadaDestino);
					} else {
						System.out.println("Error, esa ficha está rodeada.");
						posicionOcupada = false;
					}
				} else {
					System.out.println("Error, no puedes mover esa ficha.");
					posicionOcupada = false;
				}
			} else {
				System.out.println("Error, la posición está vacía.");
			}
		} while (!posicionOcupada);
	}

	char ganador() {
		if (fichas[0][0].getTipoFicha() == fichas[0][1].getTipoFicha()
				&& fichas[0][1].getTipoFicha() == fichas[0][2].getTipoFicha()
				&& fichas[0][0].getTipoFicha() != ' ') {
			return fichas[0][0].getTipoFicha();
		}
		if (fichas[1][0].getTipoFicha() == fichas[1][1].getTipoFicha()
				&& fichas[1][1].getTipoFicha() == fichas[1][2].getTipoFicha()
				&& fichas[1][0].getTipoFicha() != ' ') {
			return fichas[1][0].getTipoFicha();
		}
		if (fichas[2][0].getTipoFicha() == fichas[2][1].getTipoFicha()
				&& fichas[2][1].getTipoFicha() == fichas[2][2].getTipoFicha()
				&& fichas[2][0].getTipoFicha() != ' ') {
			return fichas[2][0].getTipoFicha();
		}

		if (fichas[0][0].getTipoFicha() == fichas[1][0].getTipoFicha()
				&& fichas[1][0].getTipoFicha() == fichas[2][0].getTipoFicha()
				&& fichas[0][0].getTipoFicha() != ' ') {
			return fichas[0][0].getTipoFicha();
		}
		if (fichas[0][1].getTipoFicha() == fichas[1][1].getTipoFicha()
				&& fichas[1][1].getTipoFicha() == fichas[2][1].getTipoFicha()
				&& fichas[0][1].getTipoFicha() != ' ') {
			return fichas[0][1].getTipoFicha();
		}
		if (fichas[0][2].getTipoFicha() == fichas[1][2].getTipoFicha()
				&& fichas[1][2].getTipoFicha() == fichas[2][2].getTipoFicha()
				&& fichas[0][2].getTipoFicha() != ' ') {
			return fichas[0][2].getTipoFicha();
		}

		if (fichas[0][0].getTipoFicha() == fichas[1][1].getTipoFicha()
				&& fichas[1][1].getTipoFicha() == fichas[2][2].getTipoFicha()
				&& fichas[0][0].getTipoFicha() != ' ') {
			return fichas[0][0].getTipoFicha();
		}
		if (fichas[0][2].getTipoFicha() == fichas[1][1].getTipoFicha()
				&& fichas[1][1].getTipoFicha() == fichas[2][0].getTipoFicha()
				&& fichas[0][2].getTipoFicha() != ' ') {
			return fichas[0][2].getTipoFicha();
		}

		return '0';
	}

	void mostrarTablero() {
		System.out.println("\\");
		System.out.println(" \\X    1         2         3");
		System.out.println(" Y\\ ");
		System.out.println("     +---+     +---+     +---+");
		System.out.println(" 1   | " + fichas[0][0].getTipoFicha()
				+ " |-----| " + fichas[1][0].getTipoFicha() + " |-----| "
				+ fichas[2][0].getTipoFicha() + " |");
		System.out.println("     +---+     +---+     +---+");
		System.out.println("       |  \\      |      /  |  ");
		System.out.println("       |   \\     |     /   |  ");
		System.out.println("       |    \\    |    /    |  ");
		System.out.println("       |     \\   |   /     |  ");
		System.out.println("       |      \\  |  /      |  ");
		System.out.println("     +---+     +---+     +---+");
		System.out.println(" 2   | " + fichas[0][1].getTipoFicha()
				+ " |-----| " + fichas[1][1].getTipoFicha() + " |-----| "
				+ fichas[2][1].getTipoFicha() + " |");
		System.out.println("     +---+     +---+     +---+");
		System.out.println("       |      /  |  \\      |  ");
		System.out.println("       |     /   |   \\     |  ");
		System.out.println("       |    /    |    \\    |  ");
		System.out.println("       |   /     |     \\   |  ");
		System.out.println("       |  /      |      \\  |  ");
		System.out.println("     +---+     +---+     +---+");
		System.out.println(" 3   | " + fichas[0][2].getTipoFicha()
				+ " |-----| " + fichas[1][2].getTipoFicha() + " |-----| "
				+ fichas[2][2].getTipoFicha() + " |");
		System.out.println("     +---+     +---+     +---+");
	}

	private int[] seleccionarFicha(String jugador, String texto) {
		boolean repetir;
		int[] posiciones = new int[2];
		do {
			System.out.println("Jugador: " + jugador);
			System.out.println("Coordenada X:" + texto);
			posiciones[0] = Teclado.leerEntero();
			System.out.println("Coordenada Y:" + texto);
			posiciones[1] = Teclado.leerEntero();
			if (posiciones[0] > 3 || posiciones[0] < 1 || posiciones[1] > 3
					|| posiciones[1] < 1) {
				System.out
						.println("La posicion X y la posicion Y deben ser entre 1 y 3.");
				repetir = true;
			} else {
				posiciones[0] -= 1;
				posiciones[1] -= 1;
				repetir = false;
			}
		} while (repetir);
		return posiciones;
	}

	private boolean estaPosicionOcupada(int[] posicion) {

		if (fichas[posicion[0]][posicion[1]].getTipoFicha() != ' ') {
			return true;
		}
		return false;
	}

	private boolean esPosicionAdyacente(int[] posicionOrigen,
			int[] posicionDestino) {
		if (posicionOrigen[0] == posicionDestino[0]
				&& posicionOrigen[1] == posicionDestino[1]) {
			return false;
		}

		switch (posicionOrigen[0]) {
		case 0:
			switch (posicionOrigen[1]) {
			case 0:
				if ((posicionDestino[0] == 1 && posicionDestino[1] == 0)
						|| (posicionDestino[0] == 0 && posicionDestino[1] == 1)
						|| (posicionDestino[0] == 1 && posicionDestino[1] == 1)) {
					return true;
				}
				break;
			case 1:
				if ((posicionDestino[0] == 0 && posicionDestino[1] == 0)
						|| (posicionDestino[0] == 0 && posicionDestino[1] == 2)
						|| (posicionDestino[0] == 1 && posicionDestino[1] == 1)) {
					return true;
				}
				break;
			case 2:
				if ((posicionDestino[0] == 0 && posicionDestino[1] == 1)
						|| (posicionDestino[0] == 1 && posicionDestino[1] == 2)
						|| (posicionDestino[0] == 1 && posicionDestino[1] == 1)) {
					return true;
				}
				break;
			}
			break;
		case 1:
			switch (posicionOrigen[1]) {
			case 0:
				if ((posicionDestino[0] == 0 && posicionDestino[1] == 0)
						|| (posicionDestino[0] == 2 && posicionDestino[1] == 0)
						|| (posicionDestino[0] == 1 && posicionDestino[1] == 1)) {
					return true;
				}
				break;
			case 1:
				return true;
			case 2:
				if ((posicionDestino[0] == 0 && posicionDestino[1] == 2)
						|| (posicionDestino[0] == 2 && posicionDestino[1] == 2)
						|| (posicionDestino[0] == 1 && posicionDestino[1] == 1)) {
					return true;
				}
				break;
			}
			break;
		case 2:
			switch (posicionOrigen[1]) {
			case 0:
				if ((posicionDestino[0] == 1 && posicionDestino[1] == 0)
						|| (posicionDestino[0] == 2 && posicionDestino[1] == 1)
						|| (posicionDestino[0] == 1 && posicionDestino[1] == 1)) {
					return true;
				}
				break;
			case 1:
				if ((posicionDestino[0] == 2 && posicionDestino[1] == 2)
						|| (posicionDestino[0] == 2 && posicionDestino[1] == 0)
						|| (posicionDestino[0] == 1 && posicionDestino[1] == 1)) {
					return true;
				}
				break;
			case 2:
				if ((posicionDestino[0] == 1 && posicionDestino[1] == 2)
						|| (posicionDestino[0] == 2 && posicionDestino[1] == 1)
						|| (posicionDestino[0] == 1 && posicionDestino[1] == 1)) {
					return true;
				}
				break;
			}
			break;
		}
		return false;
	}

	private boolean estaRodeada(int[] posicion) {
		if (posicion[0] == 1 && posicion[1] == 1) {
			return false;
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int[] posicion2 = { i, j };
				if (esPosicionAdyacente(posicion, posicion2)) {
					if (!estaPosicionOcupada(posicion2)) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
