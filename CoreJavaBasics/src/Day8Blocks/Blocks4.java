package Day8Blocks;

public class Blocks4 {
	Blocks4() {
		System.out.println("zero param....!");
	}
	{
		System.out.println("Running Non-static Block-1of class Blocks4....!");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts....!");
		Blocks4 b1 = new Blocks4();
		System.out.println("*****************************!");
		Blocks4 b2 = new Blocks4();
		System.out.println("main() Ends....!");

	}
	{
		System.out.println("Running Non-static Block-2 of class Blocks4....!");
	}

}
