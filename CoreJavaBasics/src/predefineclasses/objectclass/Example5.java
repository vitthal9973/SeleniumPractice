package predefineclasses.objectclass;

class Print12 {
	int a = 10;

	public int hashCode() {
		return 101;
	}

	public String toString() {
		return "I AM Print12 Class toString";
	}
}

public class Example5 {
	static int last_roll = 100;
	int roll_no;

	Example5() {
		roll_no = last_roll;
		last_roll++;
	}

	public static void main(String[] args) {
		Example5 s1 = new Example5();
		System.out.println("s: toString of ObjectClass4: " + s1);
		System.out.println("s: hashCode of ObjectClass4: " + s1.hashCode());
		Example5 s2 = new Example5();
		System.out.println("s2: toString of ObjectClass4: " + s2);
		System.out.println("s2: hashCode of ObjectClass4: " + s2.hashCode());
		System.out.println("s1 & s2 Compare: " + s1.equals(s2));
		Example5 s3 = s2;
		System.out.println("s2 & s3 Compare: " + s3.equals(s2));
		Print12 p1 = new Print12();
		System.out.println("toString of Print12: " + p1);
		System.out.println("hashCode of Print12: " + p1.hashCode());
		Print12 p2 = new Print12();
		System.out.println("toString of Print12: " + p2);
		System.out.println("hashCode of Print12: " + p2.hashCode());
		System.out.println("Comparing Print12 class object p1 & p2 with overriden equals(): " + p1.equals(p2));

	}

}
