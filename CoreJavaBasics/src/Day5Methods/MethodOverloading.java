package Day5Methods;

public class MethodOverloading {
	static double res;
	static void square() {
		System.out.println("No Parameter Method called");
	}
	static public void square(int number) {
		res=number * number;
		System.out.println("Method With Integer Argument called "+res);
	}
	static public void square(double number) {
		res=number * number;
		System.out.println("Method With double Argument called "+res);
	}
	
	public static void main(String[] args) {
		MethodOverloading.square(2.5);
		MethodOverloading.square();
		MethodOverloading.square(5);
	}

}
