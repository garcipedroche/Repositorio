package listadoBasico3;

/**
 * 14. Define la clase Aleatorios que de forma repetitiva muestre un número
 * aleatorio entre un mínimo y un máximo. Define el método generarAleatorio(min,
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
			System.out.println("Nº Aleatorio entre "+min+" y "+max+" = "+random);
			resp = DeseaContinuar.continuar();
		} while (resp==true);
	}
	
	/**
	 * 
	 * @param min es el nº minimo que genera random
	 * @param max es el nº maximo que genera random
	 * @return devuelve un double aleatorio entre los valores min y max
	 */
	public static double generarAleatorio(int min, int max){
		double random;
		random=Math.random()*(min-max)+max;
		return random;
	}
}
