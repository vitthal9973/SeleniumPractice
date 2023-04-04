package PracticePrograms;

public class CountNumDigitUsingWhile {

	public static void main(String[] args) {
		int count = 0, n = 418;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		System.out.println("Number of Digits in Given No is: " + count);

	}

}
