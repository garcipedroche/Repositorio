package acumulaSumas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import utiles.Teclado;

/**
 * Env�a un programa que cumpla los siguientes requisitos:
 * 
 * Almacenar� todo lo que el usuario introduzca por teclado en el fichero
 * "salida.txt" No utilizar�s la clase Teclado Enviar� una excepci�n al main en
 * el caso en el que el fichero ya exista, informando al usuario. El programa
 * acabar� cuando el usuario introduzca la palabra SALIR (aislado en una l�nea y
 * en may�sculas). Dicha l�nea no se introducir� en el flujo de salida.
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class TestDelTecladoAlFichero {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String contenido = Teclado.leerCadena();
		escribirFichero("salida.txt", contenido);
		leerFichero("salida.txt");
	}

	private static void escribirFichero(String nombre, String contenido) {
		try (PrintWriter escribir = new PrintWriter(new FileWriter("./src/"
				+ nombre))) {
			escribir.println(contenido);
		} catch (Exception e) {
			System.out.println("Error al escribir.");
		}
	}

	private static void leerFichero(String nombre) {

		try (Scanner scan = new Scanner(new BufferedReader(new FileReader(
				"./src/" + nombre)))) {
			if (scan.hasNext()) {
				System.out.println(scan.next());
			} else {
				return;
			}
		} catch (FileNotFoundException e) {
			System.err.println("Archivo no encontrado.");
			return;
		}
	}
}
