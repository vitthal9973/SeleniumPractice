package Day5Methods;

public class NonStaticMethodExample3 {

	public static void main(String[] args) {
		NonStaticMethodExample3 n1 = new NonStaticMethodExample3();
		n1.swapTwoNumbers(15, 25);
		System.out.println("Ascii value of 'F': " + n1.getAsciiValue('F'));
		n1.getQuotientAndRemainder(25,7);
	}

	void getQuotientAndRemainder(int num1, int num2) {
		System.out.println("Number1 is " + num1);
		System.out.println("Number2 is " + num2);
		int q, r;
		q = num1 / num2;
		r = num1 % num2;
		System.out.println("Division is " + q);
		System.out.println("Remainder is " + r);
	}

	int getAsciiValue(char ch) {
		return ch;
	}

	void swapTwoNumbers(int num1, int num2) {
		System.out.println("*****Before swapping****");
		System.out.println("Number 1 is " + num1);
		System.out.println("Number 2 is " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("*****After swapping****");
		System.out.println("Number 1 is " + num1);
		System.out.println("Number 2 is " + num2);

	}

}
