package PracticePrograms;

public class LargestNum {

	public static void main(String[] args) {
		int num1=50,num2=60,num3=30;
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("Num1 is largest number...!" +num1);
			}
			else
			{
				System.out.println("Num3 is largest number...!  " +num3);

			}
		}
		else
		{
			if(num2>num3)
			{
				System.out.println("Num2 is largest number...!  " +num2);

			}
			else
			{
				System.out.println("Num3 is largest number...!  " +num3);

			}
		}
	}

}
