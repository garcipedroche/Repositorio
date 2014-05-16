package acumulaSumas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import utiles.Teclado;

/**
 * Envía un programa que cumpla los siguientes requisitos:
 * 
 * Almacenará todo lo que el usuario introduzca por teclado en el fichero
 * "salida.txt" No utilizarás la clase Teclado Enviará una excepción al main en
 * el caso en el que el fichero ya exista, informando al usuario. El programa
 * acabará cuando el usuario introduzca la palabra SALIR (aislado en una línea y
 * en mayúsculas). Dicha línea no se introducirá en el flujo de salida.
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
