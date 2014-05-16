package listadoHerencia1;



/**
 * 3. Dise�a, implementa y prueba las clases Mam�fero, Perro y Gato. Para ello,
 * supongamos que:
 * 
 * a. Todo mam�fero tiene patas y nombre
 * 
 * b. Un perro es un mam�fero con cuatro patas, nombre y que adem�s, ladra.
 * 
 * c. Un gato es un mam�fero con cuatro patas, nombre y que adem�s, maulla.
 * 
 * d. Crea la clase TestMamiferos que:
 * 
 * i. Cree al perro Mil�
 * 
 * ii. Cree al gato Garfield
 * 
 * iii. Haga ladrar a Mil�
 * 
 * iv. Haga maullar a Garfield
 * 
 * v. Muestre los datos de Garfield y de Mil� mediante toString y mediante los
 * getters (prueba la diferencia entre hacerlos protected y private)
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class TestMamifero {
	public static void main(String[] args) {
		Perro perro = new Perro("Mil�");
		Gato gato = new Gato("Garfield");
		perro.ladrar();
		gato.maullar();

		System.out.println("\ntoString():");
		System.out.println(perro);
		System.out.println("getter:");
		System.out.println("Nombre: " + perro.getNombre() + ", Patas: "
				+ perro.getPatas());

		System.out.println("\ntoString():");
		System.out.println(gato);
		System.out.println("getter:");
		System.out.println("Nombre: " + gato.getNombre() + ", Patas: "
				+ gato.getPatas());
	}
}

