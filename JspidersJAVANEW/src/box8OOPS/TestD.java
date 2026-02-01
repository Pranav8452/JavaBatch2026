package box8OOPS;

//Static Initializers
public class TestD {
	static int a = 10 + demo();
	static {
		System.out.println(a);
		System.out.println("SB-1");
	}

	public static void main(String[] args) {

		System.out.println("Main Start");
		demo();
		test(200);
		System.out.println("Main End");

	}

	public static int demo() {

		System.out.println("Demo Start");
		System.out.println(a);
		System.out.println(b);
		System.out.println("Demo End");
		return 40;
	}

	static int b = test(100);

	public static int test(int a) {
		System.out.println("Test Start");
		System.out.println(a);
		System.out.println(b);
		System.out.println("Test End");
		return 2 * a;
	}
}
