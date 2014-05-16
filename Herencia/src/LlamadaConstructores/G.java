package LlamadaConstructores;

/**
 * <h1>Sobrescritura de métodos de instancia (de objetos, no static).</h1>
 * Consiste en definir un método en la clase hijo con la misma signatura y valor
 * devuelto que la clase padre
 * 
 * Para sobrescribir un método se necesita:
 * <ol>
 * <li>Misma signatura (nombre, lista de argumentos (número y tipo))</li>
 * <li>Mismo valor devuelto o subtipo del original (covariant return type)</li>
 * <li>Misma visibilidad o mayor</li>
 * </ol>
 * 
 * 
 * Notas sobre sobrescribir métodos:
 * <ol>
 * <li>No puede sobrescribirse ni un método final, static o private</li>
 * <li>Anotación @Override: para indicarle al compilador que se está
 * sobrescribiendo un método</li>
 * <li>Puede utilizarse super.metodoSobrescrito() para utilizar la versión
 * sobrescrita</li>
 * <li>La ligadura dinámica permite en tiempo de ejecución decidir qué
 * implementación se invoca</li>
 * </ol>
 * Para probar:
 * 
 * <ol>
 * <li>Cambia el tipo del valor devuelto en un método sobrescrito
 * <li>Cambia el tipo de un argumento en un método sobrescrito
 * <li>Cambia el número de argumentos del método sobrescrito
 * <li>Disminuye la visibilidad del método sobrescrito
 * </ol>
 * 
 * @author lmagarin
 * 
 */
public class G extends F {
	Character character = 'b';

	public G(int entero, Float decimal, Character character) {
		super(entero, decimal);
		this.character = character;
	}

	@Override
	public String toString() {
		return "G [character=" + character + ", toString()=" + super.toString()
				+ "]";
	}

}
