package Day2Operatrs;

public class Unaryop2 {

	public static void main(String[] args) {
		int a=55,b;
		b=a++;//55
		int x=a,y;//56
		System.out.println("********************");
		System.out.println("x = " +x);//56
		y=++x;
		System.out.println("a = " +a);//56
		System.out.println("b = " +b);//55
		System.out.println("x = " +x);//57
		System.out.println("y = " +y);//57
		System.out.println("********************");
		int p=-10,q=20,res;
		res=p++ + --q;// 9
		System.out.println("res = " +res);//9
		System.out.println("p = " +p);//-9
		System.out.println("q = " +q);//19
		System.out.println("********************");
		int res1=++p + ++q;//-8
		System.out.println("res1 = " +res1);//12
		System.out.println("p = " +p);//-8
		System.out.println("q = " +q);//20
		
	}

}
