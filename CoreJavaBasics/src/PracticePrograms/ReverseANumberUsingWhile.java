package PracticePrograms;

public class ReverseANumberUsingWhile {

	public static void main(String[] args) {
		int sum = 0, rem, n = 123;
		while (n != 0) {
			rem = n % 10;
			sum = (sum * 10) + rem;
			n = n / 10;
			// System.out.println("Reverse of Given No is "+sum);
		}
		System.out.println("Reverse of Given No is " + sum);
	}

}
