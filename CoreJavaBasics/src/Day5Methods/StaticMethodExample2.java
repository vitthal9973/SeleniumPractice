package Day5Methods;

public class StaticMethodExample2 {

	public static void main(String[] args) {
		System.out.println("Result: "+multiplyTwoNumbers(10,20));
		//System.out.println("Result: "+addTwoNumbers(10,20));
		addTwoNumbers(10,20);
	}
	static int multiplyTwoNumbers(int n1, int n2)
	{
		System.out.println("Number 1: "+n1);
		System.out.println("Number 2: "+n2);
		int res=n1*n2;
		return res;
	}
	static void addTwoNumbers(int num1, int num2)
	{
		System.out.println("Number 1: "+num1);
		System.out.println("Number 2: "+num2);
		int res=num1+num2;
		System.out.println("Result: "+res);
	}

}
