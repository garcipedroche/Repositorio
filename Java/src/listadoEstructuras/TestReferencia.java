package listadoEstructuras;

/**
 * 2. Crea el siguiente código. Contesta a las siguientes preguntas:
 * 
 * a. ¿Cuándo la comparación de dos referencias es true? Cuando apuntan al mismo
 * trozo de memoria.
 * 
 * b. ¿Siempre se inicializa una referencia a null? No, solo se inicializa a
 * null si son propiedades de una clase, si son variables locales no.
 * 
 * c. ¿Por qué vector1 y vector2 han de ser static? Porque necesitamos utilizar
 * vector1 y vector2 dentro del main, como main es static, necesitamos que sean
 * static para que carguen antes del main.
 * 
 * ¿Cuál sería otra solución? Crear como variables locales a vector1 y vector2,
 * dentro del main
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class TestReferencia {
	static char[] vector1;// referencia (puntero a memoria dinámica)
	static char[] vector2;// referencia (puntero a memoria dinámica)

	public static void main(String[] args) {
		if (vector1 == null)
			System.out.println("Vector vale null: " + vector1
					+ ". Todavía no apunta a la memoria dinámica.");

		vector1 = new char[5];// reserva de memoria y asignación
		vector2 = vector1;// ASIGNACIÓN: ambas apuntan al mismo trozo de memoria

		if (vector1 == vector2)// comparación
			System.out.println("Ambas apuntan al mismo trozo de memoria.");

		vector2 = new char[5];// reserva de memoria y asignación
		if (vector1 != vector2)// comparación
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
