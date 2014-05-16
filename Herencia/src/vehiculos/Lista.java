package vehiculos;

import java.util.ArrayList;

import utiles.Teclado;

/**
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class Lista<T> {
	private ArrayList<T> lista;

	public Lista() {
		lista = new ArrayList<T>();
	}

	public Lista(ArrayList<T> lista2) {
		lista = new ArrayList<T>(lista2);
	}

	T anadir(T elemento) {
		lista.add(elemento);
		return elemento;
	}

	T anadir(int index, T elemento) {
		if (index <= (lista.size()) && index >= 0) {
			lista.add(index, elemento);
			return elemento;
		}
		return null;
	}

	T reemplazar(int index, T elemento) {
		if (index >= 0 && index < (lista.size()) && !lista.isEmpty()) {
			lista.set(index, elemento);
			return elemento;
		}
		return null;
	}

	int size() {
		return lista.size();
	}

	T borrar(int index) {
		if (index >= 0 && index < (lista.size()) && !lista.isEmpty())
			return lista.remove(index);
		return null;
	}

	T buscar(int index) {
		if (index >= 0 && index < (lista.size()) && !lista.isEmpty())
			return lista.get(index);
		return null;
	}

	T primero() {
		if (!lista.isEmpty())
			return lista.get(0);
		return null;
	}

	T ultimo() {
		if (!lista.isEmpty())
			return lista.get(lista.size() - 1);
		return null;
	}

	Lista<T> copiar() {
		Lista<T> copia = new Lista<T>(this.lista);
		return copia;
	}

	int recogerIndice(String string, int max) {
		int indice;
		do {
			indice = Teclado.leerEntero(string);
		} while (comprobarIndice(--indice, max));
		return indice;
	}

	private boolean comprobarIndice(int indice, int max) {
		if ((indice >= 0) && (indice <= max))
			return false;
		return true;
	}

	boolean isEmpty() {
		if (lista.isEmpty())
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "Lista [lista=\n" + lista + "\n]";
	}

	T subirPuesto(int index) {
		if (index > 0 && index < lista.size() - 1 && !lista.isEmpty()) {
			T temp = lista.remove(index);
			lista.add(index - 1, temp);
			return temp;
		}
		return null;
	}
	
	T bajarPuesto(int index) {
		if (index >= 0 && index < lista.size() - 2 && !lista.isEmpty()) {
			T temp = lista.remove(index);
			lista.add(index + 1, temp);
			return temp;
		}
		return null;
	}
}
