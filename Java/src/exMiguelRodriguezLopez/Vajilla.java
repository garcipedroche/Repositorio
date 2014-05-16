package exMiguelRodriguezLopez;

/**
 * Previamente a las instrucciones, recuerda:
 * 
 * El código no sólo ha de compilar y funcionar según estas disposiciones, sino
 * que ha de ser entendible y eficiente, sin redundancia y con una finalidad
 * clara. Empaqueta todos los ficheros .java en el paquete
 * exNombreApellido1Apellido2 Recuerda mantener la visibilidad más adecuada Dale
 * al código un formato legible. Entrega la carpeta completa del código fuente
 * comprimida en un fichero exNombreApellido1Apellido2 Genera la documentación
 * javadoc y entrégala junto con el resto de los documentos. Para ello: Cada
 * clase ha de tener su comentario junto con el nombre del autor correctamente
 * identificado según javadoc Documenta en cada clase al menos un campo y un
 * método, con sus argumentos La conexión a la red queda TERMINANTEMENTE
 * PROHIBIDA. Sólo podrá utilizarse para la descarga y para la entrega del
 * examen. El código será generado por el alumno en el momento del examen, por
 * lo que ha de ser eficiente.
 * 
 * 
 * Se pretende simular el comportamiento de una vajilla. La vajilla estará
 * formada por tantos platos como indique el usuario en su creación. En caso de
 * indicar un número inferior a dos, se le solicitará al usuario hasta que este
 * introduzca un dato válido. Inicialmente, todos los platos de la vajilla
 * estarán llenos. En la vajilla se implementará un método
 * comerDelPlato(numeroPlato, cantidad) donde se decrementará la cantidad que
 * albergará el plato. En caso de ser un número de plato erróneo (valores
 * válidos son del 1 al número total de platos en la vajilla ) la vajilla
 * mostrará el error "Plato erróneo" y no se realizará la acción. Lo mismo
 * ocurrirá si la cantidad del plato a sorber no es válida (<=0), en cuyo caso
 * mostrará "cantidad errónea" y no realizará la acción. También se
 * implementarán los métodos llenar(numeroPlato) y llenar(). Rellenarán un plato
 * y la vajilla al completo respectivamente. Podrá mostrarse el estado actual de
 * la vajilla, indicándose la cantidad de cada uno de los platos. En caso de
 * estar lleno, se indicará "Hasta arribita".
 * 
 * Cada plato de la vajilla tendrá una Capacidad máxima de 200 (común a todos
 * los platos de la vajilla) Cantidad actual. No podrá ni exceder de la
 * capacidad máxima ni ser inferior a 0 Cada vez que alguien sorba (beba) del
 * plato, este decrementará su cantidad y mostrará el mensaje "sorbiendo". En
 * caso de no quedar, se indicará "PISPAS" El plato puede volver a llenarse
 * hasta la cantidad máxima. Entonces se indicará "Hasta arribita" Crea la clase
 * TestVajilla que permita al usuario crear una vajilla e interactuar con ella.
 * Puedes crear una clase Menu.
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class Vajilla {
	/**
	 * Vector que contiene todos los platos de la vajilla
	 */
	private Plato[] vajilla;

	public int getLongitudVajilla() {
		return vajilla.length;
	}

	public Vajilla(int numeroPlatos) {
		vajilla = new Plato[numeroPlatos];
		for (int i = 0; i < numeroPlatos; i++) {
			this.vajilla[i] = new Plato();
		}
		llenar();

	}

	/**
	 * Llena todos los platos al máximo
	 */
	public void llenar() {
		for (int i = 0; i < vajilla.length; i++) {
			vajilla[i].setCantidad(200);
		}
		System.out.println("Todos los platos están hasta arribita.");
	}

	/**
	 * Llena un plato específico al máximo
	 * 
	 * @param numeroPlato
	 *            que se desea llenar
	 */
	public void llenar(int numeroPlato) {
		boolean plato = comprobarPlato(numeroPlato);
		if (plato) {
			vajilla[numeroPlato].setCantidad(200);
			System.out.println("Ahora el plato está hasta arribita.");
		} else {
			System.out.println("Plato Erróneo.");
		}
	}

	/**
	 * Método que decrementa la cantidad del plato elegido si es posible
	 * 
	 * @param numeroPlato
	 *            del que desea comer
	 * @param cantidad
	 *            que desea comer
	 */
	public void comerDelPlato(int numeroPlato, int cantidad) {
		boolean plato = comprobarPlato(numeroPlato);
		if (cantidad > -1) {
			if (plato) {
				if (vajilla[numeroPlato].getCantidad() >= cantidad) {
					vajilla[numeroPlato].comer(cantidad);
					System.out.println("Sorbiendo...");
					if (vajilla[numeroPlato].getCantidad() == 0) {
						System.out.println("PISPAS..");
					}
				} else {
					System.out
							.println("No hay tanta cantidad en el plato. Queda "
									+ vajilla[numeroPlato].getCantidad() + ".	");
				}
			} else {
				System.out.println("Plato Erróneo.");
			}
		}else{
			System.out.println("La cantidad no puede ser negativa.");
		}
	}

	private boolean comprobarPlato(int numeroPlato) {
		return (numeroPlato >= vajilla.length || numeroPlato < 0) ? false
				: true;
	}

	public void mostrarse() {
		System.out.println("Platos: ");
		for (int i = 0; i < vajilla.length; i++) {
			if (vajilla[i].getCantidad() == 200) {
				System.out.println("Plato " + (i + 1) + ": Hasta arribita");
			} else {
				System.out.println("Plato " + (i + 1) + ": "
						+ vajilla[i].getCantidad());
			}
		}
	}
}
