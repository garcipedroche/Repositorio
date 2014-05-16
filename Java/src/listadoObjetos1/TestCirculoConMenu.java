package listadoObjetos1;

import utiles.Teclado;

public class TestCirculoConMenu {
	public static void main(String[] args) {
		Circulo circulo=new Circulo();
		int radio;
		do {
			System.out.println("Introduce radio (m):");
			radio = Teclado.leerEntero();
			if (radio < 0)
				System.out.println("Error: El radio debe ser positivo.");
		} while (radio < 0);
		
		circulo.setRadio(radio);
		
		int numero=mostrarMenu();
		menu(numero,circulo);
		
	}
	
	public static int mostrarMenu(){
		System.out.println("+------------------------------+");
		System.out.println("|           Circulo            |");
		System.out.println("+------------------------------+");
		System.out.println("|       ¿Que desea hacer?      |");
		System.out.println("|    1. Aumentar el radio      |");
		System.out.println("|    2. Disminuir el radio     |");
		System.out.println("|    3. Mirar estado circulo   |");
		System.out.println("|    4. Salir                  |");
		System.out.println("+------------------------------+");
		int numero = Teclado.leerEntero();
		return numero;		
	}
	
	public static void menu(int numero, Circulo circulo) {
		switch (numero) {
		case 1:
			circulo.setRadio(1);
			System.out.println("El circulo ha aumentado 1 m.");
			numero=mostrarMenu();
			menu(numero,circulo);
			break;
		case 2:
			if(circulo.getRadio()>0){
			circulo.setRadio(-1);
			System.out.println("El circulo ha disminuido 1 m.");
			}else{
			System.out.println("El circulo no puede disminuir ya que tendría radio negativo.");
			}
			numero=mostrarMenu();
			menu(numero,circulo);
			break;
		case 3:
			circulo.mostrar();
			numero=mostrarMenu();
			menu(numero,circulo);
			break;
		case 4:
			System.out.println("Hasta pronto.");
			break;
		default:
			System.out.println("Error, opción no válida.");
			numero=mostrarMenu();
			menu(numero,circulo);
			break;
		}
	}
}
