package orquesta;

public class Percusion extends Instrumento {
	
	public Percusion(String i) {
		super(i);
	}

	@Override
	void tocar(Nota nota) {
		System.out.println("Tocando la nota " + nota + " con " + getI());
	}

	@Override
	String queSoy() {
		return super.queSoy() + " de " + getClass().getSimpleName();
	}

	@Override
	void afinar() {
		System.out.println("\nAfinando " + queSoy() + ":");
		tocar(Nota.DO);
		tocar(Nota.DO);
		tocar(Nota.DO);
		System.out.println(queSoy() + " afinado.");
	}
}
