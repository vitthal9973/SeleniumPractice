package Day4Loops;

public class ForLoop4 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.println("* ");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.println(j+" ");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.println(i+" ");
			}
			System.out.println();
		}

	}

}
