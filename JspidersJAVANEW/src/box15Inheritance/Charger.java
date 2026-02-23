package box15Inheritance;

//Method-Overloading and Non-Static Example
class tea { // Method-Overloading and Non-Static Method

	void chai() { // Non-Static Method
		System.out.println("Normal chai");
	}

	void chai(int a) { // Non-Static Method
		System.out.println("Masala chai");
	}

	void chai(String a, int b) { // Non-Static Method
		System.out.println("Chocolate chai");
	}

	void chai(double i, int j) { // Non-Static Method
		System.out.println("Tapari malai chai");
	}

	void chai(int i, double j) { // Non-Static Method
		System.out.println("Sutta chai");
	}
}

public class Charger {
	public static void main(String[] args) {

		tea t1 = new tea();
		t1.chai(); // Normal chai
		t1.chai(22); // Masala chai
		t1.chai("pranav", 22);// Chocolate chai
		t1.chai(55.5, 22); // Tapari malai chai
		t1.chai(22, 5.5);// Sutta chai

	}
}
