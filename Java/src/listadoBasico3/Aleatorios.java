package listadoBasico3;

/**
 * 14. Define la clase Aleatorios que de forma repetitiva muestre un n�mero
 * aleatorio entre un m�nimo y un m�ximo. Define el m�todo generarAleatorio(min,
 * max)
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class Aleatorios {
	public static void main(String[] args) {
		double random;
		boolean resp;
		int min,max;
		do {
			min=Suma2.introducir();
			max=Suma2.introducir();
			random=generarAleatorio(min,max);
			System.out.println("N� Aleatorio entre "+min+" y "+max+" = "+random);
			resp = DeseaContinuar.continuar();
		} while (resp==true);
	}
	
	/**
	 * 
	 * @param min es el n� minimo que genera random
	 * @param max es el n� maximo que genera random
	 * @return devuelve un double aleatorio entre los valores min y max
	 */
	public static double generarAleatorio(int min, int max){
		double random;
		random=Math.random()*(min-max)+max;
		return random;
	}
}
