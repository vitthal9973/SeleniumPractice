package Day2Operatrs;

public class Unaryop3 {

	public static void main(String[] args) {
		int a=0,b;
		b = a++ + ++a + ++a +a;//0+2+3+3=8
		System.out.println("a = " +a);// 3
		System.out.println("b = " +b);// 8
		System.out.println("********************");
		a = -5;
		b = a-- + --a + --a + a;// (-5)+(-7)+(-8)+(-8)
		System.out.println("a = " +a);// -8
		System.out.println("b = " +b);// -28
		System.out.println("********************");
		a=21;
		b = --a + --a + --a + a + ++a + a++;// 20+19+18+18+19+19=113
		System.out.println("a = " +a);// 20
		System.out.println("b = " +b);// 113
		System.out.println("********************");
		a = -2;
		b = a-- + a + ++a + a++ + ++a + a++ + a;// (-2)+(-3)+(-2)+(-2)+(0)+(0)+(1)=-8
		System.out.println("a = " +a);// 1
		System.out.println("b = " +b);//-8
		System.out.println("********************");
	}

}
