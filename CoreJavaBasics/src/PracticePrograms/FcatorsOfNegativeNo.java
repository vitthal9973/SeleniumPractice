package PracticePrograms;

public class FcatorsOfNegativeNo {

	public static void main(String[] args) {
		int i, n = -100;
		System.out.println(" Factors of given Number is = ");
		for (i = -100; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i+ " ");
			}
		}
		System.out.println("\n");



	}

}
