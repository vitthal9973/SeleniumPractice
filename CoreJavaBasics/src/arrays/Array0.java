package arrays;

public class Array0 {

	public static void main(String[] args) {
		String[] cars;
		cars = new String[4];
		// or
		//String[] cars = new String[4];
		cars[0] = "Volvo";
		cars[1] = "BMW";
		cars[2] = "Ford";
		cars[3] = "Mazda";
		// or
		// String[] cars= {"Volvo","BMW","Ford","Mazda"};
		System.out.println(cars[0]);
		cars[0] = "opel";
		System.out.println(cars[0]);
		System.out.println(cars.length);
		System.out.println("********Normal For Loop********");
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);

		}
		System.out.println("********For-each Loop********");
		for (String i : cars) {
			System.out.println(i);

		}

	}

}
