package listadoObjetos1;

public class Gato {
	private String nombre;
	private String raza;
	private String estado = "durmiendo";
	private int peso = 0;
	private static int pesoMinimo = 1000;
	private static int pesoMaximo = 4000;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso += peso;
		comprobarPeso();
	}

	/**
	 * Metodo que comprueba el peso del gato y te muestra un mensaje. Si el gato muere te cambia el estado a muerto
	 */
	private void comprobarPeso() {
		if (peso < 1500) {
			System.out.println("Tengo hambre, dame de comer. (= ~ .. ~ =)");
		}
		if (peso > 3500) {
			System.out
					.println("He comido demasiado, ¡¡Voy a explotar!!. (= ~ .. ~ =)");
		}
		if (peso <= pesoMinimo) {
			System.out.println("Ohhh!! ¡¡††" + nombre
					+ "†† ha muerto de hambre!! (= * .. * =)");
			setEstado("muerto");
		}
		if (peso >= pesoMaximo) {
			System.out.println("Ohhh!! ¡¡††" + nombre
					+ "†† ha muerto de sobrepeso!! (= * .. * =)");
			setEstado("muerto");
		}
	}

	public void jugar() {
		System.out.println("“Qué diver...” (= ^ .. ^ =)");
		setPeso(-100);
		setEstado("jugando");
	}

	public void comer() {
		System.out.println("“Rico rico...” (= ^ .. ^ =)");
		setPeso(100);
		setEstado("comiendo");
	}

	public void dormir() {
		System.out.println("“Ronroneo. Zzz...” (= ^ .. ^ =)");
		setEstado("durmiendo");
	}

	public void mostrar() {
		System.out.println("Hola, soy " + nombre + " de raza " + raza
				+ ". Peso " + peso + " gramos y estoy " + estado + ".");
	}
}
