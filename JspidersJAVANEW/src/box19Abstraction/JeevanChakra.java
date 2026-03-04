package box19Abstraction;

abstract class swarg {// abstract class

	abstract void rambha();// abstract method

	abstract void urvashi();

	abstract void menka();

	void narad() { // concrete method
		System.out.println("naryanaaaaaa....... naryanaa.....");
	}
}

abstract class indra extends swarg { // concrete class
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
	void menka() {
		System.out.println("menka ka Dance...........");
	}
}

public class JeevanChakra {
	public static void main(String[] args) {
		swarg s1 = new sunil();
		s1.rambha();
		s1.rambha();
		s1.urvashi();
	}

}