package typecasting;

public class PrimitiveCasting1 {

	public static void main(String[] args) {
		int myInt = 9;
		double myDouble = myInt;
		double d = (double) myInt;//explicit widening
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(d);
		double salary = 23400.67856856898989545d;
		int sal = (int) salary;
		long f = (long) salary;
		float f1 = (float) salary;
		System.out.println("Actual Salary: " + salary);
		System.out.println("Int salary: " + sal);
		System.out.println("long salary: " + f);
		System.out.println("float salary: " + f1);

	}

}
