package inheritanceExamples;

class Company {
	static int empid = 8546;
	double salary;
	int age;

	void display() {
		int age = 25;
		double salary = 45000.64;
		System.out.println("***********Parent class display method************");
		System.out.println("***********Non Static Global Member************");
		System.out.println("Emp Age: " + this.age);
		System.out.println("Emp Salary: " + this.salary);
		System.out.println("***********Local Member************");
		System.out.println("Emp Age: " + age);
		System.out.println("Emp Salary: " + salary);

	}

	void display(double salary, int age) {
		System.out.println("***********Parent class Parameterized display method************");
		this.salary = salary;
		this.age = age;
		System.out.println("***********Non Static Global Member************");
		System.out.println("Emp Age: " + this.age);
		System.out.println("Emp Salary: " + this.salary);
		System.out.println("***********Local Member************");
		System.out.println("Emp Age: " + age);
		System.out.println("Emp Salary: " + salary);

	}

	Company() {
		this(empid);
		System.out.println("***********Parent Company class Constuctor***********");
		empid = 2355;
		System.out.println("Emp Id :" + Company.empid);
	}

	Company(int empid) {
		// this();
		System.out.println("***********Parent Parameterized Company class Constuctor***********");
		System.out.println("Empid: " + empid);
	}
}

class Employee extends Company {
	void empdisplay() {
		int age = 25;
		double salary = 56000.67;
		System.out.println("***********Child class display method************");
		System.out.println("***********Non Static Global Member************");
		System.out.println("Emp Age: " + super.age);
		System.out.println("Emp Salary: " + super.salary);
		System.out.println("***********Local Member************");
		System.out.println("Emp Age: " + age);
		System.out.println("Emp Salary: " + salary);

	}

	void empdisplay(double salary, int age) {
		super.salary = salary;
		super.age = age;
		System.out.println("***********Child class Parameterized display method************");
		System.out.println("***********Non Static Global Member************");
		System.out.println("Emp Age: " + super.age);
		System.out.println("Emp Salary: " + super.salary);
		System.out.println("***********Local Member************");
		System.out.println("Emp Age: " + age);
		System.out.println("Emp Salary: " + salary);

	}

	Employee() {
		super();
		empid = 4500;
		System.out.println("***********Child class Constuctor***********");
		System.out.println("Emp Id :" + empid);

	}

	Employee(int empid) {
		System.out.println("***********Child class Parameteriezd Constuctor***********");
		System.out.println("Emp Id :" + empid);

	}
}

public class Iinheritance10 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(8656);
		e1.display();
		e1.display(85000.32, 40);
		e1.empdisplay();
		e1.empdisplay(65000.12, 70);

	}

}
