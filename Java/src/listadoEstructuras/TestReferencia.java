package listadoEstructuras;

/**
 * 2. Crea el siguiente c�digo. Contesta a las siguientes preguntas:
 * 
 * a. �Cu�ndo la comparaci�n de dos referencias es true? Cuando apuntan al mismo
 * trozo de memoria.
 * 
 * b. �Siempre se inicializa una referencia a null? No, solo se inicializa a
 * null si son propiedades de una clase, si son variables locales no.
 * 
 * c. �Por qu� vector1 y vector2 han de ser static? Porque necesitamos utilizar
 * vector1 y vector2 dentro del main, como main es static, necesitamos que sean
 * static para que carguen antes del main.
 * 
 * �Cu�l ser�a otra soluci�n? Crear como variables locales a vector1 y vector2,
 * dentro del main
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class TestReferencia {
	static char[] vector1;// referencia (puntero a memoria din�mica)
	static char[] vector2;// referencia (puntero a memoria din�mica)

	public static void main(String[] args) {
		if (vector1 == null)
			System.out.println("Vector vale null: " + vector1
					+ ". Todav�a no apunta a la memoria din�mica.");

		vector1 = new char[5];// reserva de memoria y asignaci�n
		vector2 = vector1;// ASIGNACI�N: ambas apuntan al mismo trozo de memoria

		if (vector1 == vector2)// comparaci�n
			System.out.println("Ambas apuntan al mismo trozo de memoria.");

		vector2 = new char[5];// reserva de memoria y asignaci�n
		if (vector1 != vector2)// comparaci�n
			System.out.println("NO apuntan al mismo trozo de memoria.");

		// Se comprueba que ambos vectores contienen lo mismo
		System.out.println();
		for (char caracter : vector1) {
			System.out.print(caracter + "-");
		}

		System.out.println();
		for (char caracter : vector2) {
			System.out.print(caracter + "-");
		}
	}
}
