package listadoObjetos1;

import utiles.Teclado;

public class TestGato {
	public static void main(String[] args) {
		Gato gato = new Gato();
		String nombre, raza;
		int peso;
		do {
			System.out.println("Nombre del gatito:");
			nombre = Teclado.leerCadena();
			if (nombre.length() < 1)
				System.out.println("Error: El nombre del gatito no puede estar vacío.");
		} while (nombre.length() < 1);
		do {
			System.out.println("Raza del gatito:");
			raza = Teclado.leerCadena();
			if (raza.length() < 1)
				System.out.println("Error: La raza del gatito no puede estar vacía.");
		} while (raza.length() < 1);
		do {
			System.out.println("Peso del gatito:");
			peso = Teclado.leerEntero();
			if (peso < 1000 || peso > 4000)
				System.out.println("Error: El peso del gatito no puede ser menor de 1000 ni mayor de 4000.");
		} while (peso < 1000 || peso > 4000);
		
		gato.setNombre(nombre);
		gato.setRaza(raza);
		gato.setPeso(peso);
		
		gato.mostrar();
		
		gato.comer();
		for(int i=0;i<7;i++){
			gato.jugar();
		}
		gato.dormir();
		gato.mostrar();
	}
}
