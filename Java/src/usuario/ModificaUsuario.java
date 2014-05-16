package usuario;

/**
 * 3. Entrega la clase ModificaUsuario que compruebe el funcionamiento de la
 * clase Usuario:
 * 
 * Creará un objeto usu1 con las siguientes características: (123) Rompetechos
 * Apellidos1 Mikasa1 Utilizará el constructor vacío. Como el usuario se ha
 * mudado, cambiará de dirección: (123) Rompetechos Apellidos1 Num. 13 de la Rue
 * del Percebe Cada vez que se modifique el estado del objeto, se mostrarán
 * todos los atributos. Para ello crea un método en la clase Usuario, por
 * ejemplo, muestraEstado().
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class ModificaUsuario {
	public static void main(String[] args) {
		Usuario usu1= new Usuario();
		usu1.setDni(123);
		usu1.setNombre("Rompetechos");
		usu1.setApellidos("Apellidos1");
		usu1.setDireccion("Mikasa1");
		usu1.setDireccion("Num. 13 de la Rue del Percebe");
		
	}
}
