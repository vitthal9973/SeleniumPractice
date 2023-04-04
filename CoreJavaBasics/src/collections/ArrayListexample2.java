package collections;

import java.util.ArrayList;

public class ArrayListexample2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println("Initial list of elements: " + al);
		System.out.println("list of element status: " + al.isEmpty());
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		System.out.println("After invoking add(E e) method: " +( al));
		al.add(1, "Gaurav");
		System.out.println("After invoking add(int index, E element) method: " + al);
		ArrayList al2 = new ArrayList();
		al2.add("Sonoo");
		al2.add("Hanumat");
		System.out.println("List al2 elements: " + al2);
		System.out.println("al Elements before adding al2: " + al);
		al.addAll(al2);
		System.out.println("List al elements after adding list al2: " + al);
		ArrayList al3 = new ArrayList();
		al3.add("John");
		al3.add("Rahul");
		System.out.println("Elements of al2: +al2" + al2);
		System.out.println("Elements of al2: +al3" + al3);
		al2.addAll(al3);
		System.out.println("After Adding al3 into al2: +al2" + al2);

	}

}
