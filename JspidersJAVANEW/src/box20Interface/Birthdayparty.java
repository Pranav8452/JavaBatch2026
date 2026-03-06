package box20Interface;

interface jay {// interface
	public abstract void love();

	void party();
}

interface Bhushan {// interface
	public abstract void love();

	void party();
}

interface Amit {// interface
	public abstract void love();

	void party();
}

class pushparaj {// class
	void banglow() {
		System.out.println("Bada Banglow");
	}

	void gold() {
		System.out.println("100kg Gold");
	}
}

class siddhi extends pushparaj implements jay, Bhushan, Amit {
	@Override
	public void love() {
		System.out.println("Siddhi Controlling hearts1.........");
	}

	@Override
	public void party() {
		System.out.println("Siddhi Controlling hearts2.........");
	}
}

public class Birthdayparty {
	public static void main(String[] args) {
		jay j1 = new siddhi();// upcasting
		j1.love();
		j1.party();
		System.out.println("-------------------");
		pushparaj p1 = new siddhi();// upcasting
		p1.banglow();
		p1.gold();
		System.out.println("--------------------");
		Bhushan b1 = new siddhi();
		b1.party();
		b1.love();
		System.out.println("----------------");
		siddhi s1 = new siddhi();
		s1.love();
		s1.banglow();
		s1.love();
		s1.party();
	}
}
