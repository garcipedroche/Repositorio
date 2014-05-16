package listadoBasico4;

/**
 * 
 * 3. Define la clase Notas que almacene en un array 15 notas. Las notas se
 * inicializarán de forma aleatoria con enteros entre 0 y 10. Se visualizarán
 * las notas resultantes.
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class Notas {
	public static void main(String[] args) {
		int[] notas = new int[15];
		for (int i = 0; i < 15; i++) {
			notas[i] = (int) (Math.random() * 11);
			System.out.println("Nota "+i+": "+notas[i]);
		}
	}
}
