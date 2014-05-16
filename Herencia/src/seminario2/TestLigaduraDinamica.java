package seminario2;

public class TestLigaduraDinamica {
	public static void main(String[] args) {
		C a = new D();
		System.out.println(a);
		
	}
}
class C{
	@Override
	public String toString() {
		return "C- padre";
	}	
}
class D extends C{
	@Override
	public String toString() {
		return "D- hijo";
	}	
}