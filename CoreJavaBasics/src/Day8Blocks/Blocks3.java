package Day8Blocks;

public class Blocks3 {
	Blocks3() {
		System.out.println("zero param....!");
	}

	Blocks3(int i) {
		System.out.println("int param ....!");
	}

	{
		System.out.println("Running Non-static Block o f class Blocks3....!");
	}

	public static void main(String[] args) {
		System.out.println("main() Starts....!");
		Blocks3 b1 = new Blocks3();
		System.out.println("*****************************!");
		Blocks3 b2 = new Blocks3(10);
		System.out.println("main() Ends....!");

	}

}
