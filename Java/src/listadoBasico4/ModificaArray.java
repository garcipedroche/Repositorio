package listadoBasico4;

import utiles.Teclado;

/**
 * 4. Define la clase ModificaArray que almacene en un array de longitud
 * indicada por el usuario valores consecutivos (1, 2, 3…). Después se
 * solicitará al usuario un elemento del array (entre 1 y longitud) y su nuevo
 * valor para modificarlo. Este proceso de modificación de un elemento se
 * repetirá tantas veces como quiera el usuario (¿quiere modificar otro(s/n)?)
 * Al acabar, se visualizarán el array ya modificado.
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class ModificaArray {
	public static void main(String[] args) {
		int[] vector;
		int longitud;
		boolean resp;
		System.out.println("Longitud del Array:");
		longitud = Teclado.leerEntero();
		vector = crearVector(longitud);
		do{
		modificarValor(vector);
		resp=continuar("Desea cambiar otro valor");
		}while(resp==true);
		for(int i=0;i<longitud;i++){
			System.out.print(vector[i]+",");
		}
	}

	private static void modificarValor(int[] vector) {
		int posicion;
		System.out.println("¿Que posicion quiere cambiar? (entre 1 y "
				+ vector.length + "):");
		posicion = Teclado.leerEntero();
		System.out.println("¿Que valor quiere introducir en la posicion "
				+ posicion + "?");
		posicion -=1;
		vector[posicion]=Teclado.leerEntero();
	}

	private static int[] crearVector(int longitud) {
		int[] vector = new int[longitud];
		for (int i = 0; i < longitud; i++) {
			vector[i] = i;
		}
		return vector;
	}
	
	private static boolean continuar(String string) {
		char resp;
		boolean error;
		System.out.println("¿" + string + "? (s/n)");
		resp = Teclado.leerCaracter();
		if (resp == 's' || resp == 'S') {
			return true;
		} else {
			if (resp == 'n' || resp == 'N') {
				return false;
			} else {
				System.out.println("Error: Debe introducir (s/n)");
				error = continuar(string);
				return error;
			}
		}
	}
}
