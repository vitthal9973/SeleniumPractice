package inheritanceExamples;

class A {
	static int a = 10;
	int b = 20;
	double c = 13.45;
}

class B {
	static int x = 30;
	int y = 40;
	double z = 53.45;
}

class C {
	static int p = 50;
	int q = 60;
	double r = 66.45;
}

public class Inheritance0 {

	public static void main(String[] args) {
		System.out.println("Class A static variable: " + A.a);
		System.out.println("Class B static variable: " + B.x);
		System.out.println("Class C static variable: " + C.p);
		A a1 = new A();
		System.out.println("Class A non-static variable b: " + a1.b);
		System.out.println("Class A non-static variable c: " + a1.c);
		B b1 = new B();
		System.out.println("Class B non-static variable b: " + b1.y);
		System.out.println("Class B non-static variable c: " + b1.z);
		C c1 = new C();
		System.out.println("Class C non-static variable b: " + c1.q);
		System.out.println("Class C non-static variable c: " + c1.r);

	}

}
