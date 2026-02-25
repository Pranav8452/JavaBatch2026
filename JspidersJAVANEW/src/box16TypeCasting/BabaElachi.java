package box16TypeCasting;

//ClassCastException
class baba {

}

class mulga extends baba {

}

class porgi extends baba {

}

public class BabaElachi {
	public static void main(String[] args) {
		System.out.println("Main Start");

		baba b1 = new mulga();// Upcasting
		mulga m1 = (mulga) b1;// Downcasting
		porgi p1 = (porgi) b1;// Downcasting
		// ClassCastException

		System.out.println("Main End");
	}
}
