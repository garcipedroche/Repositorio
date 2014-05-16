package LlamadaConstructores;

public class F {
	int entero = 2;
	Float decimal = 5f;
	public F(int entero, Float decimal) {
		super();
		this.entero = entero;
		this.decimal = decimal;
	}
	@Override
	public String toString() {
		return "F [entero=" + entero + ", decimal=" + decimal + "]";
	}

	
}
