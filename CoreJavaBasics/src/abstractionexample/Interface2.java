package abstractionexample;

interface Bank {
	float rateOfInterest();
}

class SBI1 implements Bank {
	public float rateOfInterest() {
		return 9.14f;
	}
}

class PNB1 implements Bank {
	public float rateOfInterest() {
		return 9.f;
	}
}

public class Interface2 {

	public static void main(String[] args) {
		SBI1 s1 = new SBI1();
		System.out.println("SBI Rate of Intrest: " + s1.rateOfInterest());
		PNB1 p1 = new PNB1();
		System.out.println("SBI Rate of Intrest: " + p1.rateOfInterest());
		Bank b = new PNB1();
		System.out.println("SBI Rate of Intrest: " + b.rateOfInterest());

	}

}
