package abstractionexample;

interface i1 {
	// variable-----> by default------>public static final
	// method------> by default------->public abstract
	// no complete methods/ non abstract methods
	// no costructor
}

interface Drawable {
	int salary = 25000;

	void draw();
}

class Rectangle1 implements Drawable {
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle implements Drawable {
	public void draw() {
		System.out.println("Drawing circle");
	}
}

public class Interface1 {

	public static void main(String[] args) {
		System.out.println("Interface variable salary: " + Drawable.salary);
		Rectangle1 r1 = new Rectangle1();
		r1.draw();
		Circle c1 = new Circle();
		c1.draw();
		Drawable d = new Circle();
		d.draw();

	}

}
