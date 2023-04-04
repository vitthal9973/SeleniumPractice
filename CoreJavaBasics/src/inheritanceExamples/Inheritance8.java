package inheritanceExamples;

class fruitA {
	int fruitAge;

	fruitA() {
		System.out.println("fruitA class cons");
		fruitAge = 7;
	}

	public void taste() {
		System.out.println("fruit are sweet");
	}
}

class mango extends fruitA {
	int fruitAge;

	mango() {
		// super();
		System.out.println("mango class cons");
		fruitAge = 5;
	}

	public void taste() {
		System.out.println("Mango Are Tart in Taste");
	}

	public void shape() {
		System.out.println("Mango is round");

	}

}

public class Inheritance8 {

	public static void main(String[] args) {
		System.out.println("****************************************");
		mango m1 = new mango();
		m1.shape();
		m1.taste();
		System.out.println(m1.fruitAge);
		fruitA f1 = new fruitA();
		System.out.println(f1.fruitAge);
		System.out.println("****************************************");

	}

}
