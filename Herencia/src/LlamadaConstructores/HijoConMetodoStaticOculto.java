package LlamadaConstructores;

/**
 * <h1>Ocultamiento de métodos de clase (static)</h1>
 * <ul>
 * <li>Ocultar métodos static: Consiste en definir un método de clase
 * hijo con la misma signatura (nombre del método, número y tipo de
 * parámetros) que la clase padre. Entonces, el método de la
 * clase hijo oculta al del padre.</li>
 * 
 * <li>Utilizar el método oculto: utilizando nombre de la clase Padre
 * (Padre.metodoOculto()) nunca a través del super.metodoOculto() porque no hay objetos</li>
 * </ul>
 * 
 * 
 * @author lmagarin
 * 
 */
class Padre {
	Padre(){
		metodoStatic();//oculto, no sobrescrito. Siempre al del padre
		metodoDeInstancia();//LIGADURA DINAMICA si lo invoca el hijo
	}
	static void metodoStatic() {
		System.out.println("metodoStatic en el Padre");
	}

	public void metodoDeInstancia() {
		System.out.println("metodoDeInstancia en el Padre");
	}
}

public class HijoConMetodoStaticOculto extends Padre {
	// @Override //no sobreescribe, sí OCULTA
	static void metodoStatic() {// visibilidad mayor permitida
		System.out.println("metodoStatic en el Hijo");
		// super.metodoStatic();//no se puede usar super en un contexto static,
		// aquí no hay un objeto
	}

	@Override
	public void metodoDeInstancia() {
		System.out.println("metodoDeInstancia en el Hijo");
	}

	public static void main(String[] args) {
		System.out.println("new Hijo...");
		HijoConMetodoStaticOculto hijoConStaticSobreescrito = new HijoConMetodoStaticOculto();
		System.out.println("new Padre...");
		Padre padre = new Padre();

		hijoConStaticSobreescrito.metodoDeInstancia();// en el hijo
		HijoConMetodoStaticOculto.metodoStatic();// en el hijo

		padre.metodoDeInstancia();// en el padre
		Padre.metodoStatic();// en el padre

		padre = hijoConStaticSobreescrito;
		padre.metodoDeInstancia();// en el hijo, LIGADURA DINAMICA porque es un método de instancia
		Padre.metodoStatic();// en el padre, sin ligadura dinamica porque es un método de clase
		HijoConMetodoStaticOculto.metodoStatic();//en el hijo
	}
}