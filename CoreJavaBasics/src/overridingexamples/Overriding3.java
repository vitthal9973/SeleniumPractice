package overridingexamples;

class Human {
	void eat() {
		System.out.println(" Human is Eating");
	}
}

class Boy extends Human {
	public void eat() {
		System.out.println("Boy is Eating");
	}
}

public class Overriding3 {

	public static void main(String[] args) {
		Boy obj = new Boy();
		obj.eat();
		Human h1 = new Boy();
		h1.eat();
	}

}
