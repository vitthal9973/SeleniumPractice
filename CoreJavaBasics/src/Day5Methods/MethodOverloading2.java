package Day5Methods;

public class MethodOverloading2 {

		public void square() {
			System.out.println("No Parameter Method called");
		}
		public void square(int number) {
			int square = number * number;
			System.out.println("Method With Integer Argument called "+square);
		}
		public void square(float number) {
			float square=number * number;
			System.out.println("Method With double Argument called "+square);
		}
		
		public static void main(String[] args) {
			MethodOverloading2 obj=new MethodOverloading2();
			obj.square(2.5f);
			obj.square();
			obj.square(5);
	}

}
