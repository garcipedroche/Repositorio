package exMiguelRodriguezLopez;

/**
 * Previamente a las instrucciones, recuerda:

El c�digo no s�lo ha de compilar y funcionar seg�n estas disposiciones, sino que ha de ser entendible y eficiente, sin redundancia y con una finalidad clara.
Empaqueta todos los ficheros .java en el paquete exNombreApellido1Apellido2
Recuerda mantener la visibilidad m�s adecuada
Dale al c�digo un formato legible.
Entrega la carpeta completa del c�digo fuente comprimida en un fichero exNombreApellido1Apellido2
Genera la documentaci�n javadoc y entr�gala junto con el resto de los documentos. Para ello:
Cada clase ha de tener su comentario junto con el nombre del autor correctamente identificado seg�n javadoc
Documenta en cada clase al menos un campo y un m�todo, con sus argumentos
La conexi�n a la red queda TERMINANTEMENTE PROHIBIDA. S�lo podr� utilizarse para la descarga y para la entrega del examen.
El c�digo ser� generado por el alumno en el momento del examen, por lo que ha de ser eficiente.


Se pretende simular el comportamiento de una vajilla. 
La vajilla estar� formada por tantos platos como indique el usuario en su creaci�n. En caso de indicar un n�mero inferior a dos, se le solicitar� 
al usuario hasta que este introduzca un dato v�lido. Inicialmente, todos los platos de la vajilla estar�n llenos.
En la vajilla se implementar� un m�todo comerDelPlato(numeroPlato, cantidad) donde se decrementar� la cantidad que albergar� el plato.
En caso de ser un n�mero de plato err�neo (valores v�lidos son del 1 al n�mero total de platos en la vajilla ) la vajilla mostrar� el error "Plato err�neo" y no se realizar� la acci�n.
Lo mismo ocurrir� si la cantidad del plato a sorber no es v�lida (<=0), en cuyo caso mostrar� "cantidad err�nea" y no realizar� la acci�n.
Tambi�n se implementar�n los m�todos llenar(numeroPlato) y llenar(). Rellenar�n un plato y la vajilla al completo respectivamente.
Podr� mostrarse el estado actual de la vajilla, indic�ndose la cantidad de cada uno de los platos. En caso de estar lleno, se indicar� "Hasta arribita".
Cada plato de la vajilla tendr� una 
Capacidad m�xima de 200 (com�n a todos los platos de la vajilla)
Cantidad actual. No podr� ni exceder de la capacidad m�xima ni ser inferior a 0
Cada vez que alguien sorba (beba) del plato, este decrementar� su cantidad y mostrar� el mensaje "sorbiendo". En caso de no quedar, se indicar� "PISPAS"
El plato puede volver a llenarse hasta la cantidad m�xima. Entonces se indicar� "Hasta arribita"
Crea la clase TestVajilla que permita al usuario crear una vajilla e interactuar con ella. Puedes crear una clase Menu.
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 *
 */
public class TestVajilla {
	public static void main(String[] args) {
		int nplatos;
		do {
			System.out.println("N� de platos:");
			nplatos = Teclado.leerEntero();
			if (nplatos < 2) {
				System.out.println("Error, debe haber un m�nimo de 2 platos.");
			}
		} while (nplatos < 2);

		Vajilla vajilla = new Vajilla(nplatos);

		int numero;
		do {
			numero = mostrarMenu();
			menu(numero, vajilla);
		} while (numero != 5);
	}
	
	/**
	 * M�todo con un switch case que realiza acciones segun el parametro introducido
	 * @param numero parametro para elegir la opci�n
	 * @param vajilla objeto que contiene los platos
	 */
	private static void menu(int numero, Vajilla vajilla) {
		switch (numero) {
		case 1:
			System.out.println("�De que plato desea comer? (Entre 1 y "+vajilla.getLongitudVajilla()+")");
			int nPlatoComer = Teclado.leerEntero();
			System.out.println("�Qu� cantidad desea comer?");
			int cantidad = Teclado.leerEntero();
			vajilla.comerDelPlato(nPlatoComer-1, cantidad);
			//nPlatoComer-1 para que el usuario introduzca n�meros entre
			// 1 y n+1 y no entre 0 y n. Para mayor comodidad.
			break;
		case 2:
			System.out.println("�Qu� plato desea llenar? (Entre 1 y "+vajilla.getLongitudVajilla()+")");
			int nPlatoLlenar = Teclado.leerEntero();
			vajilla.llenar(nPlatoLlenar-1);
			//nPlatoLlenar-1 para que el usuario introduzca n�meros entre
			// 1 y n+1 y no entre 0 y n. Para mayor comodidad.
			break;
		case 3:
			vajilla.llenar();
			break;
		case 4:
			vajilla.mostrarse();
			break;
		case 5:
			System.out.println("Adios.");
			break;
		default:
			System.out.println("Error, debe elegir un n�mero entre 1 y 5.");
			break;
		}
	}
	
	/**
	 * Muestra un men� con opciones
	 * @return opci�n elegida
	 */
	private static int mostrarMenu() {
		System.out.println("+---------------------------+");
		System.out.println("|         Vajilla           |");
		System.out.println("+---------------------------+");
		System.out.println("|  1. Comer del Plato       |");
		System.out.println("|  2. Llenar Plato          |");
		System.out.println("|  3. Llenar Vajilla        |");
		System.out.println("|  4. Ver Vajilla           |");
		System.out.println("|  5. Salir                 |");
		System.out.println("+---------------------------+");
		int numero = Teclado.leerEntero();
		return numero;
	}
}
