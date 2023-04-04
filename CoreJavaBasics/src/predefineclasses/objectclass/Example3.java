package predefineclasses.objectclass;

class Demo123 {
	void display() {
		System.out.println("I am diaplay() of class Demo123");
	}
}

public class Example3 extends Demo123 {
	static int last_roll = 100;
	int roll_no;

	Example3() {
		roll_no = last_roll;
		last_roll++;
	}

	void display() {
		System.out.println("I am diaplay() of class objectClass2");
	}

	public int hashCode() {
		return roll_no;
	}

	public static void main(String[] args) {
		Example3 s = new Example3();
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println("hashcode() value from ObjectClass2: " + s.hashCode());
		s.display();
		Demo123 d2 = new Demo123();
		System.out.println(d2);
		System.out.println("hashcode() value from Demo123: " + d2.hashCode());

	}

}
