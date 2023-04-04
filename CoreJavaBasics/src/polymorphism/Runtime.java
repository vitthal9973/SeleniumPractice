package polymorphism;

class Animal {
	void eat() {
		System.out.println("Animal eat");
	}
}

class herbivores extends Animal {
	void eat() {
		System.out.println("herbivors Eat plants");
	}
}

class omnivores extends Animal {
	void eat() {
		System.out.println("omnivores Eat plants and meat");
	}
}

class carnivores extends Animal {
	void eat() {
		System.out.println("carnivores Eat meat");
	}
}

public class Runtime {

	public static void main(String[] args) {
		Animal A = new Animal();
		A.eat();
		Animal h = new herbivores();
		h.eat();
		Animal o = new omnivores();
		o.eat();
		Animal c = new carnivores();
		c.eat();

	}

}
