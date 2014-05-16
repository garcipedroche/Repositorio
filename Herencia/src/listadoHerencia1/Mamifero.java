package listadoHerencia1;

public class Mamifero {
	private String nombre;
	private int patas;

	Mamifero() {
	}

	Mamifero(String nombre, int patas) {
		this.nombre = nombre;
		this.patas = patas;
	}
	
	@Override
	public String toString() {
		return "[nombre=" + nombre + ", patas=" + patas + "]";
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getPatas() {
		return patas;
	}

	protected void setPatas(int patas) {
		this.patas = patas;
	}
}
