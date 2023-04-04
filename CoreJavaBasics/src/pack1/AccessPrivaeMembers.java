package pack1;

public class AccessPrivaeMembers {

	public static void main(String[] args) {
		PrivateMembers p1=new PrivateMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
