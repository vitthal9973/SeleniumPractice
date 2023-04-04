package Day8Blocks;

public class Blocks7 {
	static final int age;
	final double salary;
	static {
		age = 30;
		System.out.println("I am SIB");
	}
	{
		salary = 45000.32;
		System.out.println("I am NSIB/IIB");
	}

	public static void main(String[] args) {
		System.out.println("main() Starts...");
		System.out.println("age: " + age);
		System.out.println("----------------------");
		Blocks7 b1 = new Blocks7();
		System.out.println("Salary: " + b1.salary);
		System.out.println("main() Ends....");

	}

}
