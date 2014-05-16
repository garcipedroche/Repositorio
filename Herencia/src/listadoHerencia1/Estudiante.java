package listadoHerencia1;

public class Estudiante extends Persona {
	Estudios estudios;

	Estudiante() {

	}

	public Estudiante(String nombre, String apellidos, String nif,
			Estudios estudios) {
		super(nombre, apellidos, nif);
		this.estudios = estudios;
	}

	@Override
	public String toString() {
		return super.toString() + "[estudios=" + estudios.name() + "]";
	}

	/**
	 * Metodo para comprobar si al hacer casting de estudiante a persona se
	 * puede acceder a este metodo
	 */
	void hacerExamen() {
		System.out.println("Estoy haciendo un examen.");
	}
}
