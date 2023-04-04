package Day5Methods;

class DisplayOverloading {
	public void disp(int num, char c) {
		System.out.println(num + " " + c);
	}

	public void disp(char c, int num) {
		System.out.println(c + " " + num);
	}
}

public class MethodOverloading4 {
	public static void main(String[] args) {
		DisplayOverloading obj = new DisplayOverloading();
		obj.disp(26, 'x');
		obj.disp('a', 10);
		MethodOverloading4 m1 = new MethodOverloading4();
		m1.call();
	}

	public void call() {
		System.out.println("Calling ");
	}

}
