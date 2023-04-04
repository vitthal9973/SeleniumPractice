package Day7Tthis;

public class ThisKeyword2 {
	int x;

	public ThisKeyword2(int x) {
		this.x = x;
	}

	public static void main(String[] args) {
		ThisKeyword2 myobj = new ThisKeyword2(5);
		System.out.println("Value of x = " + myobj.x);
	}

}
