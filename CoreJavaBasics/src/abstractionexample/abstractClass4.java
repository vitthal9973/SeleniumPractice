package abstractionexample;

abstract class RBIBank102 {
	final abstract double getRateOfInteterestForHomeLoan();
}

class SBI102 extends RBIBank {
	double getRateOfInteterestForHomeLoan() {
		return 6.5;
	}

}

public class abstractClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
