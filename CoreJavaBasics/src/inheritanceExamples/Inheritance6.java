package inheritanceExamples;

class Grandfather {
	Grandfather() {
		System.out.println("I am Class Grandfather Constructer");
	}

	void myHome() {
		System.out.println("I am Home Grandfather");
	}
}

class Father extends Grandfather {
	Father(double d) {
		super();
		System.out.println("I am Class Father Constructer");
	}

	void myCar() {
		System.out.println("I am Car of Father");
	}
}

class Child1 extends Father {
	Child1(int i) {
		super(12.34);
		System.out.println("I am Class Child1 Constructer");
	}

	void myBike() {
		System.out.println("I am Bike of child");
	}
}

public class Inheritance6 {

	public static void main(String[] args) {
		System.out.println("****************************************");
		Child1 c1 = new Child1(21);
		c1.myHome();
		c1.myCar();
		c1.myBike();
		System.out.println("****************************************");
		Father f1 = c1; // Father f2= new Child1(21);
		f1.myHome();
		f1.myCar();
		// f1.myBike();
		System.out.println("****************************************");
		Grandfather g1 = c1;// Grandfather g2=new Child(20);
		g1.myHome();
		// g1.myCar();
		// g1.myBike();
		System.out.println("****************************************");
		Grandfather g2 = new Father(12.36);
		g2.myHome();

	}

}
