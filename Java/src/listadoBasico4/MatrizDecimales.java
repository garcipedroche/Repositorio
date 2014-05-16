package listadoBasico4;

import utiles.Teclado;

/**
 * 5. Define la clase MatrizDecimales que cree una matriz de decimales. Pide las
 * dimensiones (filas y columnas). Se inicializa con valores aleatorios entre 1
 * y 100 y visualiza el array.
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class MatrizDecimales {
	public static void main(String[] args) {
		int filas = pedirDimension("Nº de filas:");
		int columnas = pedirDimension("Nº de columnas:");
		double[][] matriz = new double[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = Math.random() * 101;
				matriz[i][j]=((int)(matriz[i][j]*100))/100.0;
			}
		}
		mostrarMatriz(matriz);
	}

	private static void mostrarMatriz(double[][] matriz) {
		for(int i=0;i<matriz.length;i++){
			System.out.print("|");
			for(int j=0;j<matriz[0].length;j++){
				System.out.print(matriz[i][j]+"\t");
			}

			System.out.print("| \n");
		}
	}

	private static int pedirDimension(String string) {
		int dimension;
		System.out.println(string);
		dimension = Teclado.leerEntero();
		return dimension;
	}
}
