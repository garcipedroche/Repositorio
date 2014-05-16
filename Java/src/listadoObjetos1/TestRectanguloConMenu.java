package listadoObjetos1;

import utiles.Teclado;

public class TestRectanguloConMenu {
	public static void main(String[] args) {
		Rectangulo rectangulo=new Rectangulo();
		int ancho, largo;
		do {
			System.out.println("Introduce ancho (m):");
			ancho = Teclado.leerEntero();
			if (ancho < 1)
				System.out.println("Error: El ancho debe ser mayor que cero.");
		} while (ancho < 1);
		do {
			System.out.println("Introduce largo (m):");
			largo = Teclado.leerEntero();
			if (largo < 1)
				System.out.println("Error: El largo debe ser mayor que cero.");
		} while (largo < 1);

		rectangulo.setAncho(ancho);
		rectangulo.setLargo(largo);
		
		int numero=mostrarMenu();
		menu(numero,rectangulo);
		
	}
	
	public static int mostrarMenu(){
		System.out.println("+------------------------------+");
		System.out.println("|          Rectangulo          |");
		System.out.println("+------------------------------+");
		System.out.println("|       ¿Que desea hacer?      |");
		System.out.println("|  1. Aumentar el ancho        |");
		System.out.println("|  2. Disminuir el ancho       |");
		System.out.println("|  3. Aumentar el largo        |");
		System.out.println("|  4. Disminuir el largo       |");
		System.out.println("|  5. Mirar estado rectangulo  |");
		System.out.println("|  6. Salir                    |");
		System.out.println("+------------------------------+");
		int numero = Teclado.leerEntero();
		return numero;		
	}
	
	public static void menu(int numero, Rectangulo rectangulo) {
		switch (numero) {
		case 1:
			rectangulo.setAncho(1);
			System.out.println("El ancho del rectangulo ha aumentado 1 m.");
			numero=mostrarMenu();
			menu(numero,rectangulo);
			break;
		case 2:
			if(rectangulo.getAncho()>1){
			rectangulo.setAncho(-1);
			System.out.println("El ancho del rectangulo ha disminuido 1 m.");
			}else{
			System.out.println("El ancho del rectangulo no puede disminuir ya que tendría ancho cero.");
			}
			numero=mostrarMenu();
			menu(numero,rectangulo);
			break;
		case 3:
			rectangulo.setLargo(1);
			System.out.println("El largo del rectangulo ha aumentado 1 m.");
			numero=mostrarMenu();
			menu(numero,rectangulo);
			break;
		case 4:
			if(rectangulo.getLargo()>1){
			rectangulo.setLargo(-1);
			System.out.println("El largo del rectangulo ha disminuido 1 m.");
			}else{
			System.out.println("El largo del rectangulo no puede disminuir ya que tendría largo cero.");
			}
			numero=mostrarMenu();
			menu(numero,rectangulo);
			break;
		case 5:
			rectangulo.mostrar();
			numero=mostrarMenu();
			menu(numero,rectangulo);
			break;
		case 6:
			System.out.println("Hasta pronto.");
			break;
		default:
			System.out.println("Error, opción no válida.");
			numero=mostrarMenu();
			menu(numero,rectangulo);
			break;
		}
	}
}
