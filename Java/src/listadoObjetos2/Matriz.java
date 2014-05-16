package listadoObjetos2;

public class Matriz {
	private int[][] valores;

	public Matriz(int filas, int columnas) {
		valores = new int[filas][columnas];
		crearMatriz();
	}

	Matriz sumar(Matriz matriz2) {
		Matriz suma = new Matriz(this.valores.length, this.valores[0].length);
		for (int i = 0; i < this.valores.length; i++) {
			for (int j = 0; j < this.valores[i].length; j++) {
				suma.valores[i][j] = this.valores[i][j] + matriz2.valores[i][j];
			}
		}
		return suma;
	}

	Matriz restar(Matriz matriz2) {
		Matriz resta = new Matriz(this.valores.length, this.valores[0].length);
		for (int i = 0; i < this.valores.length; i++) {
			for (int j = 0; j < this.valores[i].length; j++) {
				resta.valores[i][j] = this.valores[i][j]
						- matriz2.valores[i][j];
			}
		}
		return resta;
	}

	Matriz multiplicar(Matriz matriz2) {
		Matriz producto = new Matriz(this.valores.length,
				matriz2.valores[0].length);
		for (int i = 0; i < producto.valores.length; i++) {
			for (int j = 0; j < producto.valores[i].length; j++) {
				producto.valores[i][j]=0;
				for (int k = 0; k < this.valores[i].length; k++) {
					producto.valores[i][j] += this.valores[i][k]
							* matriz2.valores[k][j];
				}
			}
		}
		return producto;
	}

	void crearMatriz() {
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[0].length; j++) {
				valores[i][j] = ((int) (Math.random() * 10));
			}
		}
	}

	void mostrarMatriz() {
		for (int i = 0; i < valores.length; i++) {
			System.out.print("|");
			for (int j = 0; j < valores[0].length; j++) {
				System.out.print(valores[i][j] + "\t");
			}

			System.out.print("| \n");
		}
	}

}
