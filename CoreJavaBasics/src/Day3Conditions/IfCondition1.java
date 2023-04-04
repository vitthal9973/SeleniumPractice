package Day3Conditions;

public class IfCondition1 {

	public static void main(String[] args) {
		int num1=45,num2=30;
		if(num1!=num2)
		{
			System.out.println("No.1 is grater than No.2");
		}
		else
		{
			System.out.println("No.1 is Smaller than No.2");
		}
		if(num1>num2)
		{
			System.out.println("No.1 is grater than No.2");
		}
		else
		{
			System.out.println("No.1 is Smaller than No.2");
		}
		if(num1<=num2)
		{
			System.out.println("No.1 is ether equal or grater than No.2");
		}
		else
		{
			System.out.println("No.1 is Smaller than No.2");
		}
		if(num1==num2 || num1>num2)
		{
			System.out.println("No.1 is ether equal or grater than No.2");
		}
		else
		{
			System.out.println("No.1 is Smaller than No.2");
		}
		if(num1>=num2 && num1>num2)
		{
			System.out.println("No.1 is ether equal or grater than No.2");
		}
		else
		{
			System.out.println("No.1 is Smaller than No.2");
		}
		System.out.println("***************if else ladder**************");
		if(num1==num2)
		{
			System.out.println("No.1 is is Equals to No.2");
		}
		else if(num1>num2)
		{
			System.out.println("No.1 is graeter than No.2");
		}
		else
		{
			System.out.println("No.1 is smaller than No.2");
		}
			int sub1=50,sub2=30;
			if(sub1>35 && sub2>35)
			{
				System.out.println("pass....");
			}
			else 
			{
				System.out.println("Fail....");
			}
	
	}
	
	

}
