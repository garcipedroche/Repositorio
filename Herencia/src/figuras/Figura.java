package figuras;

/**
 * Implementa la siguiente jerarquía de clases:
 * 
 * Clase abstracta Figura:
 * 
 * Campo dimension1 (decimal) Campo dimension2 (decimal)
 * 
 * Constructor con ambos campos como parámetros Método abstracto calcularArea();
 * 
 * Clase Rectangulo que hereda de Figura Clase Triangulo que hereda de Figura
 * 
 * Clase TestArea Método main que:
 * 
 * Cree una lista de figuras
 * 
 * Se le añadirán 5 triángulos y 5 rectángulos.
 * 
 * Las dimensiones serán aleatorias.
 * 
 * Muestre aquellas figuras con área mayor de 20
 * 
 * Contesta a las siguientes preguntas: ¿Por qué has tenido que crear una clase
 * abstracta?
 * 
 * ¿Se puede crear una instancia de Figura?¿Por qué?
 * 
 * ¿Puede invocarse en una clase abstracta al método abstracto? Para
 * comprobarlo, sobreescribe el método toString() e invoca al método area() para
 * que te muestre el área de la figura además de las dimensiones
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public abstract class Figura {
	protected float dimension1;
	protected float dimension2;

	Figura() {
		dimension1 = calcularDimension();
		dimension2 = calcularDimension();
	}

	public float getDimension1() {
		return dimension1;
	}

	public float getDimension2() {
		return dimension2;
	}

	abstract double calcularArea(float dimension1, float dimension2);

	abstract public double getArea();

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[dimension1=" + dimension1 + ", dimension2="
				+ dimension2 + ", area=" + this.getArea() + "]";
	}

	float calcularDimension() {
		return (float) Math.random() * 10;
	}
}
