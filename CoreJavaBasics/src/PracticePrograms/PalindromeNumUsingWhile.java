package PracticePrograms;

public class PalindromeNumUsingWhile {

	public static void main(String[] args) {
		int sum = 0, rem, n = 151, temp=n;
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
}
