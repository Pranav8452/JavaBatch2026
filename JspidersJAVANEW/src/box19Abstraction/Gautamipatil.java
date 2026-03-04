package box19Abstraction;

abstract class Gajni { // Abstract class
	abstract void fight(); // Abstract Method
}

class toxic { // Concrete class
	// abstract void kill();//CTE
	// Abstract method are not allowed in concrete class
	void sing() {// Concrete method
		System.out.println("Singing.....");
	}
}

public class Gautamipatil {
	public static void main(String[] args) {

		toxic t1 = new toxic();
		t1.sing();
		// Gajni g1 = new Gajni(); //CTE
		// We cannot create object of abstract class
	}
}
