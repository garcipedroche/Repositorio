package listadoBasico4;

/**
 * 8. Define la clase AsignandoArrays tal y como muestra la captura. A�ade los
 * siguientes comentarios en las l�neas correspondientes: a. se referencia al
 * mismo objeto b. modificaci�n de los elementos c. declaraci�n de un array d.
 * se muestran los elementos del objeto array e. declaraci�n, construcci�n e
 * inicializaci�n de un array
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class AsignandoArrays {
	/**
	 * Declara, construye, inicializa y muestra arrays
	 */
	public static void main(String[] args) {
		int[] a1 = { 3, 5, 7, 11, 13 };// declaraci�n, construcci�n e
										// incializaci�n de un array
		int[] a2;// declaraci�n de un array
		int i;
		a2 = a1;// se referencia al mismo objeto
		for (i = 0; i < a2.length; i++)
			a2[i]++;// modificaci�n de los elementos
		for (i = 0; i < a1.length; i++)
			System.out.println("a1[" + i + "]=" + a1[i]);// se muestran los
															// elementos del
															// objeto array
	}
}
