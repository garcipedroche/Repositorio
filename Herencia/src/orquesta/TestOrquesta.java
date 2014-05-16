package orquesta;

import utiles.Teclado;

public class TestOrquesta {
	public static void main(String[] args) {
		Orquesta orquesta = new Orquesta();

		orquesta.queSomos();

		orquesta.afinarOrquesta();

		do {
			orquesta.tocarInstrumentos();
		} while (Teclado.continuar("Desea tocar mas notas"));
	}
}
