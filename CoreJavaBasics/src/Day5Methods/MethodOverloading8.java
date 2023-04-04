package Day5Methods;

public class MethodOverloading8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main('a');
		main(10);

	}
	public static void main(int i) {
		System.out.println("I Am main(int)");
		
	}
	public static void main(char i) {
		System.out.println("I Am main(char)");
		
	}

}
