package Day5Methods;

public class MethodOverloading7 {
	public double myMethod(int num1, int num2) {
		System.out.println("First myMethod of class Demo");
		return num1+num2;
	}
	public int myMethod(int var1, int var2) {
		System.out.println("Second myMethod of class Demo");
		return var1-var2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading7 obj1=new MethodOverloading7();
		obj1.myMethod(10, 10);
		obj1.myMethod(20, 12);


	}

}
