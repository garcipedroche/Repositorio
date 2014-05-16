package listadoHerencia1;

public class Perro extends Mamifero{
	Perro(String nombre) {
		super(nombre, 4);
	}

	protected void ladrar() {
		System.out.println("Guau guau...");
	}
}
