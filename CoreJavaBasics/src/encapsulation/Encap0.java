package encapsulation;

class Demo {
	private int empID = 1000;
	private double salary = 45000;

	public int getEmpID() {
		return empID;
	}

	public double getSalary() {
		return salary;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

public class Encap0 {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		// System.out.println(d1.empID);
		// System.out.println(d1.salary);
		System.out.println(
				"Accessing private data member outsite the class using getter concept - empID: " + d1.getEmpID());
		System.out.println(
				"Accessing private data member outsite the class using getter concept - empID: " + d1.getSalary());
		System.out.println("*****************updating private members****************");
		d1.setEmpID(1001);
		d1.setSalary(550000);
		System.out.println("Updated Accessing private data member outsite the class using getter concept - empID: "
				+ d1.getEmpID());
		System.out.println("Updated Accessing private data member outsite the class using getter concept - empID: "
				+ d1.getSalary());
		System.out.println("*************************************************************");
		Demo d2 = new Demo();
		System.out.println("Updated Accessing private data member outsite the class using getter concept - empID: "
				+ d2.getEmpID());
		System.out.println("Updated Accessing private data member outsite the class using getter concept - empID: "
				+ d2.getSalary());

	}

}
