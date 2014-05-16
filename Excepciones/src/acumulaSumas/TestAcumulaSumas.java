package acumulaSumas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Este programa realiza sumas acumuladas de enteros bajo los siguientes
 * requisitos:
 * 
 * Recuerda identificarlo todo correctamente Paquete
 * nombreApellido1Apellido2AcumulaSumas en javadoc Inicialmente se parte del
 * entero almacenado en un fichero txt. Si el fichero no existe, se parte desde
 * 0. El programa continúa pidiendo al usuario números enteros y los suma, hasta
 * que el usuario introduce en número 0. Una vez hecha la suma, el resultado se
 * almacenará en el mismo fichero txt Detalles del programa: No utilices la
 * clase Teclado En el caso en que el usuario introduzca por teclado un valor no
 * válido (no es un entero) se le informa del error y se solicita de nuevo
 * (utiliza excepciones) En el caso en que al leer del fichero el dato no sea
 * correcto (no es un entero) se informa del error y se comienza desde 0. Junto
 * con el programa, entrega un "flujosE-S.pdf" que contenga: Flujos de E/S
 * utilizados Clases y métodos que se utilizan
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class TestAcumulaSumas {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int i = scanner.nextInt();
		System.out.println(i);
		scanner.close();
	}

	private static void crearFichero(int num) {
		try (PrintWriter salida = new PrintWriter(new FileWriter(
				"./src/numero.txt"))) {

			salida.println(num);
			System.out.println("Archivo 'numero.txt' creado con éxito");

		} catch (IOException e) {
			System.err.println("Error en la lectura o escritura del archivo.");
			e.printStackTrace();
		}
	}
	
	
}
