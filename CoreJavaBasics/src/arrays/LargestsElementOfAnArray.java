package arrays;

public class LargestsElementOfAnArray {

	public static void main(String[] args) {
		int a[] = { 12, 4, 23, 56, 66, 9 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}

		}
		System.out.println("Largest Elememt of An Array: " + max);

	}

}
