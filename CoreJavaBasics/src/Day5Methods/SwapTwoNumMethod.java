package Day5Methods;

public class SwapTwoNumMethod {

	public static void main(String[] args) {
		SwappingTwoNo(20, 10);

	}

	static void SwappingTwoNo(int num1, int num2) {
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
