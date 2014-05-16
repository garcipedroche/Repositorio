package orquesta;

import java.util.ArrayList;

public class Orquesta {
	private ArrayList<Instrumento> orquesta = new ArrayList<Instrumento>();

	Orquesta() {
		orquesta.add(new Cuerda("Violin"));
		orquesta.add(new Percusion("Tambor"));
		orquesta.add(new Viento("Flauta"));

	}

	void queSomos() {
		for (int i = 0; i < orquesta.size(); i++)
			System.out.println(orquesta.get(i).queSoy());
	}

	void afinarOrquesta() {
		for (int i = 0; i < orquesta.size(); i++)
			orquesta.get(i).afinar();
	}
	
	void tocarInstrumentos(){
		for (int i = 0; i < orquesta.size(); i++)
			orquesta.get(i).tocar(Nota.pedirNota());
	}
}
