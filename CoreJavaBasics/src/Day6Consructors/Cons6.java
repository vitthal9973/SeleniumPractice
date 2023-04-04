package Day6Consructors;

class C {
	double i = 10.23;

	C(double j) {
		System.out.println("Running clas C constructor!!");
		i = j;
	}
}

public class Cons6 {

	public static void main(String[] args) {
		System.out.println("main() of class Cons6 is Started!!");
		C b1 = new C(15.34);
		System.out.println("class C global variable i= " + b1.i);
		C b2 = new C(45.32);
		System.out.println("class C global variable i= " + b2.i);
		System.out.println("main() of class Cons6 is ends here!!");

	}

}
