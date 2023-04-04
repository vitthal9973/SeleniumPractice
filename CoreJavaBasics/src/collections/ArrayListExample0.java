package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample0 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Mango");
		list.add(1235);
		list.add("Banana");
		list.add(null);
		list.add('C');
		list.add(15.26);
		list.add(true);
		list.add(new ArrayListExample0());
		list.add("Banana");
		System.out.println("Size of list: " + list.size());
		System.out.println("Element of list: " + list);
		System.out.println("Traversing list through for loop: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Traversing list through for each loop: ");
		for (Object fruit : list) {
			System.out.println(fruit);
		}
		System.out.println("Returning element: " + list.get(1));
		list.set(1, "Dates");
		System.out.println("size of list: " + list.size());
		System.out.println("Elements of list: " + list);

	}
}
