package LlamadaConstructores;

/**
 * 
 * @author lmagarin
 *
 */
public class TestMetodoSobrescrito {

	public static void main(String[] args) {
		F a = new F(1, 2f);
		G b = new G(3, 4f, 'z');
		
		System.out.println(b.toString());
		System.out.println(((F)b).toString());
	}
}
