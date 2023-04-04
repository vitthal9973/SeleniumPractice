package pack1;

public class PublicMembers {
	public int accNum=12345;
	public void displayAccNum() {
		System.out.println("Acount Number: "+accNum);
	}
	public static void main(String[] args) {
		PublicMembers p1=new PublicMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
class AccessPublicMembers{
	public static void main(String[] args) {
		PublicMembers p1=new PublicMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}