package Day7Tthis;

class Student002 {
	int rollno;
	float fee;

	Student002(int rollno, float fee) {
		System.out.println("Local Variable: " + rollno);
		System.out.println("Local Variable: " + fee);
		System.out.println("Global Variable: " + this.rollno);
		System.out.println("Global Variable: " + this.fee);
		this.rollno = rollno;
		this.fee = fee;
		System.out.println("Local Variable: " + rollno);
		System.out.println("Local Variable: " + fee);
		System.out.println("Global Variable: " + this.rollno);
		System.out.println("Global Variable: " + this.fee);
	}

	void display() {
		System.out.println(rollno + " " + fee);
	}
}

public class ThisKeyword01 {

	public static void main(String[] args) {
		Student002 s1 = new Student002(111, 5000f);
		s1.display();
		System.out.println("*************************");
		Student002 s2 = new Student002(112, 6000f);
		s2.display();

	}

}
