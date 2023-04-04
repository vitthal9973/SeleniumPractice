package Day2Operatrs;

public class Logicalop {

	public static void main(String[] args) {
	boolean bool1=false, bool2=true;
	System.out.println("bool1 && bool2 = " +(bool1 && bool2));//false
	System.out.println("bool1 || bool2 = " +(bool1 || bool2));//true
	System.out.println("!(bool1 && bool2) = " +!(bool1 && bool2));//true

	}

}
class Logicalop2 {

	public static void main(String[] args) {
	int num1=30, num2=30;
	boolean bool1=(num1==num2); 
    boolean bool2=(num1>num2);
	System.out.println("bool1 && bool2 = " +(bool1 && bool2));//false
	System.out.println("bool1 || bool2 = " +(bool1 || bool2));//true
	System.out.println("!(bool1 && bool2) = " +!(bool1 && bool2));//true

	}

}
class Logicalop3 {

	public static void main(String[] args) {
	int num1=-5, num2=0;
	System.out.println("bool1 && bool2 = " +((num1==num2) && (num1>num2)));//false
	System.out.println("bool1 || bool2 = " +((num1==num2) || (num1>num2)));//false
	System.out.println("!(bool1 && bool2) = " +!((num1==num2) && (num1>num2)));//true

	}

}
