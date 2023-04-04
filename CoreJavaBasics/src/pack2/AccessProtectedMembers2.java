package pack2;

import pack1.ProtectedMembers;

public class AccessProtectedMembers2 {

	public static void main(String[] args) {
		AccessProtectedMembers2 p1 = new AccessProtectedMembers2();
		System.out.println("Accessing Protected Members from another class outside of package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}

class TestProtectedMembers extends AccessProtectedMembers2 {
	public static void main(String[] args) {
		AccessProtectedMembers2 p1 = new AccessProtectedMembers2();
	//	System.out.println(p1.accnum);
	//	p1.displayAccNum();
		TestProtectedMembers t1=new TestProtectedMembers();
		System.out.println(t1.accNum);
		t1.displayAccNum();

	}
}
