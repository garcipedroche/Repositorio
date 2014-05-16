package seminario2;

public class TestPolimorfismo {
	public static void main(String[] args) {
		A a = new B();
		System.out.println(a);
		
	}
}
class A{
	@Override
	public String toString() {
		return "A- padre";
	}	
}
class B extends A{
	@Override
	public String toString() {
		return "B- hijo";
	}	
}
