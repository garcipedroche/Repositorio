package exMiguelRodriguezLopez;

/**
 * Previamente a las instrucciones, recuerda:
 * 
 * El c�digo no s�lo ha de compilar y funcionar seg�n estas disposiciones, sino
 * que ha de ser entendible y eficiente, sin redundancia y con una finalidad
 * clara. Empaqueta todos los ficheros .java en el paquete
 * exNombreApellido1Apellido2 Recuerda mantener la visibilidad m�s adecuada Dale
 * al c�digo un formato legible. Entrega la carpeta completa del c�digo fuente
 * comprimida en un fichero exNombreApellido1Apellido2 Genera la documentaci�n
 * javadoc y entr�gala junto con el resto de los documentos. Para ello: Cada
 * clase ha de tener su comentario junto con el nombre del autor correctamente
 * identificado seg�n javadoc Documenta en cada clase al menos un campo y un
 * m�todo, con sus argumentos La conexi�n a la red queda TERMINANTEMENTE
 * PROHIBIDA. S�lo podr� utilizarse para la descarga y para la entrega del
 * examen. El c�digo ser� generado por el alumno en el momento del examen, por
 * lo que ha de ser eficiente.
 * 
 * 
 * Se pretende simular el comportamiento de una vajilla. La vajilla estar�
 * formada por tantos platos como indique el usuario en su creaci�n. En caso de
 * indicar un n�mero inferior a dos, se le solicitar� al usuario hasta que este
 * introduzca un dato v�lido. Inicialmente, todos los platos de la vajilla
 * estar�n llenos. En la vajilla se implementar� un m�todo
 * comerDelPlato(numeroPlato, cantidad) donde se decrementar� la cantidad que
 * albergar� el plato. En caso de ser un n�mero de plato err�neo (valores
 * v�lidos son del 1 al n�mero total de platos en la vajilla ) la vajilla
 * mostrar� el error "Plato err�neo" y no se realizar� la acci�n. Lo mismo
 * ocurrir� si la cantidad del plato a sorber no es v�lida (<=0), en cuyo caso
 * mostrar� "cantidad err�nea" y no realizar� la acci�n. Tambi�n se
 * implementar�n los m�todos llenar(numeroPlato) y llenar(). Rellenar�n un plato
 * y la vajilla al completo respectivamente. Podr� mostrarse el estado actual de
 * la vajilla, indic�ndose la cantidad de cada uno de los platos. En caso de
 * estar lleno, se indicar� "Hasta arribita".
 * 
 * Cada plato de la vajilla tendr� una Capacidad m�xima de 200 (com�n a todos
 * los platos de la vajilla) Cantidad actual. No podr� ni exceder de la
 * capacidad m�xima ni ser inferior a 0 Cada vez que alguien sorba (beba) del
 * plato, este decrementar� su cantidad y mostrar� el mensaje "sorbiendo". En
 * caso de no quedar, se indicar� "PISPAS" El plato puede volver a llenarse
 * hasta la cantidad m�xima. Entonces se indicar� "Hasta arribita" Crea la clase
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
	 * Llena todos los platos al m�ximo
	 */
	public void llenar() {
		for (int i = 0; i < vajilla.length; i++) {
			vajilla[i].setCantidad(200);
		}
		System.out.println("Todos los platos est�n hasta arribita.");
	}

	/**
	 * Llena un plato espec�fico al m�ximo
	 * 
	 * @param numeroPlato
	 *            que se desea llenar
	 */
	public void llenar(int numeroPlato) {
		boolean plato = comprobarPlato(numeroPlato);
		if (plato) {
			vajilla[numeroPlato].setCantidad(200);
			System.out.println("Ahora el plato est� hasta arribita.");
		} else {
			System.out.println("Plato Err�neo.");
		}
	}

	/**
	 * M�todo que decrementa la cantidad del plato elegido si es posible
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
				System.out.println("Plato Err�neo.");
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
