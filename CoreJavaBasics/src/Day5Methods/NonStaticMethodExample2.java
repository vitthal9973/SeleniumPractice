package Day5Methods;

public class NonStaticMethodExample2 {

	public static void main(String[] args) {
		NonStaticMethodExample2 n1=new NonStaticMethodExample2 ();
		System.out.println("Result: " + n1.multiplyTwoNumbers(10, 20));
		// System.out.println("Result: "+addTwoNumbers(10,20));
		n1.addTwoNumbers(10, 20);
	}

	 int multiplyTwoNumbers(int n1, int n2) {
		System.out.println("Number 1: " + n1);
		System.out.println("Number 2: " + n2);
		int res = n1 * n2;
		return res;
	}

	 void addTwoNumbers(int num1, int num2) {
		System.out.println("Number 1: " + num1);
		System.out.println("Number 2: " + num2);
		int res = num1 + num2;
		System.out.println("Result: " + res);
	}

}
