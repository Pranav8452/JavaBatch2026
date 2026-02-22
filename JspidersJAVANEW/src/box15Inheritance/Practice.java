package box15Inheritance;

class hw {
	void info(double b, char ch) {
		System.out.println(" Marks is " + b + " Gen is " + ch);
	}

	void info(String str, int no) {
		System.out.println("Student name is " + str + " Roll no is " + no);
	}
}

public class Practice {
	public static void main(String[] args) {
		hw h1 = new hw();
		h1.info(100.0, 'M');
		System.out.println("---------------------------");
		h1.info("Don", 100);
	}
}
