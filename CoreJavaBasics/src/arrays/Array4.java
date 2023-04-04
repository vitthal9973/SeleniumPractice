package arrays;

class Testarray2 {
	static void min(int arr[]) {// int arr[]=a={33,13,4,50,15,1};
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {// 30>13 | 13>4 |4>50 | 4>15 | 4>1
				min = arr[i];
			}
		}
		System.out.println("Min Number in array is : " + min);

	}

	static void max(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr.length) {
				max = arr[i];

			}

		}
		System.out.println("Max Number in array is : " + max);

	}
}

public class Array4 {

	public static void main(String[] args) {
		int a[] = { 33, 13, 4, 50, 15, 1 };
		Testarray2.min(a);
		Testarray2.max(a);

	}

}
