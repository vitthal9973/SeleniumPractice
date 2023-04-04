package arrays;

public class DuplicateElements {

	public static void main(String[] args) {
		int a[] = { 12, 4, 23, 56, 66, 4, 12, 56, 10,23 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);
				}
			}

		}
	}

}
