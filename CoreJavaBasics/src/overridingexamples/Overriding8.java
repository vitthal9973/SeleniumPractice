package overridingexamples;

class Parent4 {
	static void m1() {
		System.out.println("From parent" + "static m1()");
	}

	void m2() {
		System.out.println("From parent" + "non-static m2()");
	}
}

class Child4 extends Parent4 {
	static void m1() {
		System.out.println("From Cild" + "static m1()");
	}

	public void m2() {
		System.out.println("From parent" + "non-static m2()");
	}
}

public class Overriding8 {

	public static void main(String[] args) {
		Parent4 obj1 = new Child4();
		obj1.m1();
		obj1.m2();
	}

}
