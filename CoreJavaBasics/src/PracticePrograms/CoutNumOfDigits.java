package PracticePrograms;

public class CoutNumOfDigits {

	public static void main(String[] args) {
		int count=0;
		for(int n=125;n!=0;count++)
		{
			n=n/10;
		}
		System.out.println("Digits in Given No is: " +count);
	}

}
