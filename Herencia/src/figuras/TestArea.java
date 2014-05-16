package figuras;

import java.util.ArrayList;

/**
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class TestArea {

	public static void main(String[] args) {
		ArrayList<Figura> lista = new ArrayList<Figura>();
		lista.add(new Rectangulo());
		lista.add(new Rectangulo());
		lista.add(new Rectangulo());
		lista.add(new Rectangulo());
		lista.add(new Rectangulo());
		lista.add(new Triangulo());
		lista.add(new Triangulo());
		lista.add(new Triangulo());
		lista.add(new Triangulo());
		lista.add(new Triangulo());
		
		for (int i = 0; i < lista.size(); i++) {
			if((lista.get(i)).getArea()>20){
				System.out.println(lista.get(i));
			}
		}
	}
}
