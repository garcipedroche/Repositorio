package LlamadaConstructores;

public class MetodoFinal {
	public static void main(String[] args) {
		E e = new E();
		e.meth();
	}
}

class D {
	final void meth() {
		System.out.println("Es un metodo final.");
	}
}

class E { //extends D {
	void meth() {
		System.out.println("Mal!!");
	}
}