package collections;

import java.util.ArrayList;

public class ArrayListExample3 {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(12);
		ArrayList<Boolean> l2 = new ArrayList<Boolean>();
		l2.add(true);
		ArrayList<Character> l3 = new ArrayList<Character>();
		l3.add('a');
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Anuj");
		al.add("Gaurav");
		System.out.println("An Initial list of elements: " + al);
		System.out.println("Remove Vijay From Collection: " + al.remove("Vijay"));
		System.out.println("After invoking remove(Object) method: " + al);
		System.out.println("Remove index 0 From Collection: " + al.remove(0));
		System.out.println("After invoking remove(index) method: " + al);
		System.out.println("*********************************************");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");
		al.addAll(al2);
		System.out.println("Updated List: " + al);
		al.removeAll(al2);
		System.out.println("After invoking removeAll() method: " + al);
		if (al.contains("Ajay"))
			;
		{
			al.remove("Ajay");
		}
		// or
		al.removeIf(str -> str.contains("Ajay"));
		System.out.println("After Invoking removeIf() method: " + al);
		al.clear();
		System.out.println("After invoking clear() method: " + al);

	}

}
