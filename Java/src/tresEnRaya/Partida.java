package tresEnRaya;

public class Partida {
	private String jugadorO;
	private String jugadorX;
	private String ganador;
	private Tablero tablero = new Tablero();

	Partida(String jugadorO, String jugadorX) {
		this.jugadorO = jugadorO;
		this.jugadorX = jugadorX;
	}

	void jugarPartida() {
		tablero.mostrarTablero();
		char finalizar = '0';
		for (int i = 0; i < 3; i++) {
			tablero.crearFicha('O', jugadorO);
			tablero.mostrarTablero();
			finalizar = tablero.ganador();
			if (finalizar == '0') {
				tablero.crearFicha('X', jugadorX);
				tablero.mostrarTablero();
				finalizar = tablero.ganador();
			}
		}

		while (finalizar != 'X' && finalizar != 'O'){
			tablero.moverFicha('O', jugadorO);
			tablero.mostrarTablero();
			finalizar = tablero.ganador();
			if (finalizar == '0') {
				tablero.moverFicha('X', jugadorX);
				tablero.mostrarTablero();
				finalizar = tablero.ganador();
			}
		}

		if (finalizar == 'X') {
			this.ganador = jugadorX;
		}
		if (finalizar == 'O') {
			this.ganador = jugadorO;
		}

		System.out.println("¡¡ENHORABUENA!! ¡" + this.ganador
				+ " ha ganado la partida!");

	}

	void mostrarTablero() {
		tablero.mostrarTablero();
	}

	String ganador() {
		return ganador;
	}
}
