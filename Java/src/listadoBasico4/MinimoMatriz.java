package listadoBasico4;

import utiles.Teclado;

/**
 * 20. Crea una clase M�nimoMatriz que solicite al usuario el tama�o de una
 * nueva matriz y que la inicialice con valores aleatorios (solicita al usuario
 * el m�nimo y el m�ximo de los valores). Hallar� el valor m�nimo de una matriz,
 * dando exactamente su posici�n fila - columna. Utiliza los m�todos
 * pedirFila(), pedirColumna(), pedirM�nimo(), pedirMaximo(), mostrarMatriz(),
 * mostrarM�nimo()
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class MinimoMatriz {
	public static void main(String[] args) {
		int filas = pedirDimension("N� de filas:");
		int columnas = pedirDimension("N� de columnas:");
		int maximo = pedirDimension("N� aleatorio m�ximo:");
		int minimo = pedirDimension("N� aleatorio minimo:");
		int[][] matriz = new int[filas][columnas];
		matriz =crearMatrizAleatoriaEnteros(maximo, minimo, filas,
				columnas);
		mostrarMatrizEnteros(matriz);
		mostrarMinimo(matriz);
	}
	
	private static int[][] crearMatrizAleatoriaEnteros(int max, int min,
			int filas, int columnas) {
		int[][] matriz = new int[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = ((int) (Math.random() * (max - min) + min));
			}
		}
		return matriz;
	}
	
	private static void mostrarMatrizEnteros(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + "\t");
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

	private static void mostrarMinimo(int[][] matriz) {
		int[] posicion=new int[2];
		int minimo=matriz[0][0];
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[0].length;j++){
				if(matriz[i][j]<minimo){
					minimo=matriz[i][j];
					posicion[0]=i;
					posicion[1]=j;
				}
			}
		}
		System.out.println("El menor elemento es: "+minimo);
		System.out.println("Y est� en la posicion: ["+posicion[0]+"] ["+posicion[1]+"]");
	}
}
