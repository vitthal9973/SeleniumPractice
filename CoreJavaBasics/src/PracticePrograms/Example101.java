package PracticePrograms;

public class Example101 {

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 6; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		int row = 6;
		for (int i = row; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= row; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
