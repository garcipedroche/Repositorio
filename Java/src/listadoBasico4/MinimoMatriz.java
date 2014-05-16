package listadoBasico4;

import utiles.Teclado;

/**
 * 20. Crea una clase MínimoMatriz que solicite al usuario el tamaño de una
 * nueva matriz y que la inicialice con valores aleatorios (solicita al usuario
 * el mínimo y el máximo de los valores). Hallará el valor mínimo de una matriz,
 * dando exactamente su posición fila - columna. Utiliza los métodos
 * pedirFila(), pedirColumna(), pedirMínimo(), pedirMaximo(), mostrarMatriz(),
 * mostrarMínimo()
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class MinimoMatriz {
	public static void main(String[] args) {
		int filas = pedirDimension("Nº de filas:");
		int columnas = pedirDimension("Nº de columnas:");
		int maximo = pedirDimension("Nº aleatorio máximo:");
		int minimo = pedirDimension("Nº aleatorio minimo:");
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
		System.out.println("Y está en la posicion: ["+posicion[0]+"] ["+posicion[1]+"]");
	}
}
