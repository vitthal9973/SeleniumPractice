package abstractionexample;

interface Printable {
	int age = 30;

	void Print();
}

interface Showable {
	public void Show();
}

public class Interface3 implements Printable, Showable {
	public static int age = 45;

	public void Print() {
		System.out.println("Hello, Print");
	}

	public void Show() {
		System.out.println("Hello, Show");
	}

	public static void main(String[] args) {
		Interface3 obj = new Interface3();
		obj.Print();
		obj.Show();
		System.out.println(Printable.age);
		System.out.println(Interface3.age);

	}

}
