package inheritanceExamples;

class fruit {
	fruit() {
		System.out.println("fruit class cons ");
	}

	public void taste() {
		System.out.println("fruit are Sweet ");
	}
}

class apple extends fruit {
	apple() {
		System.out.println("apple class cons ");
	}

	public void shape() {
		System.out.println("Apple is round ");

	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		apple fr = new apple();
		fr.taste();
		fr.shape();

	}

}
