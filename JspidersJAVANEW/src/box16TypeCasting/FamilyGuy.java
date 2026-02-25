package box16TypeCasting;

//Type Casting Example 
class father {
	int f = 5000;

	void work() {
		System.out.println("Hard Working......");
	}
}

class bhushan extends father { // subclass
	int b = 700;

	void study() {
		System.out.println("Studying.....");
	}
}

public class FamilyGuy {
	public static void main(String[] args) {

		father f1 = new bhushan(); // Upcasting
		System.out.println(f1.f);
		f1.work();
		// System.out.println(f1.b);// CTE
		// f1.study();// CTE
		// sub class properties are hidden

		System.out.println("_____________");

		bhushan b1 = (bhushan) f1;
		System.out.println(b1.f);// Downcasting
		b1.work();
		System.out.println(b1.b);
		b1.study();

	}
}
