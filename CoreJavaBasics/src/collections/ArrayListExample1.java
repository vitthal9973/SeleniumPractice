package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("123");
		System.out.println("size of list: " + list.size());
		System.out.println("Elements of list: " + list);
		System.out.println(list.get(0));
		System.out.println("Traversing element through for loop: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Traversing list through for each loop: ");
		for (Object fruit : list) {
			System.out.println(fruit);
		}
		list.set(1, "Dates");
		System.out.println("size of list: " + list.size());
		System.out.println("Elements of list: " + list);
		Collections.sort(list);
		System.out.println("size of list: " + list.size());
		System.out.println("Elements of list: " + list);
		System.out.println("Traversing list through for each Method: ");
		list.forEach(a -> {
			System.out.println(a);
		});
		System.out.println("Traversing list through Iterator Interface: ");
		Iterator itr = list.iterator();
		System.out.println(itr.hasNext());
	//	System.out.println(itr.next());
	//	System.out.println(itr.next());
	//	System.out.println(itr.next());
	//	System.out.println(itr.next());
	//	System.out.println(itr.next());
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(itr.hasNext());
		System.out.println("**********with used iterator Object****************");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("**********with new iterator Object****************");
		Iterator itr2 = list.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
