package exMiguelRodriguezLopez;

/**
 * Previamente a las instrucciones, recuerda:

El código no sólo ha de compilar y funcionar según estas disposiciones, sino que ha de ser entendible y eficiente, sin redundancia y con una finalidad clara.
Empaqueta todos los ficheros .java en el paquete exNombreApellido1Apellido2
Recuerda mantener la visibilidad más adecuada
Dale al código un formato legible.
Entrega la carpeta completa del código fuente comprimida en un fichero exNombreApellido1Apellido2
Genera la documentación javadoc y entrégala junto con el resto de los documentos. Para ello:
Cada clase ha de tener su comentario junto con el nombre del autor correctamente identificado según javadoc
Documenta en cada clase al menos un campo y un método, con sus argumentos
La conexión a la red queda TERMINANTEMENTE PROHIBIDA. Sólo podrá utilizarse para la descarga y para la entrega del examen.
El código será generado por el alumno en el momento del examen, por lo que ha de ser eficiente.


Se pretende simular el comportamiento de una vajilla. 
La vajilla estará formada por tantos platos como indique el usuario en su creación. En caso de indicar un número inferior a dos, se le solicitará 
al usuario hasta que este introduzca un dato válido. Inicialmente, todos los platos de la vajilla estarán llenos.
En la vajilla se implementará un método comerDelPlato(numeroPlato, cantidad) donde se decrementará la cantidad que albergará el plato.
En caso de ser un número de plato erróneo (valores válidos son del 1 al número total de platos en la vajilla ) la vajilla mostrará el error "Plato erróneo" y no se realizará la acción.
Lo mismo ocurrirá si la cantidad del plato a sorber no es válida (<=0), en cuyo caso mostrará "cantidad errónea" y no realizará la acción.
También se implementarán los métodos llenar(numeroPlato) y llenar(). Rellenarán un plato y la vajilla al completo respectivamente.
Podrá mostrarse el estado actual de la vajilla, indicándose la cantidad de cada uno de los platos. En caso de estar lleno, se indicará "Hasta arribita".
Cada plato de la vajilla tendrá una 
Capacidad máxima de 200 (común a todos los platos de la vajilla)
Cantidad actual. No podrá ni exceder de la capacidad máxima ni ser inferior a 0
Cada vez que alguien sorba (beba) del plato, este decrementará su cantidad y mostrará el mensaje "sorbiendo". En caso de no quedar, se indicará "PISPAS"
El plato puede volver a llenarse hasta la cantidad máxima. Entonces se indicará "Hasta arribita"
Crea la clase TestVajilla que permita al usuario crear una vajilla e interactuar con ella. Puedes crear una clase Menu.
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 *
 */
public class TestVajilla {
	public static void main(String[] args) {
		int nplatos;
		do {
			System.out.println("Nº de platos:");
			nplatos = Teclado.leerEntero();
			if (nplatos < 2) {
				System.out.println("Error, debe haber un mínimo de 2 platos.");
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
	 * Método con un switch case que realiza acciones segun el parametro introducido
	 * @param numero parametro para elegir la opción
	 * @param vajilla objeto que contiene los platos
	 */
	private static void menu(int numero, Vajilla vajilla) {
		switch (numero) {
		case 1:
			System.out.println("¿De que plato desea comer? (Entre 1 y "+vajilla.getLongitudVajilla()+")");
			int nPlatoComer = Teclado.leerEntero();
			System.out.println("¿Qué cantidad desea comer?");
			int cantidad = Teclado.leerEntero();
			vajilla.comerDelPlato(nPlatoComer-1, cantidad);
			//nPlatoComer-1 para que el usuario introduzca números entre
			// 1 y n+1 y no entre 0 y n. Para mayor comodidad.
			break;
		case 2:
			System.out.println("¿Qué plato desea llenar? (Entre 1 y "+vajilla.getLongitudVajilla()+")");
			int nPlatoLlenar = Teclado.leerEntero();
			vajilla.llenar(nPlatoLlenar-1);
			//nPlatoLlenar-1 para que el usuario introduzca números entre
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
			System.out.println("Error, debe elegir un número entre 1 y 5.");
			break;
		}
	}
	
	/**
	 * Muestra un menú con opciones
	 * @return opción elegida
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
