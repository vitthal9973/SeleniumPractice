package abstractionexample;

abstract class Bike1 {
	abstract void run();

	void speed(int spd) {
		System.out.println("Bike Speed: " + spd);
	}
}

class Honda4 extends Bike1 {
	void run() {
		System.out.println("running safely");
	}

	void speed(int spd) {
		System.out.println("Honda4 speed: " + spd);
		super.speed(120);
	}

	void color() {
		System.out.println("Honda1 color is blue");
	}
}

public class abstractClass1 {

	public static void main(String[] args) {
		Honda4 obj = new Honda4();
		obj.run();
		obj.speed(60);
		obj.color();
		// Bike b1=new Bike1();// we can not creat object of abstract class
		Bike1 b2 = new Honda4();
		b2.run();
		b2.speed(20);
		// b2.color();

	}

}
