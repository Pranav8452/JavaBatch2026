package box16TypeCasting;

//ClassCastException example 2 self
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

		baba b1 = new porgi();// Upcasting-1
		b1.property();

		System.out.println("--------------");

		porgi p1 = (porgi) b1;// Downcasting-1
		p1.makeup();
		b1.property();
		System.out.println("---------------");
		// ClassCastException

		baba b2 = new mulga(); // Upcasting-2
		System.out.println("****************");
		b2.property();

		mulga m1 = (mulga) b2;// Downcasting-2
		m1.property();
		m1.bike();
		System.out.println("Main End");
	}
}
