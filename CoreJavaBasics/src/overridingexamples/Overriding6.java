package overridingexamples;

class Parent2 {
	private void m1() {
		System.out.println("From Parent m1()");
	}

	protected void m2() {
		System.out.println("From Parent m2()");

	}

}

class Child2 extends Parent2 {
	private void m1() {
		System.out.println("From Child2 m1()");
	}

	public void m2() {
		m1();
		System.out.println("From Child2 m2()");

	}
}

public class Overriding6 {

	public static void main(String[] args) {
		Parent2 obj1 = new Parent2();
		obj1.m2();
		Parent2 obj2 = new Parent2();
		obj2.m2();
		// obj2.m1();
	}

}
