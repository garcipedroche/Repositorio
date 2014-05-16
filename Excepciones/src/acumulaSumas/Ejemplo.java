package acumulaSumas;

import utiles.Ficheros;


public class Ejemplo {
	public static void main(String[] args) {
		Ficheros.escribirFichero("a.txt", "hol aaaa");
		Ficheros.anadirFichero("a.txt", " aa");
		Ficheros.anadirFichero("a.txt", " aa");
		Ficheros.anadirFichero("a.txt", " aa");
		Ficheros.anadirFichero("a.txt", " aa");
		System.out.println(Ficheros.leerFichero("a.txt"));
	}
}
