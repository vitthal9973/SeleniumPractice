package PracticePrograms;

class TotalRecall01 {
	static int n, sum, rem;
	int num, s, r;
	static {
		n = 1976;
		System.out.println("static block Runnig Global Varibal n is initializd: " + n);// static block
	}
	{
		num = 4321;
		System.out.println("NoN-static block Runnig Global Varibal n is initializd: " + num); // non static block
	}

	TotalRecall01() {
		for (; n > 0; n = n / 10) {
			rem = n % 10;
			sum = (sum * 10) + rem;
			// System.out.println("Number in Reverse is: "+sum);
		}
		System.out.println("*************static global variabal***********");
		System.out.println("Number in Reverse Cons of class TotalRecall01: " + sum);
	}

	TotalRecall01(int num) {
		this();
		this.num = num;
		for (; num > 0; num = num / 10) {
			r = num % 10;
			s = (s * 10) + r;
			// System.out.println("Number in Reverse is: "+sum);
		}
		System.out.println("*************Non-static global variable***********");
		System.out.println("Number in Reverse Cons of class TotalRecall01: " + s);
	}
}

public class Totalrecall {
	Totalrecall(int n) {
		int sum = 0, rem;
		for (; n > 0; n = n / 10) {
			rem = n % 10;
			sum = (sum * 10) + rem;
			// System.out.println("Number in Reverse is: "+sum);
		}
		System.out.println("*************Constructor***********");
		System.out.println("Number in Reverse with Parameterized Cons : " + sum);
	}

	Totalrecall() {
		int sum = 0, rem;
		for (int n = 467; n > 0; n = n / 10) {
			rem = n % 10;
			sum = (sum * 10) + rem;
			// System.out.println("Number in Reverse is: "+sum);
		}
		// System.out.println("*************Constructor***********");
		System.out.println("Number in Reverse without Parameterized Cons : " + sum);
	}

	public static int getReverseNum(int n) {
		int sum = 0, rem;
		for (; n > 0; n = n / 10) {
			rem = n % 10;
			sum = (sum * 10) + rem;
			// System.out.println("Number in Reverse is: "+sum);
		}
		// System.out.println("Number in Reverse with Parameterized method : " + sum);
		return sum;
	}

	public static int getReverseNum() {
		int sum = 0, rem;
		for (int n = 679; n > 0; n = n / 10) {
			rem = n % 10;
			sum = (sum * 10) + rem;
			// System.out.println("Number in Reverse is: "+sum);
		}
		// System.out.println("Number in Reverse without Parameterized method : " +sum);
		return sum;
	}

	public int getReverseNum1(int n) {
		int sum = 0, rem;
		for (; n > 0; n = n / 10) {
			rem = n % 10;
			sum = (sum * 10) + rem;
			// System.out.println("Number in Reverse is: "+sum);
		}
		// System.out.println("Number in Reverse with Parameterized method : " + sum);
		return sum;
	}

	public int getReverseNum1() {
		int sum = 0, rem;
		for (int n = 432; n > 0; n = n / 10) {
			rem = n % 10;
			sum = (sum * 10) + rem;
			// System.out.println("Number in Reverse is: "+sum);
		}
		// System.out.println("Number in Reverse without Parameterized method : " +sum);
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("*************Static Method****************");
		// getReverseNum();
		// getReverseNum(679);
		System.out.println("Number in Reverse with Parameterized method : " + Totalrecall.getReverseNum(687));
		System.out.println("Number in Reverse without Parameterized method : " + Totalrecall.getReverseNum());
		Totalrecall t1 = new Totalrecall(621);
		Totalrecall t2 = new Totalrecall();
		System.out.println("*************Non-Static Method****************");
		// t1.getReverseNum1(675);
		// t1.getReverseNum1();
		System.out.println("Number in Reverse with Parameterized method : " + t1.getReverseNum1(687));
		System.out.println("Number in Reverse without Parameterized method : " + t1.getReverseNum1());
		TotalRecall01 t3 = new TotalRecall01();
		TotalRecall01 t4 = new TotalRecall01(1896);

	}

}
