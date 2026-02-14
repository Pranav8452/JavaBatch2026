package box15Inheritance;

class father {
	void gold() {
		System.out.println("10kg Gold");
	}
}

class Abhijit extends father {
	void ganja() {
		System.out.println("Ganja Fukna");
	}
}

public class PapaMeriJaan {
	public static void main(String[] args) {

		Abhijit a1 = new Abhijit();
		a1.gold();
		a1.ganja();
	}
}
