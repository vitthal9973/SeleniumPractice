package overridingexamples;

class ABC {
	public void myMethod() {
		System.out.println("method of ABC class");
	}
}

public class Overriding4 extends ABC {
	public void myMethod() {
		super.myMethod();
		System.out.println("Overriding method of class Overriding");
	}

	public static void main(String[] args) {
		Overriding4 obj = new Overriding4();
		obj.myMethod();
	}

}
