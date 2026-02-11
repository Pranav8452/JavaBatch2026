package box11Blocks;

//Static block Example - 2
public class Lollipop {
	static String s;
	int n; // We cannot initialize non-static variable in static block.

	static { // Static block 1
		s = "Aishwarya";
	}

	static { // Static block 2
		s = "Pallavi";
	}

	public static void main(String[] args) {

		System.out.println("Main Start");
		System.out.println(s);
		System.out.println("Main End");
	}

	static { // Static block 3
		s = "savita";
	}
}
