package PracticePrograms;

public class ArmstrongNumUsinWhile {

	public static void main(String[] args) {
		int sum = 0, rem, n = 371, temp=n;
		while (n != 0) {
			rem = n % 10;
			sum = sum + (rem*rem*rem);
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println("Given No is Armstrong ");
		} else {
			System.out.println("Given No is Not Armstrong ");
		}
	}

}
