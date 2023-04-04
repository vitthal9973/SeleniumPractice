package Day4Loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		int c=10;
		System.out.println("Printting all the Numbers from 10 till 1 ");
		do {
			System.out.println(c);
			--c;
		}while(c>0);

	}

}
class DoWhileLoop2 {

	public static void main(String[] args) {
		int day=0;
		do {
			System.out.println("Day: "+day);
			day++;
		}while(day<=15);

	}

}