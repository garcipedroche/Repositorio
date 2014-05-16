package orquesta;

import utiles.Teclado;

/**
 * Implementa la siguiente jerarqu�a de clases:
 * 
 * Clase abstracta Instrumento:
 * 
 * campo privado i
 * 
 * m�todo abstracto tocar(Nota)
 * 
 * m�todo p�blico queSoy() que devuelva la cadena "Instrumento"
 * 
 * m�todo abstracto afinar(); Para futuras implementaciones, recuerda que para
 * afinar hay que tocar un conjunto de notas.
 * 
 * Enumeraci�n Nota
 * 
 * Toma los siete valores constantes DO, RE, MI, FA, SOL, LA, SI.
 * 
 * Clase Viento que hereda de Instrumento
 * 
 * Implementa los m�todos necesarios (que muestre mensaje y argumento si lo
 * tiene)
 * 
 * redefine el m�todo queSoy() que devuelva la cadena "Instrumento de Viento"
 * 
 * Clase Percusion que hereda de Instrumento
 * 
 * Implementa los m�todos necesarios (que muestre mensaje y argumento si lo
 * tiene)
 * 
 * redefine el m�todo queSoy() que devuelva la cadena "Instrumento de Percusi�n"
 * 
 * Clase Cuerda que hereda de Instrumento
 * 
 * Implementa los m�todos necesarios (que muestre mensaje y argumento si lo
 * tiene)
 * 
 * redefine el m�todo queSoy() que devuelva la cadena "Instrumento de Cuerda"
 * 
 * Clase Musica
 * 
 * Implementa el m�todo main() que cree una orquesta con todos un instrumento de
 * cada tipo.
 * 
 * Implementa un m�todo afinarTodos() que afine todos los instrumentos.
 * 
 * Implementa un m�todo tocarTodos() que toque todos los instrumentos.
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
	 * �Cu�ntos campos i se han creado? Uno por cada objeto que se cree. Ya se a
	 * Viento, Percusion o Cuerda.
	 * 
	 * �C�mo has implementado al objeto orquesta? Un instrumento de cuerda otro de percusion y otro de cuerda.
	 * 
	 * �Hay alguna clase que no pueda instanciarse? La clase Instrumento ya que
	 * es abstract.
	 * 
	 * Con respecto a la enumeraci�n Nota:
	 * 
	 * �D�nde la has implementado? �Dentro o fuera de la clase? Fuera de la
	 * clase.
	 * 
	 * �Qu� modificador de visibilidad admite? Friendly.
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
				System.out.println("Error, Nota no v�lida.");
			}
		}while(true);
	}
}