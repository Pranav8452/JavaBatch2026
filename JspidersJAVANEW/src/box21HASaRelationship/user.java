package box21HASaRelationship;

class battery {
	int x = 255;

//Overloaded
	void capacity() {
		System.out.println("7000mah battery");
	}

	void capacity(int a) {
		System.out.println("Colling System...");
	}
}

class mobile {
	static battery b1 = new battery();
	int a = 96;

	void games() {
		System.out.println("Shadow Fight,Mini Millatia");
	}
}

public class user {
	public static void main(String[] args) {
		mobile m1 = new mobile();
		System.out.println(m1.b1.x);// call variable
		m1.b1.capacity();// Call method
		mobile.b1.capacity(51);// Call method Overloaded
		System.out.println("----------------------");
		System.out.println(m1.a);
		m1.games();
	}
}
