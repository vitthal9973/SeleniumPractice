package Day7Tthis;

class A10 {
	A10() {
		System.out.println("hello zero");
	}

	A10(double d) {
		System.out.println("hello double " + d);
	}

	A10(int x) {
		System.out.println("hello int " + x);

	}
}

public class TthisStatement01 {

	public static void main(String[] args) {
		A10 a1 = new A10();
		A10 a2 = new A10(10);
		A10 a3 = new A10(10.23);
	}

}
