package listadoBasico3;

/**
 * 4. El siguiente c�digo muestra el funcionamiento de las palabras reservadas
 * break y continue. Similar a este c�digo, crea la clase Multiplos17Hasta200
 * que utilice el bucle for, y Multiplos73Hasta1000 que utilice el bucle
 * do-while.
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class Multiplos17Hasta200 {
	public static void main(String[] args) {
		int i = 0;
		System.out.println("M�ltiplos de 7 hasta 100: ");
		while (true) {
			i++;
			if (i > 100)
				break;
			if (i % 7 != 0)
				continue;
			System.out.print("\t" + i);
		}
	}
}