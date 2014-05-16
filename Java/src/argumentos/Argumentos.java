package argumentos;

/**
 * Crea tambi�n una clase Argumentos (con main) que invoque a los tres m�todos
 * anteriores y muestre inmediatamente despu�s los argumentos enviados. Recuerda
 * que cuando env�as un argumento est�s haciendo una copia para utilizarla
 * dentro del m�todo. As�: Cuando env�as una variable primitiva(int, char,
 * double...), est�s enviando su copia. Si la modificas, no afecta al argumento
 * original (a no ser que la devuelvas con un retunr y lo asignes) Cuando env�as
 * una referencia a un objeto (String, array, cualquier otro objeto ...), est�s
 * enviando su copia. Si la modificas, no afecta al argumento original
 * (referencia), PERO S� PUEDES MODIFICAR EL OBJETO AL QUE APUNTA
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class Argumentos {
	public static void main(String[] args) {
		int i=0;
		char c='a';
		double d=2.18;
		int[] v=new int[2];
		v[0]=3;
		v[1]=7;
		
		Metodos.incrementa(i);
		System.out.println("Valor de i (main): "+i);
		Metodos.modifica(i,c,d);
		System.out.println("Valor de i (main): "+i);
		System.out.println("Valor de c (main): "+c);
		System.out.println("Valor de d (main): "+d);
		Metodos.incrementa(v);
		System.out.println("Valor de v[0] (main):"+ v[0]);
	}
}
