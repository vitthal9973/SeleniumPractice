package overridingexamples;

class Parent {
	void show() {
		System.out.println("Parent's show()");
	}
}

class Child extends Parent {
	void show() {
		System.out.println("Child's show");
	}
}

public class Overriding5 {

	public static void main(String[] args) {
		Parent obj = new Parent();
		obj.show();
		Parent obj2 = new Child();
		obj2.show();
	}

}
