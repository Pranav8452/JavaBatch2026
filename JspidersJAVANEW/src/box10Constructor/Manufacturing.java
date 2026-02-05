package box10Constructor;

class Acer {
	Acer() { // Constructor
		System.out.println("Inside Acer Constructor");
	}
}

public class Manufacturing {
	public static void main(String[] args) {
		System.out.println("Main Start");
		Acer a1 = new Acer();// Object 1
		System.out.println("********************");
		Acer a2 = new Acer();// Object 2
		System.out.println("---------------------");
		Acer a3 = new Acer();// Object 3
		System.out.println("Main End");
	}
}
