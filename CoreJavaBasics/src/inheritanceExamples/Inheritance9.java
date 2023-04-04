package inheritanceExamples;

class Company202 {
	void display() {
		System.out.println("I am company class display()...");
	}
}

class Employee202 extends Company202 {
	void display() {
		System.out.println("I am Employee class display()...");
		super.display();
	}

	void callme() {
		System.out.println("I am Employee class callme()...");

	}
}

public class Inheritance9 {

	public static void main(String[] args) {
		Employee202 e1 = new Employee202();
		e1.display();
		e1.callme();
		System.out.println("****************************************");
		Company202 e2 = new Company202();
		e2.display();

	}

}
