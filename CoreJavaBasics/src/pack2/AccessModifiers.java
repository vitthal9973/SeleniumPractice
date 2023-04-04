package pack2;

import pack1.Modifiers;

public class AccessModifiers extends Modifiers {

	public static void main(String[] args) {
		AccessModifiers a1 = new AccessModifiers();
		// System.out.println("Private Variable: " + m1.num1);
		// System.out.println("Default Variable: " + m1.num2);
		System.out.println("Protected Variable: " + a1.num3);
		System.out.println("Public Variable: " + a1.num4);
		Modifiers m1 = new Modifiers();
		System.out.println("Private Variable: " + m1.num4);
		// System.out.println("Protected Variable: " +m1.num3);

	}

}
