package Day1.Classprograms;

public class Variables {

	static int account;
	double salary;
	public static void main(String[] args) {
		System.out.println("*********Program Start Here!!**********");
		int age=20;
		System.out.println("Local Variable age is = " +age);
		System.out.println("Static Global Variable Account is = " +Variables.account);
		account= 4435;
		System.out.println("Static Global Variable Account is = " +Variables.account);
		Variables s1=new Variables();
		System.out.println("Non Static Global Variable salary is = " +s1.salary);
		s1.salary=25000.465;
		System.out.println("Non Static Global Variable salary is = " +s1.salary);
		System.out.println("*********Program Ends Here!!**********");


	}

}
