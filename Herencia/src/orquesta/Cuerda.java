package orquesta;

public class Cuerda extends Instrumento {

	public Cuerda(String i) {
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
		tocar(Nota.FA);
		tocar(Nota.SOL);
		tocar(Nota.LA);
		System.out.println(queSoy() + " afinado.");
	}
}
