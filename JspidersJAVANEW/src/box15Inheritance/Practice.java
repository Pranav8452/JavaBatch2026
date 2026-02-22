package box15Inheritance;

//method overloading code
class hw {
	void info(double b, char ch) {
		System.out.println("Marks is " + b + " Gen is " + ch);
	}

	void info(String str, int no) {
		System.out.println("Student name is " + str + " Roll no is " + no);
	}

	void info(int a, double d, String str, char ch) {
		System.out.println(+a + d + str + ch);
	}
}

public class Practice {
	public static void main(String[] args) {
		hw h1 = new hw();
		h1.info(100.0, 'M');
		System.out.println("---------------------------");
		h1.info("Don", 100);
		System.out.println("---------------------------");
		h1.info(10, 500.0, " pranav ", 'S');
	}
}
