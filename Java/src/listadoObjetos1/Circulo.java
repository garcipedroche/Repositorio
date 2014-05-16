package listadoObjetos1;

public class Circulo {
	private int radio = 0;
	private double area = 0;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio += radio;
		this.setArea();
	}

	public double getArea() {
		return area;
	}

	public void setArea() {
		this.area = Math.PI * (Math.pow(radio, 2));
	}

	public void mostrar() {
		if (this.getRadio() > 0) {
			System.out.println("Soy un circulo de radio " + radio + " metros y área "
					+ area + " metros cuadrados");
		}else{
			System.out.println("Soy un mísero punto sin área.");
		}
	}
}
