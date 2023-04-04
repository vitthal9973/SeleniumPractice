package inheritanceExamples;

class testing1 {
	void callingFromVoda() {
		System.out.println("Vodafone network busy");
	}
}

class testing2 {
	void callingFromIdea() {
		System.out.println("Get Idea Sirji");
	}
}

class testing3 {
	void callingFromArtel() {
		System.out.println("Try Everything");
	}

}

public class Example1 {
	void callingMe() {
		System.out.println("i am calling");
	}

	public static void main(String[] args) {
		Example1 e1 = new Example1();
		e1.callingMe();
		testing1 t1 = new testing1();
		t1.callingFromVoda();
		testing2 t2 = new testing2();
		t2.callingFromIdea();
		testing3 t3 = new testing3();
		t3.callingFromArtel();

	}

}
