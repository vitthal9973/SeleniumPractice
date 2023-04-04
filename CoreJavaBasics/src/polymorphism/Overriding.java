package polymorphism;

class Vehicle {
	void run() {
		System.out.println("Vehicle is Moving");
	}
}

class Car2 extends Vehicle {
	void run() {
		System.out.println("Car is Running safely");
	}
}

public class Overriding {

	public static void main(String[] args) {
		System.out.println("Program starts");
		Car2 obj = new Car2();
		obj.run();
		System.out.println("Program Ends");

	}

}
