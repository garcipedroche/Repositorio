package listadoBasico4;

import utiles.Teclado;

/**
 * 6. Define la clase MatrizDecimales2 basada en la clase anterior. Se ha de
 * inicializar con valores aleatorios (solicita al usuario el m�nimo y el m�ximo
 * de los valores). Ha de localizar los valores m�ximo, m�nimo y media de la
 * matriz. Que muestre tanto los valores como la posici�n que ocupan en la
 * matriz. Utiliza los m�todos pedirFila(), pedirColumna(), pedirM�nimo(),
 * pedirMaximo(), mostrarMatriz(double[][]), hallarMedia(double[][]) ;
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class MatrizDecimales2 {
	public static void main(String[] args) {
		int filas = pedirDimension("N� de filas:");
		int columnas = pedirDimension("N� de columnas:");
		double[][] matriz = new double[filas][columnas];
		int max = pedirDimension("N� m�ximo aleatorio:");
		int min = pedirDimension("N� m�nimo aleatorio:");
		double maximo, minimo, media;
		matriz= crearMatrizAleatoriaDecimal(max, min, filas, columnas);
		maximo = hallarMaximo(matriz);
		minimo = hallarMinimo(matriz);
		media = hallarMedia(matriz);
		System.out.println("M�ximo: " + maximo);
		System.out.println("M�nimo: " + minimo);
		System.out.println("Media: " + media);
		System.out.println("Matriz:");
		mostrarMatrizDecimal(matriz);
	}
	
	private static double[][] crearMatrizAleatoriaDecimal(int max, int min,
			int filas, int columnas) {
		double[][] matriz = new double[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = Math.random() * (max - min) + min;
				matriz[i][j] = ((int) (matriz[i][j] * 100)) / 100.0;
			}
		}
		return matriz;
	}
	
	private static void mostrarMatrizDecimal(double[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}

			System.out.print("| \n");
		}
	}

	private static double hallarMedia(double[][] matriz) {
		double media = 0, suma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				suma += matriz[i][j];
			}
		}
		media = suma / (matriz.length * matriz[0].length);
		return media;
	}

	private static double hallarMinimo(double[][] matriz) {
		double min = matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j] < min) {
					min = matriz[i][j];
				}
			}
		}
		return min;
	}

	private static double hallarMaximo(double[][] matriz) {
		double max = matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j] > max) {
					max = matriz[i][j];
				}
			}
		}
		return max;
	}
	
	private static int pedirDimension(String string) {
		int dimension;
		System.out.println(string);
		dimension = Teclado.leerEntero();
		return dimension;
	}
}
