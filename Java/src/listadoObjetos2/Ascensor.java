package listadoObjetos2;

/**
 * 1. Crea una clase testAscensor que simule el funcionamiento de un ascensor.
 * Para ello, tendrás que crear una librería sistemaAscensor que contenga las
 * clases Ascensor y puerta.
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 
public class Ascensor {
	private int plantaActual;
	private int plantaMaxima;
	private Puerta puerta = new Puerta();

	public int getPlantaActual() {
		return plantaActual;
	}

	public int getPlantaMaxima() {
		return plantaMaxima;
	}
	
	

	public void subiryBajar(int plantaDestino) {
		if (plantaDestino > plantaActual) {
			for (int i = 0; i < (plantaDestino - plantaActual); i++) {
				System.out.println("Subiendo... Planta " + (plantaActual + i));
			}
		}
		if (plantaDestino < plantaActual) {
			for (int i = 0; i < (plantaActual - plantaDestino); i++) {
				System.out.println("Bajando... Planta " + (plantaActual - i));
			}
		}
		if (plantaDestino == plantaActual){
			System.out.println("Ya estás en esa planta.");
		}
		plantaActual = plantaDestino;
	}

}
*/