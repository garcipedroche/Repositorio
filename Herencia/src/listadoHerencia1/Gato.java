package listadoHerencia1;

public class Gato extends Mamifero {
	Gato(String nombre) {
		super(nombre, 4);
	}

	protected void maullar() {
		System.out.println("Miau miau...");
	}
}