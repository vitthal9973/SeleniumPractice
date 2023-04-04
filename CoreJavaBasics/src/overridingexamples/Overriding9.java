package overridingexamples;

class Parent5 {
	void show() {
		System.out.println("parents show()");
	}
}

class Child5 extends Parent5 {
	void show() {
		super.show();
		System.out.println("Child's show() ");
	}
}

class GrandChild extends Child5 {
	void show() {
		super.show();
		System.out.println("GrandChild's show()");
	}
}

public class Overriding9 {

	public static void main(String[] args) {
		Parent5 obj1 = new GrandChild();
		obj1.show();
	}

}
