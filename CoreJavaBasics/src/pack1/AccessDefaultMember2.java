package pack1;

public class AccessDefaultMember2 {

	public static void main(String[] args) {
		DefaultMembers p1=new DefaultMembers();
		System.out.println("Accessing default member from another package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
