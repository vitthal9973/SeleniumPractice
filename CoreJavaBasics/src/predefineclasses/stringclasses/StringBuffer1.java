package predefineclasses.stringclasses;

public class StringBuffer1 {

	public static void main(String[] args) {
		String str = new String("Abc");
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("orginal StringBuffer value: " + sb);
		sb.append("Java");
		System.out.println(sb);
		sb.insert(5, "Pune");
		System.out.println(sb);
		sb.replace(1, 3, "XXX");
		System.out.println(sb);
		sb.delete(1, 4);
		System.out.println(sb);
		StringBuffer s1 = new StringBuffer("Banglore is known for IT");
		s1.reverse();
		System.out.println(s1);
		System.out.println("**************************************");
		StringBuffer s2 = new StringBuffer();
		System.out.println(s2.capacity());
		s2.append("Java");
		System.out.println("First Word: " + s2);
		System.out.println(s2.capacity());
		s2.append("Java is my fovarite language");
		System.out.println("2nd Word: " + s2);
		System.out.println(s2.capacity());
		s2.append("I am from Atomation Area");
		System.out.println("3rd Word: " + s2);
		System.out.println(s2.capacity());

	}

}
