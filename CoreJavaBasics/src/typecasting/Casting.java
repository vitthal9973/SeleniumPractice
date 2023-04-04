package typecasting;
class Parent100{
	void myHome() {
		System.out.println("Parent Home");
	}
}
class Child100 extends Parent100{
	void myCar() {
		System.out.println("Child Car");
	}
}
public class Casting {

	public static void main(String[] args) {
		Child100 c2=new Child100();
		c2.myCar();
		c2.myHome();
		Parent100 c1=new Parent100();
		System.out.println("***********Using Upcasting************");
		Child100 c3=new Child100();
		c3.myCar();
		c3.myHome();
		Parent100 c4=c3;
		c4.myHome();
		Parent100 p2=new Child100();
		Parent100 p3=(Parent100)new Child100();
		Parent100 p4=(Parent100)c3;

	}

}
