package arrays;

public class SumOfAllElementsOfArray {

	public static void main(String[] args) {
		int a[] = { 12, 4, 2, 6, 10, 3 };
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum Of all Elements are Present in Array:"+sum);
	}

}
