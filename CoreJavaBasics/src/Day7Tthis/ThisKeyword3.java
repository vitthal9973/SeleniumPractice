package Day7Tthis;

class A {
	void m() {
		System.out.println(" hello m");
	}

	void n() {
		System.out.println(" hello n");
		this.m();
		// m();
	}
}

public class ThisKeyword3 {
	void methodOne() {
		System.out.println("Inside Method One");
	}

	void methodTwo() {
		System.out.println("Inside Method Two");
		//methodOne();
		this.methodOne();
	}

	public static void main(String[] args) {
		ThisKeyword3 obj = new ThisKeyword3();
		obj.methodTwo();
		A a = new A();
		a.n();
	}

}
