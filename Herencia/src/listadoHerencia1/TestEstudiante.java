package listadoHerencia1;

public class TestEstudiante {
	public static void main(String[] args) {
		Persona persona1 = new Persona("Nombre1", "Apellido1", "12345678A");
		Persona persona2 = new Persona("Nombre2", "Apellido2", "12345678B");
		Estudiante estudiante1 = new Estudiante("Nombre3", "Apellido3",
				"12312312C", Estudios.ESO);
		Estudiante estudiante2 = new Estudiante("Nombre4", "Apellido4",
				"12312312D", Estudios.UNIVERSIDAD);

		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(estudiante1);
		System.out.println(estudiante2);

		persona1 = estudiante1;// Puede usar solo los metodos que están en la
								// clase Persona
		System.out.println(persona1);

		estudiante2 = (Estudiante) persona2; // Pueden usarse tanto los metodos
												// de la clase Estudiante como
												// los de la clase Persona, pero
												// al usar los de la clase
												// Estudiante no estarán
												// definidos ya que
												// originalmente el objeto era
												// una Persona y no tiene los
												// datos referentes a Estudiante
		System.out.println(estudiante2);

	}
}
