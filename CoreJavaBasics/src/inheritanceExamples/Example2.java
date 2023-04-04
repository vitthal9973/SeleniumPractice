package inheritanceExamples;
class testing10 {
	void callingFromVoda() {
		System.out.println("Vodafone network busy");
	}
}

class testing20 extends testing10 {
	void callingFromIdea() {
		System.out.println("Get Idea Sirji");
	}
}

class testing30 extends testing20 {
	void callingFromArtel() {
		System.out.println("Try Everything");
	}

}

public class Example2 extends testing30 {
	void callingMe() {
		System.out.println("i am calling");
	}
	public static void main(String[] args) {
		Example2 e1=new Example2();
		e1.callingMe();
		e1.callingFromArtel();
		e1.callingFromIdea();
		e1.callingFromVoda();
	}

}
