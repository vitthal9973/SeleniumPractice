package arrays;

public class SmalletElementOfAnArray {

	public static void main(String[] args) {
		int a[] = { 12, 4, 23, 56, 66, 9 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}

		}
		System.out.println("Smallet Elememt of An Array: " + min);
	}

}
