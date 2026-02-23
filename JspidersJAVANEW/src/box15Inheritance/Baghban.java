package box15Inheritance;

//Method OverRiding and with Single Example
class papa {
	void house() {
		System.out.println("A...2nd floor building");
	}
}

class beta extends papa {
	@Override
	void house() {
		System.out.println("B...2nd floor building,Roof top Garden");
	}
}

public class Baghban {
	public static void main(String[] args) {

		beta b1 = new beta();
		b1.house();
	}
}
