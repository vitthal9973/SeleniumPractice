package arrays;

public class Array1 {

	public static void main(String[] args) {
		/*
		 * int a[]; a=new int[5];
		 */
		// or
		int a[] = new int[5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		System.out.println("*************After Initialization***********");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		// or
		System.out.println("Array Elements counts:" + a.length);
		System.out.println("*************Normal ForLoop***********");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("*************For-each Loop***********");
		for (int num : a) {
			System.out.println(num);
		}
		char[] getArray1 = new char[4];
		getArray1[0] = 'A';
		getArray1[1] = 'B';
		getArray1[2] = 'C';
		getArray1[3] = 'D';

		// or
		// char[] getArray1={'A','B','C','D'};
		for (char num : getArray1) {
			System.out.println(num);
		}

	}

}
