package box15Inheritance;

class hw {
	void info(double b, char ch) {
		System.out.println(" marks is " + b + " gen is " + ch);
	}
}

class teacher {
	void info(String str, int no) {
		System.out.println("student name is " + str + " Roll no is " + no);
	}
}

public class Practice {
	public static void main(String[] args) {
		hw h1 = new hw();
		h1.info(100.0, 'M');
		System.out.println("---------------------------");
		teacher t1 = new teacher();
		t1.info("pranav", 24);
	}
}
