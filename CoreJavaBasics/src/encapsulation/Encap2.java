package encapsulation;

class EncapsulationDemo {
	private int ssn;
	private int empAge;

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}

public class Encap2 {

	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo();
		System.out.println("Employee SSN: " + obj.getSsn());
		System.out.println("Employee SSN: " + obj.getEmpAge());
		System.out.println("*********************************");
		obj.setEmpAge(32);
		obj.setSsn(112233);
		System.out.println("Employee SSN: " + obj.getSsn());
		System.out.println("Employee SSN: " + obj.getEmpAge());

	}

}
