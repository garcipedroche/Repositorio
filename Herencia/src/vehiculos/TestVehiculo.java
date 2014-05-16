package vehiculos;

import utiles.Menu;
import utiles.Teclado;

public class TestVehiculo {
	static Lista<Vehiculo> vehiculos = new Lista<Vehiculo>();

	public static void main(String[] args) {
		int resp;
		String[] opciones = { "Crear coche", "Crear bicicleta", "Crear camion",
				"Desplazarse", "Acelerar", "Parar", "Repostar", "Ver vehiculos" };
		Menu menu = new Menu(opciones);
		do {
			menu.mostrar();
			resp = menu.recogerOpcion();
			menu(resp);
		} while (resp != menu.getIndiceSalir());
	}

	static void menu(int resp) {
		Vehiculo v;
		int velMaxima;
		switch (resp) {
		case 1:
			velMaxima= Teclado.leerEntero("Velocidad máxima del coche:");
			Motor motor = Motor.getInstance();
			vehiculos.anadir(Coche.getInstance(velMaxima, motor));
			break;
		case 2:
			velMaxima= Teclado.leerEntero("Velocidad máxima de la bicicleta:");
			int pinones = Teclado.leerEntero("Nº de piñones de la bicicleta:");
			vehiculos.anadir(Bicicleta.getInstance(velMaxima, pinones));
			break;
		case 3:
			velMaxima= Teclado.leerEntero("Velocidad máxima del camión:");
			int tara = Teclado.leerEntero("Tara del camión:");
			vehiculos.anadir(Camion.getInstance(velMaxima, tara));
			break;
		case 4:
			v = seleccionarVehiculo();
			if (v != null) {
				int distancia = Teclado
						.leerEntero("Distancia que desea recorrer:");
				v.desplazarse(distancia);
			}
			break;
		case 5:
			v = seleccionarVehiculo();
			if (v != null) {
				int incrementoVelocidad = Teclado
						.leerEntero("Velocidad que desea acelerar: ");
				v.acelerar(incrementoVelocidad);
			}
			break;
		case 6:
			v = seleccionarVehiculo();
			if (v != null) {
				v.parar();
			}
			break;
		case 7:
			v = seleccionarVehiculo();
			if (v != null) {
				v.repostar();
			}
			break;
		case 8:
			System.out.println(vehiculos);
			break;
		case 9:
			System.out.println("Adios...");
			break;
		default:
			System.out.println("Error, debe introducir un número entre 1 y 9.");
			break;
		}
	}

	static Vehiculo seleccionarVehiculo() {
		if (vehiculos.isEmpty()) {
			System.out.println("No hay ningún vehículo creado.");
			return null;
		} else {
			int index = vehiculos.recogerIndice(
					"¿Que vehiculo desea seleccionar? (entre 1 y "
							+ vehiculos.size() + ")", (vehiculos.size() - 1));
			return vehiculos.buscar(index);
		}
	}
}
