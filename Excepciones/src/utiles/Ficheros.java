package utiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ficheros {
	public static void escribirFichero(String nombre, String contenido) {
		try (PrintWriter escribir = new PrintWriter(new FileWriter("./src/"
				+ nombre))) {
			escribir.println(contenido);
		} catch (Exception e) {
			System.out.println("Error al escribir.");
		}
	}

	public static void anadirFichero(String nombre, String contenido) {
		String fichero = leerFichero(nombre);
		try (PrintWriter escribir = new PrintWriter(new FileWriter("./src/"
				+ nombre))) {
			escribir.println(fichero + contenido);
		} catch (Exception e) {
			System.out.println("Error al escribir.");
		}
	}

	public static String leerFichero(String nombre) {

		try (Scanner scan = new Scanner(new BufferedReader(new FileReader(
				"./src/" + nombre)))) {
			String contenido = "";
			while (scan.hasNext()) {
				contenido += " " + scan.next();
			}
			return contenido;
		} catch (FileNotFoundException e) {
			System.err.println("Archivo no encontrado.");
			return "error";
		}
	}
}
