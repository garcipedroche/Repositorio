package utiles;

/**
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class Menu {
	private String[] opciones;
	private int indiceSalir;

	public Menu(String[] opciones) {
		this.opciones = opciones;
		indiceSalir = opciones.length + 1;
	}

	public void mostrar() {
		System.out.println("");
		System.out.println("+--------------------------------------------+");
		System.out.println("\tElige una opcion (entre 1 y "
				+ getIndiceSalir() + ")");
		System.out.println("+--------------------------------------------+");
		for (int i = 0; i < opciones.length; i++) {
			System.out.println("\t" + (i + 1) + ") " + opciones[i]);
		}
		System.out.println("\t" + getIndiceSalir() + ") Salir");
		System.out.println("+--------------------------------------------+");
	}

	public int recogerOpcion() {
		do {
			int opcion = Teclado.leerEntero();
			if (opcion < 1 || opcion > opciones.length + 1)
				System.out.println("error");
			else {
				return opcion;
			}
		} while (true);
	}

	public int getIndiceSalir() {
		return indiceSalir;
	}
}