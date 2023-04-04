package Day5Methods;

public class NonStaticMethodExample1 {

	public static void main(String[] args) {
		NonStaticMethodExample1 e1=new NonStaticMethodExample1();
		e1.displayPersionalInfo();
		e1.displayPersionalInfo("vitthal", "student", "jalaon");
		e1.calling(68499000);

	}

	public void displayPersionalInfo() {
		System.out.println("Hi I am vitthal");
		System.out.println("Hi I am student of Testing");
		System.out.println("Hi I am From jalaon");
	}

	public void displayPersionalInfo(String name, String prof, String location) {
		System.out.println("Hi I am " + name);
		System.out.println("Hi I am " + prof);
		System.out.println("Hi I am From " + location);
	}

	public void calling(int num) {
		System.out.println("Hi I am vitthal");
		System.out.println("calling using no." + num);
		System.out.println("Hi I am From jalaon");
	}

}
