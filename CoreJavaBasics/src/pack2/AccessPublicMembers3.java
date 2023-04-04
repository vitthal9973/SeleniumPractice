package pack2;


public class AccessPublicMembers3 {

	public static void main(String[] args) {
		pack1.PublicMembers p1=new pack1.PublicMembers();
		System.out.println("Accessing dfault members from another class outside package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
