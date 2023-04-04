package predefineclasses.objectclass;

public class Example2 extends Demo {
	static int last_roll = 100;
	int roll_no;

	Example2() {
		roll_no = last_roll;
		last_roll++;
	}

	public static void main(String[] args) {
		Example2 s = new Example2();
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.hashCode());
		Demo d2 = new Example1();
		System.out.println(d2);
		System.out.println(d2.toString());
		System.out.println(d2.hashCode());

	}

}
