package SumaMatrices;

import utiles.Teclado;

public class SumaMatrices {
	public static void main(String[] args) {
		int filas = pedirDimension("Dame las filas: ");
		int columnas = pedirDimension("Dame las columnas: ");

		System.out.println("Introducir matriz 1:");
		int[][] sumando1 = crearSumando(filas, columnas);
		System.out.println("Mostrar matriz 1:");
		mostrar(sumando1);
		System.out.println("Introducir matriz 2:");
		int[][] sumando2 = crearSumando(filas, columnas);
		System.out.println("Mostrar matriz 2:");
		mostrar(sumando2);

		int[][] suma = sumar(sumando1, sumando2);
		System.out.println("Mostrar matriz suma:");
		mostrar(suma);
	}

	private static int[][] sumar(int[][] sumando1, int[][] sumando2) {
		int[][] suma = new int[sumando1.length][sumando1[0].length];
		for (int i = 0; i < sumando1.length; i++) {
			for (int j = 0; j < sumando1[i].length; j++) {
				suma[i][j]=sumando1[i][j]+sumando2[i][j];
			}
		}
		return suma;
	}

	private static void mostrar(int[][] sumando1) {
		for (int i = 0; i < sumando1.length; i++) {
			for (int j = 0; j < sumando1[i].length; j++) {
				System.out.println(" " + sumando1[i][j] + " ");
			}
		}
	}

	private static int[][] crearSumando(int filas, int columnas) {

		int matriz[][] = new int[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("Introduce el valor de fila " + i
						+ " y columna " + j + ":");
				matriz[i][j] = Teclado.leerEntero();
			}
		}
		return matriz;
	}

	private static int pedirDimension(String string) {
		int dimension;
		System.out.println(string);
		dimension = Teclado.leerEntero();
		return dimension;
	}
}
