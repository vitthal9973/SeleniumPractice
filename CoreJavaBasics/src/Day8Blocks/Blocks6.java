package Day8Blocks;

public class Blocks6 {
	static {
		System.out.println("***********Running Static Block of class Blocs6*************");
	}
	{
		System.out.println("Running Non-static Block of class Blocks6...!");
	}

	public static void main(String[] args) {
		System.out.println("main() Starts....!");
		Blocks6 b1 = new Blocks6();
		System.out.println("*****************************!");
		Blocks6 b2 = new Blocks6();
		System.out.println("main() Ends....!");

	}

	static {
		System.out.println("***********Running Static Block of class Blocs6*************");
	}
	{
		System.out.println("Running Non-static Block of class Blocks6....!");
	}

}
