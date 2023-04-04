package overridingexamples;

class Animal6 {
	String color = "white of red";
}

class Dog6 extends Animal6 {
	String color = "black";

	void printColor() {
		System.out.println("Dogs color is: " + color);
		System.out.println("Animal color is: " + super.color);
	}
}

public class SuperKeyWord1 {

	public static void main(String[] args) {
		Dog6 d = new Dog6();
		d.printColor();
		String s1 = "12 servers";
		System.out.println(s1.matches(".+[\\s]servers"));
		System.out.println(s1.indexOf("shailesh"));
		String[] str = s1.split("shailesh");
	}

}
