package inheritanceExamples;

class A1{
	static int a=10;
	int b=20;
	double c=13.45;
}
class B1 extends A1{
	static int x=30;
	int y=40;
	double z=53.45;
}
class C1 extends B1{
	static int p=50;
	int q=60;
	double r=66.45;
}

public class Inheritance1 {

	public static void main(String[] args) {
		System.out.println("Class A1 static variable: " + A1.a);
		System.out.println("Class B1 static variable: " + B1.x);
		System.out.println("Class C1 static variable: " + C1.p);
		System.out.println("************************************");
		C1 c1=new C1();
		System.out.println("With Class C Reffer: " + c1.b);
		System.out.println("With Class C Reffer: " + c1.c);
		System.out.println("With Class C Reffer: " + c1.q);
		System.out.println("With Class C Reffer: " + c1.r);
		System.out.println("With Class C Reffer: " + c1.y);
		System.out.println("With Class C Reffer: " + c1.z);
		B1 b1=new B1();
		System.out.println("With Class B Reffer: " + b1.b);
		System.out.println("With Class B Reffer: " + b1.c);
		System.out.println("With Class B Reffer: " + b1.y);
		System.out.println("With Class B Reffer: " + b1.z);




	}

}
