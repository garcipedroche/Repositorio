package listadoBasico4;

/**
 * 22. Crea la calse AlumnosMatriculados. Queremos guardar en la memoria del
 * ordenador el n�mero de alumnos matriculados en cada grupo del ciclo de
 * "Desarrollo de Aplicaciones Web" (por m�dulos). Existen dos grupos y se
 * imparten seis m�dulos distintos en cada grupo. Utiliza m�todos en la medida
 * de lo posible. Sabemos que: a. En el primer grupo hay: i. 30 alumnos
 * matriculados en Sistemas inform�ticos ii. 27 alumnos matriculados en Bases de
 * datos iii. 25 alumnos matriculados en Programaci�n iv. 21 alumnos
 * matriculados en Lenguaje de marcas v. 19 alumnos matriculados en Entornos de
 * desarrollo vi. 16 alumnos matriculados en FOL b. En el segundo grupo hay: i.
 * 15 alumnos matriculados en Desarrollo Web en entorno cliente ii. 14 alumnos
 * matriculados en Desarrollo Web en entorno servidor iii. 15 alumnos
 * matriculados en Despliegue de aplicaciones Web iv. 15 alumnos matriculados en
 * Dise�o de interfaces Web v. 15 alumnos matriculados en Desarrollo Web en
 * entorno cliente
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class AlumnosMatriculados {
	public static void main(String[] args) {
		int[][] alumnosMatriculados = { { 30, 27, 25, 21, 19, 16 },
				{ 15, 14, 15, 15, 15, 0 } };
		mostrarMatrizEnteros(alumnosMatriculados);
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
}
