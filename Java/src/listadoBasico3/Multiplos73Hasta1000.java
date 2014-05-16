package listadoBasico3;

/**
 * 4. El siguiente código muestra el funcionamiento de las palabras reservadas
 * break y continue. Similar a este código, crea la clase Multiplos17Hasta200
 * que utilice el bucle for, y Multiplos73Hasta1000 que utilice el bucle
 * do-while.
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class Multiplos73Hasta1000 {
	public static void main(String[] args) {
		int i = 0;
		System.out.println("Múltiplos de 73 hasta 1000: ");
		while (true) {
			i++;
			if (i > 1000)
				break;
			if (i % 73 != 0)
				continue;
			System.out.print("\t" + i);
		}
	}
}