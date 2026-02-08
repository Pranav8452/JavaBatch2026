package box10Constructor;

//Constructor Overloading
class modak {
	modak() {
		System.out.println("(Kesar) non-parameter const");
	}

	modak(inta a) {
		System.out.println("(choco) int parameter const");
	}

	modak(double ) {
		System.out.println("(sakhar) double parameter const");
	}

	modak(int a, double d) {
		System.out.println("(khobra) 2int ,double,parameter const");
	}
}

public class Festival {
	public static void main(String[] args) {

		System.out.println("main start");
		modak m1 = new modak();
		modak m2 = new modak(50.5);
		modak m3 = new modak(5.5, 70);
		System.out.println("main end");
	}
}
