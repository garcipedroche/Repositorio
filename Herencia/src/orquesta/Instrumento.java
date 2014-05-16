package orquesta;

import utiles.Teclado;

/**
 * Implementa la siguiente jerarquía de clases:
 * 
 * Clase abstracta Instrumento:
 * 
 * campo privado i
 * 
 * método abstracto tocar(Nota)
 * 
 * método público queSoy() que devuelva la cadena "Instrumento"
 * 
 * método abstracto afinar(); Para futuras implementaciones, recuerda que para
 * afinar hay que tocar un conjunto de notas.
 * 
 * Enumeración Nota
 * 
 * Toma los siete valores constantes DO, RE, MI, FA, SOL, LA, SI.
 * 
 * Clase Viento que hereda de Instrumento
 * 
 * Implementa los métodos necesarios (que muestre mensaje y argumento si lo
 * tiene)
 * 
 * redefine el método queSoy() que devuelva la cadena "Instrumento de Viento"
 * 
 * Clase Percusion que hereda de Instrumento
 * 
 * Implementa los métodos necesarios (que muestre mensaje y argumento si lo
 * tiene)
 * 
 * redefine el método queSoy() que devuelva la cadena "Instrumento de Percusión"
 * 
 * Clase Cuerda que hereda de Instrumento
 * 
 * Implementa los métodos necesarios (que muestre mensaje y argumento si lo
 * tiene)
 * 
 * redefine el método queSoy() que devuelva la cadena "Instrumento de Cuerda"
 * 
 * Clase Musica
 * 
 * Implementa el método main() que cree una orquesta con todos un instrumento de
 * cada tipo.
 * 
 * Implementa un método afinarTodos() que afine todos los instrumentos.
 * 
 * Implementa un método tocarTodos() que toque todos los instrumentos.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public abstract class Instrumento {
	/*
	 * Responde a las siguientes preguntas:
	 * 
	 * ¿Cuántos campos i se han creado? Uno por cada objeto que se cree. Ya se a
	 * Viento, Percusion o Cuerda.
	 * 
	 * ¿Cómo has implementado al objeto orquesta? Un instrumento de cuerda otro de percusion y otro de cuerda.
	 * 
	 * ¿Hay alguna clase que no pueda instanciarse? La clase Instrumento ya que
	 * es abstract.
	 * 
	 * Con respecto a la enumeración Nota:
	 * 
	 * ¿Dónde la has implementado? ¿Dentro o fuera de la clase? Fuera de la
	 * clase.
	 * 
	 * ¿Qué modificador de visibilidad admite? Friendly.
	 * 
	 */
	private String i;

	Instrumento(String i) {
		this.i = i;
	}

	abstract void tocar(Nota nota);

	String queSoy() {
		return "Instrumento";
	}

	abstract void afinar();

	public String getI() {
		return i;
	}

	public void setI(String i) {
		this.i = i;
	}

}

enum Nota {
	DO, RE, MI, FA, SOL, LA, SI;
	
	static Nota pedirNota(){
		do{
			String nota = Teclado.leerCadena("\nNota que desea tocar:");
			switch(nota){
			case "DO":
				return Nota.DO;
			case "RE":
				return Nota.RE;
			case "MI":
				return Nota.MI;
			case "FA":
				return Nota.FA;
			case "SOL":
				return Nota.SOL;
			case "LA":
				return Nota.LA;
			case "SI":
				return Nota.SI;
			default:
				System.out.println("Error, Nota no válida.");
			}
		}while(true);
	}
}