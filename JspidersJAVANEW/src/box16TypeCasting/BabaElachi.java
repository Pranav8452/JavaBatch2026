package box16TypeCasting;

//ClassCastException
class baba {
	void property() {
		System.out.println("10 acer land");
	}
}

class mulga extends baba {

	void bike() {
		System.out.println("NInja Kaawasaki");
	}
}

class porgi extends baba {
	void makeup() {
		System.out.println("Makeup kit");
	}
}

public class BabaElachi {
	public static void main(String[] args) {
		System.out.println("Main Start");

		baba b1 = new porgi();// Upcasting
		b1.property();

		System.out.println("--------------");

		porgi p1 = (porgi) b1;// Downcasting
		p1.makeup();
		b1.property();
		System.out.println("---------------");
		// ClassCastException

		System.out.println("Main End");
	}
}
