package Day8Blocks;

public class Blocks9 {
	final static int age;
	final double salary;

	Blocks9() {
		System.out.println("I am Blocks9 cons....!");
	}

	void print() {
		System.out.println("age: " + age);
		System.out.println("salary: " + salary);

	}

	public static void main(String[] args) {
		System.out.println("main() Starts....!");
		Blocks9 b1 = new Blocks9();
		System.out.println("main() Ends!");
	}

	{
		salary = 45000.32;
		print();
	}
	static {
		age = 25;
	}

}
