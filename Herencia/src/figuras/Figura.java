package figuras;

/**
 * Implementa la siguiente jerarqu�a de clases:
 * 
 * Clase abstracta Figura:
 * 
 * Campo dimension1 (decimal) Campo dimension2 (decimal)
 * 
 * Constructor con ambos campos como par�metros M�todo abstracto calcularArea();
 * 
 * Clase Rectangulo que hereda de Figura Clase Triangulo que hereda de Figura
 * 
 * Clase TestArea M�todo main que:
 * 
 * Cree una lista de figuras
 * 
 * Se le a�adir�n 5 tri�ngulos y 5 rect�ngulos.
 * 
 * Las dimensiones ser�n aleatorias.
 * 
 * Muestre aquellas figuras con �rea mayor de 20
 * 
 * Contesta a las siguientes preguntas: �Por qu� has tenido que crear una clase
 * abstracta?
 * 
 * �Se puede crear una instancia de Figura?�Por qu�?
 * 
 * �Puede invocarse en una clase abstracta al m�todo abstracto? Para
 * comprobarlo, sobreescribe el m�todo toString() e invoca al m�todo area() para
 * que te muestre el �rea de la figura adem�s de las dimensiones
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
