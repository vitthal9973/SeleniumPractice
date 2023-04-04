package pack1;

public class AccessingPublicMembers {

	public static void main(String[] args) {
		PublicMembers p1=new PublicMembers();
		System.out.println("Accessing public members from another class within same package");
		System.out.println(p1.accNum);
		p1.displayAccNum();

	}

}
