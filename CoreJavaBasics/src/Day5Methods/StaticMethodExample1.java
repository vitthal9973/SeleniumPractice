package Day5Methods;

public class StaticMethodExample1 {

	public static void main(String[] args) {

		displayPersionalInfo();
		displayPersionalInfo( "vitthal","student","jalaon");
		calling(68499000);
		
				
				
	}

	static void displayPersionalInfo() {
	System.out.println("Hi I am vitthal");
	System.out.println("Hi I am student of Testing");
	System.out.println("Hi I am From jalaon");
}

	static void displayPersionalInfo(String name, String prof, String location) {
		System.out.println("Hi I am "+name);
		System.out.println("Hi I am "+prof);
		System.out.println("Hi I am From "+location);
	}

	static void calling(int num) {
		System.out.println("Hi I am vitthal");
		System.out.println("calling using no." + num);
		System.out.println("Hi I am From jalaon");
	}

}
