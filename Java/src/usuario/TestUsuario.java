package usuario;

import utiles.Teclado;

/**
 * 2. Entrega la clase TestUsuario que compruebe el funcionamiento de la clase
 * Usuario: Creará tres usuarios con las siguientes características: (123)
 * Nombre1 Apellidos1 Mikasa1 (456) Nombre4 Apellidos4 Mikasa4 (789) Nombre7
 * Apellidos7 Mikasa7 Los almacenará en un VECTOR (de usuarios, almacenará los
 * tres usuarios) Pedirá por teclado el dni de un usuario y mostrará el resto de
 * los atributos del usuario. Lo hará tantas veces como el usuario quiera.
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class TestUsuario {
	public static void main(String[] args) {
		Usuario usuario1 = new Usuario(123, "Nombre1", "Apellidos1", "Mikasa1");
		Usuario usuario2 = new Usuario(456, "Nombre4", "Apellidos4", "Mikasa4");
		Usuario usuario3 = new Usuario(789, "Nombre7", "Apellidos7", "Mikasa7");

		Usuario[] usuarios = new Usuario[3];
		usuarios[0] = usuario1;
		usuarios[1] = usuario2;
		usuarios[2] = usuario3;

		boolean repetir=true;
		do{
		int dni = mostrarMenu();
		repetir=mostrarDatos(usuarios, dni);}
		while(repetir==true);
	}

	/**
	 * Busca los datos de un usuario y los muestra por pantalla
	 * @param usuarios vector con todos los usuarios
	 * @param dni que deseas buscar
	 * @return
	 */
	private static boolean mostrarDatos(Usuario[] usuarios, int dni) {
		if (dni == 0) {
			return false;
		} else {
			int cont=0;
			for (int i = 0; i < usuarios.length; i++) {
				if (usuarios[i].getDni() == dni) {
					usuarios[i].mostrar();
				}else{
					cont++;
				}
			}
			if(cont==usuarios.length){
				System.out.println("El dni no existe, prueba otra vez.");
			}
			
		}
		return true;
	}

	/**
	 * 
	 * Muestra un menú con opciones y devuelve un entero (dni introducido)
	 * @return
	 */
	public static int mostrarMenu() {
		System.out.println("+------------------------------+");
		System.out.println("|        Ver Usuarios          |");
		System.out.println("+------------------------------+");
		System.out.println("|       ¿Que desea hacer?      |");
		System.out.println("|    123. Ver Usuario 1        |");
		System.out.println("|    456. Ver Usuario 2        |");
		System.out.println("|    789. Ver Usuario 3        |");
		System.out.println("|    0. Salir                  |");
		System.out.println("+------------------------------+");
		int numero = Teclado.leerEntero();
		return numero;
	}

}
