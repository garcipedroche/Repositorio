package listadoBasico4;

/**
 * 21. Crea la clase NotasAlumnos. Declara y crea un tipo de variable que sea
 * capaz de contener la nota que han obtenido 4 alumnos en los diferentes
 * m�dulos en los que est�n matriculados. Sabemos que el primer alumno est�
 * matriculado en 4 m�dulos; el segundo en 7, el tercero en 3 m�dulos y el
 * cuarto en 2 m�dulos. Genera aleatoriamente las notas de los alumnos y
 * mu�stralos. Utiliza m�todos de la forma m�s eficiente y clara
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class NotasAlumnos {
	public static void main(String[] args) {
		double[][] notaAlumnos = new double[4][];
		notaAlumnos[0] = generarNota(4);
		notaAlumnos[1] = generarNota(7);
		notaAlumnos[2] = generarNota(3);
		notaAlumnos[3] = generarNota(2);

		for (int i = 0; i < notaAlumnos.length; i++) {
			mostrarNota(notaAlumnos,i);
		}
	}

	private static void mostrarNota(double[][] notaAlumnos, int alumno) {
		System.out.println("Notas del alumno "+alumno+":");
		for(int i=0;i<notaAlumnos[alumno].length;i++){
			System.out.println("Nota del m�dulo "+i+": "+notaAlumnos[alumno][i]);
		}
	}

	private static double[] generarNota(int modulos) {
		double[] notas = new double[modulos];
		for (int i = 0; i < modulos; i++) {
			notas[i] = Math.random() * (10 - 0) + 0;
			notas[i] = ((int) (notas[i] * 100)) / 100.0;
		}
		return notas;
	}
}
