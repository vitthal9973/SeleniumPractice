package abstractionexample;

interface Animal12 {
	int age = 20;

	public void animalSound();

	public void sleep();
}

interface Reptile {
	public void color();
}

class Pig12 implements Animal12 {
	public void animalSound() {
		System.out.println("The pig says wee wee");
	}

	public void sleep() {
		System.out.println("Zzz");
	}
}

class Dog12 extends Pig12 implements Reptile {
	public void animalSound() {
		System.out.println("The pig says bhow bhow");
	}

	public void color() {
		System.out.println("Color: blue");
	}
}

public class Interface7 {

	public static void main(String[] args) {
		Pig12 p1 = new Pig12();
		p1.animalSound();
		p1.sleep();
		Dog12 d1 = new Dog12();
		d1.animalSound();
		d1.sleep();
		d1.color();

	}

}
