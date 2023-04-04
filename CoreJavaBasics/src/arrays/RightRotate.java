package arrays;

public class RightRotate {

	public static void main(String[] args) {
		int age[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i] + " ");
		}
		System.out.println();
		int n = 1;
		for (int i = 0; i < n; i++) {
			int last = age[age.length - 1], j;
			for (j = age.length-1; j > 0; j--) {
				age[j] = age[j - 1];
			}
			age[0] = last;

		}
		System.out.println();
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i] + " ");
		}
		System.out.println();
	}

}
