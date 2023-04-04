package overridingexamples;

class Calculation {
	public void getReverseNum() {
		int sum = 0, rem;
		for (int n = 458; n > 0;) {
			rem = n % 10;
			sum = (sum * 10) + rem;
			n = n / 10;
			// System.out.println("Reverse of Given No is "+sum);
		}
		System.out.println("Reverse of Given No is " + sum);

	}

	public void getReverseNum(int n) {
		this.getReverseNum();
		int sum = 0, rem;
		for (; n > 0;) {
			rem = n % 10;
			sum = (sum * 10) + rem;
			n = n / 10;
			// System.out.println("Reverse of Given No is "+sum);
		}
		System.out.println("Reverse of Given No is " + sum);

	}

	public void getPalimdromeNum() {
		int sum = 0, rem, n = 151, temp = n;
		while (n != 0) {
			rem = n % 10;
			sum = (sum * 10) + rem;
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println("Given No is Plindrome ");
		} else {
			System.out.println("Given No is Not Plindrome ");

		}
	}

	public void getPalimdromeNum(int n) {
		this.getPalimdromeNum();
		int sum = 0, rem, temp = n;
		while (n != 0) {
			rem = n % 10;
			sum = (sum * 10) + rem;
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println("Given No is Plindrome ");
		} else {
			System.out.println("Given No is Not Plindrome ");

		}
	}

	public void LeapYear() {
		int year = 2045;
		if (year % 4 == 0) {
			System.out.println("Given Year is Leap year...!  " + year);

		} else {
			System.out.println("Given Year is Not Leap Year...!  " + year);

		}

	}

	public void LeapYear(int year) {
		this.LeapYear();
		if (year % 4 == 0) {
			System.out.println("Given Year is Leap year...!  " + year);

		} else {
			System.out.println("Given Year is Not Leap Year...!  " + year);

		}

	}

}

class Calculation2 extends Calculation {
	public void getReverseNum() {
	//	super.getReverseNum(354);
		int sum = 0, rem;
		for (int n = 458; n > 0;) {
			rem = n % 10;
			sum = (sum * 10) + rem;
			n = n / 10;
			// System.out.println("Reverse of Given No is "+sum);
		}
		System.out.println("Reverse of Given No is " + sum);
	}

	public void getPalimdromeNum() {
		//super.getPalimdromeNum(474);
		int sum = 0, rem, n = 151, temp = n;
		while (n != 0) {
			rem = n % 10;
			sum = (sum * 10) + rem;
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println("Given No is Plindrome ");
		} else {
			System.out.println("Given No is Not Plindrome ");

		}
	}

	public void LeapYear() {
		super.LeapYear(2044);
		int year = 2045;
		if (year % 4 == 0) {
			System.out.println("Given Year is Leap year...!  " + year);

		} else {
			System.out.println("Given Year is Not Leap Year...!  " + year);

		}

	}
}

public class Overriding10 {

	public static void main(String[] args) {
		Calculation c1 = new Calculation2();
		c1.getReverseNum();
		c1.getPalimdromeNum();
		c1.LeapYear();

	}

}
