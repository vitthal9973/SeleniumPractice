package abstractionexample;

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	protected void draw() {
		System.out.println("drawing Rectanle");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("drawing Circle");
	}
}

public class abstractClass2 {

	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
		Shape s1 = new Rectangle();
		s1.draw();

	}

}
