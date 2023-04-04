package Day4Loops;

public class WhileLoop {

	public static void main(String[] args) {
		int i=0;
		System.out.println("Prining Nos. from 1 to 5");
		while(i<5)
		{
			System.out.println("Hello " +i);
			i++;
		}
		int a=5;
		while(a>0)
		{
			System.out.println("bye "+a);
			a--;
		}
	}

}
class WhileLoop2 {

	public static void main(String[] args) {
		int i=4;
		System.out.println("Prining Nos. from 4 to 0");
		while(i>=0)
		{
			System.out.println("Hello " +i);
			i--;
		}
		char c1='a';
		while(c1<='z')
		{
			System.out.print(c1+" ");
			c1++;
		}
		System.out.println("\n********Reverse********");
		char c2='z';
		while(c2>='a')
		{
			System.out.print(c2+" ");
			c2--;
			
		}
		System.out.println();
		int num=1;
		while(num<=50)
		{
			if(num%2==0)
			{
				System.out.println("Even No is= "+num);
			}
			num++;
		}
	}

}
