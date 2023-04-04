package Day7Tthis;
class A1{
	A1(){
		this(10);
		System.out.println("hello zero");
	}
	A1(double d){
		System.out.println("hello double " +d);
	}
	A1(int x){
		this(2.36);
		System.out.println("hello int "+x);
	}
}
public class ThisStatement1 {

	public static void main(String[] args) {
		A1 a1=new A1();
		A1 a2=new A1(10);
		A1 a3=new A1(10.23);
		
	}
}
