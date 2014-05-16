package usuario;

/**
 * 1. Define la clase Usuario que contenga:
 * 
 * Campos (almacenen los siguientes atributos del usuario): dni nombre apellidos
 * dirección Constructores Uno sin argumentos Otro con cuatro argumentos (uno
 * por cada campo) Métodos (por cada campo) getCampo1 setCampo1
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class Usuario {
	private int dni;
	private String nombre;
	private String apellidos;
	private String direccion;

	/*
	 * Constructor vacío
	 */
	public Usuario() {

	}

	/*
	 * Constructor con 4 argumentos
	 */
	public Usuario(int dni, String nombre, String apellidos, String direcccion) {
		setDni(dni);
		setNombre(nombre);
		setApellidos(apellidos);
		setDireccion(direcccion);
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
		mostrar();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		mostrar();
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
		mostrar();
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
		mostrar();
	}

	/*
	 * Muestra las propiedades de un objeto
	 */
	public void mostrar() {
		System.out.println("Datos:\n Dni: " + dni + " Nombre: " + nombre
				+ " Apellidos: " + apellidos + " Direccion: " + direccion);
	}

}
