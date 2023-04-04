package abstractionexample;

abstract class Animal {
	public abstract void animalSound();

	public void sleep() {
		System.out.println("Zzz");
	}
}

class Pig extends Animal {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}

class Dog8 extends Animal {
	public void animalSound() {
		System.out.println("The dog says: bow bow");
	}
}

public class abstractClass {

	public static void main(String[] args) {
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
		Dog8 d1 = new Dog8();
		d1.animalSound();
		d1.sleep();

	}

}
