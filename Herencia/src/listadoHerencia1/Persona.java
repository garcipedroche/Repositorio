package listadoHerencia1;

/**
 * 4. Diseña, implementa y prueba las clases Persona, Estudiante y
 * TestEstudiante. Para ello, supongamos que:
 * 
 * a. Una persona tiene nombre, apellidos y nif.
 * 
 * b. Un estudiante está cursando un curso dentro de un nivel (PRIMARIA, ESO,
 * BACHILLERARO, UNIVERSIDAD)
 * 
 * c. Implementa los métodos getters, setters y toString
 * 
 * d. En la clase TestEstudiante:
 * 
 * i. Cree dos personas
 * 
 * ii. Cree dos estudiantes
 * 
 * iii. Muestre los cuatro objetos
 * 
 * iv. Asigne un estudiante a una referencia de persona. ¿Qué métodos pueden
 * usarse?
 * 
 * v. Asigne una persona a un estudiante. ¿Qué métodos pueden usarse?
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class Persona {
	private String nombre;
	private String apellidos;
	private String nif;
	
	Persona(){
	}

	public Persona(String nombre, String apellidos, String nif) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", apellidos=" + apellidos
				+ ", nif=" + nif + "]";
	}
	
	
}
