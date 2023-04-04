package PracticePrograms;

public class PrimeOrNotUsingWhile {

	public static void main(String[] args) {
		int num = 5, i = 1, ct = 0;
		while (i <= num) {
			if (num % i == 0) {
				ct++;
				//break;
			}
			i++;
		}
		//i++;
		if (ct == 2) {
			System.out.println(" given no is prime");
		} else {
			System.out.println(" given no is not prime");

		}

	}

}
