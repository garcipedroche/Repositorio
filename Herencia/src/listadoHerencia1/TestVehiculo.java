package listadoHerencia1;

/**
 * 2. Crea la clase TestCastingVehiculo donde se demuestren las limitaciones de
 * los castings entre clases.
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class TestVehiculo {
	public static void main(String[] args) {
		Coche coche = new Coche();
		Camion camion = new Camion();
		
		//De coche/camion a vehiculo
		Vehiculo vehiculoCoche = coche;
		Vehiculo vehiculoCamion = camion;
		
		//De vehiculo a coche/camion
		Coche cocheRojo = (Coche)vehiculoCoche;
		Camion camionRojo = (Camion) vehiculoCamion;
		
		//Del mismo tipo
		coche = cocheRojo;
		camion=camionRojo;	
	}
}
