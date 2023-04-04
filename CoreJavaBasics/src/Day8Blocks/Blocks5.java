package Day8Blocks;

public class Blocks5 {
	static {
		System.out.println("***********Running Static Block of class Blocs5*************");
	}
	{
		System.out.println("Running Non-static Block of class Blocks5....!");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts....!");
		Blocks5 b1 = new Blocks5();
		System.out.println("*****************************!");
		Blocks5 b2 = new Blocks5();
		System.out.println("main() Ends....!");

	}

}
