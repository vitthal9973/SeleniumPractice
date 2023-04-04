package arrays;

public class CopyElementToAnotherArray {

	public static void main(String[] args) {
		int a[] = { 12, 4, 23, 56, 66, 4, 12, 56, 10, 23 };
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		System.out.println("Origenal Array Element:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("\n");
		System.out.println("Copied Array Element:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
