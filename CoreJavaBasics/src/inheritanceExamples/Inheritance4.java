package inheritanceExamples;

class vehicle {
	public void wheels() {
		System.out.println(" I have a wheels");
	}
}

class bike extends vehicle {
	public void countwl() {
		System.out.println(" I am bike has two wheels");
	}
}

class Car1 extends vehicle {
	public void countwlc() {
		System.out.println(" I am car has 4 wheels");
	}
}

class scooter extends vehicle {
	public void countwls() {
		System.out.println(" I am scooter has 2 wheels");

	}
}

public class Inheritance4 {

	public static void main(String[] args) {
		scooter sc = new scooter();
		sc.wheels();
		sc.countwls();
		Car1 c = new Car1();
		c.wheels();
		c.countwlc();
		bike b = new bike();
		b.wheels();
		b.countwl();
	}

}
