package overridingexamples;
class Animal1{
	public void move() {
		System.out.println("Animal can move");
	}
}
class Dog extends Animal1{
	public void move() {
		System.out.println("Dogs can walk and run");
	}
	public void bark() {
		System.out.println("Dogs can bark");
	}
}
public class Overriding1 {

	public static void main(String[] args) {
		Animal1 a=new Animal1();
		a.move();
		Dog b=new Dog();
		b.move();
		b.bark();
		System.out.println("**************************");
		Animal1 a1=new Dog();
		a1.move();
		//a1.bark();
	}

}
