package abstractionexample;

abstract class RBIBank {
	abstract double getRateOfInteterestForHomeLoan();

	final void Loan() {
		System.out.println(" As per RBI loan");
	}
}

class SBI101 extends RBIBank {
	double getRateOfInteterestForHomeLoan() {
		return 6.45;
	}
}

class PNB extends RBIBank {
	double getRateOfInteterestForHomeLoan() {
		return 7.5;
	}
}

public class abstractClass3 {

	public static void main(String[] args) {
		PNB p1 = new PNB();
		System.out.println("PNB Rate of Interest is: " + p1.getRateOfInteterestForHomeLoan() + "%");
		p1.Loan();
		SBI101 s1 = new SBI101();
		System.out.println("SBI Rate of Interest is: " + s1.getRateOfInteterestForHomeLoan() + "%");
		s1.Loan();
		RBIBank b1 = new SBI101();
		System.out.println(
				"RBI reference bt object of SBI,Rate of Interest is: " + b1.getRateOfInteterestForHomeLoan() + "%");
		RBIBank b2 = new PNB();
		System.out.println(
				"RBI reference bt object of SBI,Rate of Interest is: " + b2.getRateOfInteterestForHomeLoan() + "%");

	}

}
