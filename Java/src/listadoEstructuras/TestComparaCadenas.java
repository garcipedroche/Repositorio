package listadoEstructuras;

/**
 * 1. Entrega el siguiente código comentado con los resultados a la derecha de
 * cada System.out.println() y contesta:
 * 
 * a. ¿Cómo se comparan dos cadenas? Pueden compararse tanto con "==" como con
 * equals y con equalsIgnoreCase. Pero normalmente se usará equals ya que
 * compara el valor de la cadena y no si hacen referencia al mismo objeto
 * 
 * b. ¿Para qué se utiliza el operador de comparación == entre objetos? Para
 * comparar si el objeto al que se hace referencia es el mismo
 * 
 * c. Una cadena puede crearse mediante new o directamente con su literal. ¿Se
 * crean de igual manera? No, ya que con new String() se crea siempre un nuevo
 * objeto, pero con literal se creará en el String Pool y si ya existe un
 * literal igual se creará una referencia a dicho literal
 * 
 * ¿Se aprovecha la memoria de alguna manera? No, ya que con String estaríamos
 * usando mas memoria.
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class TestComparaCadenas {
	public static void main(String[] args) {
		String string1 = new String("Hola");
		String string2 = new String("Hola");
		System.out.println("string1==string2 " + (string1 == string2)); // false,
																		// ya
																		// que
																		// no
																		// hace
																		// referencia
																		// al
																		// mismo
																		// objeto
		System.out.println("string1.equals(string2) "
				+ (string1.equals(string2))); // true, ya que compara el valor
												// de los objetos, y este es el
												// mismo

		String string3 = "Hola";
		String string4 = "Hola";
		System.out.println("\n\nstring3==string4 " + (string3 == string4)); // true,
																			// ya
																			// que
																			// al
																			// pertenecer
																			// al
																			// mismo
																			// String
																			// Pool,
																			// están
																			// apuntando
																			// al
																			// mismo
																			// string,
																			// por
																			// lo
																			// que
																			// la
																			// referencia
																			// sería
																			// la
																			// misma
		System.out.println("string3.equals(string4) "
				+ (string3.equals(string4))); // true, ya que el valor de los
												// dos strings son el mismo

		String stringMax = "Hola";
		String stringMin = "hola";
		System.out.println("\n\nstringMax==stringMin "
				+ (stringMax == stringMin)); // false, ya que el objeto es
												// distinto, por lo tanto
												// tambien es distinta la
												// referencia, "h" y "H"
		System.out.println("stringMax.equals(stringMin) "
				+ (stringMax.equals(stringMin))); // false, ya que la cadena es
													// distinta, "h" y "H"
		System.out.println("stringMax.equalsIgnoreCase(stringMin) "
				+ (stringMax.equalsIgnoreCase(stringMin))); // true, ya que
															// ignora si las
															// letras están en
															// mayuscula y
															// minuscula, por lo
															// que la cadena
															// "sería la misma"

	}
}
