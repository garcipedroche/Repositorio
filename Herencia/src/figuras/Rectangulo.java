package figuras;

/**
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class Rectangulo extends Figura {

	double area;

	Rectangulo() {
		super();
		area = calcularArea(dimension1, dimension2);
	}

	@Override
	double calcularArea(float dimension1, float dimension2) {
		return dimension1 * dimension2;
	}

	@Override
	public double getArea() {
		return area;
	}
}
