package arrays;

public class ArrayElementsOnEvenPosition {

	public static void main(String[] args) {
		int a[] = { 12, 4, 23, 56, 66, 9, 10 };
		for (int i = 1; i < a.length; i = i + 2) {
			System.out.println(a[i]);
		}
	}

}
