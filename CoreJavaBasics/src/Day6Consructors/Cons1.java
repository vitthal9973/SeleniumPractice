package Day6Consructors;

public class Cons1 {
	Cons1() {
		System.out.println("This is Zero parameterized constructer");
	}

	public Cons1(char c) {
		System.out.println("This is single parameterized constructer");
	}

	Cons1(int num1, int num2) {
		System.out.println("This is int int parameterized constructer");
	}

	Cons1(double num1, int num2) {
		System.out.println("This is double int parameterized constructer");
	}

	Cons1(int num1, double num2) {
		System.out.println("This is int double parameterized constructer");
	}

	public static void main(String[] args) {
		Cons1 c1 = new Cons1();
		Cons1 c2 = new Cons1(10,20);
		Cons1 c3 = new Cons1('d');
		Cons1 c4 = new Cons1(10d,20);
		Cons1 c5 = new Cons1(10,20.45);

	}

}
