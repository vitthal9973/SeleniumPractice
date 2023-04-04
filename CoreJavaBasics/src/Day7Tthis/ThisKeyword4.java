package Day7Tthis;

public class ThisKeyword4 {
	int age;

	void call() {
		System.out.println("I am call method");
	}

	void m(int age) {
		System.out.println("Local age " + age);
		System.out.println("Global age " + this.age);
		// call();
		this.call();
		System.out.println("this Keyword value is" + this);

	}

	public static void main(String[] args) {
		ThisKeyword4 obj = new ThisKeyword4();
		System.out.println("object obj value is" + obj);
		obj.m(25);

	}

}
