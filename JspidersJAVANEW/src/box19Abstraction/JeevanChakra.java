package box19Abstraction;

abstract class swarg {// abstract class

	abstract void rambha();// abstract method

	abstract void urvashi();

	abstract void menka();

	abstract void apsara();

	void narad() { // concrete method
		System.out.println("naryanaaaaaa....... naryanaa.....");
	}
}

abstract class indra extends swarg {
	@Override
	void rambha() {
		System.out.println("Rambha ka Dance...........");
	}

	@Override
	void urvashi() {
		System.out.println("urvashi ka Dance...........");
	}

}

class sunil extends indra {
	@Override
	void menka() {
		System.out.println("menka ka Dance...........");
	}

	@Override
	void apsara() {
		System.out.println("Apsara the dancer....");

	}

}

public class JeevanChakra {
	public static void main(String[] args) {
		swarg s1 = new sunil();
		s1.rambha();
		s1.urvashi();
		s1.menka();
		s1.apsara();
	}

}