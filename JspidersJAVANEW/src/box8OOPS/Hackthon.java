package box8OOPS;

class p1 {
	int a = 3888;// non static global variable
	static String b = "pranav"; // Static global variable

	static void person() { // non static method
		System.out.println("Hello from pranav");
	}
}

public class Hackthon {
	int num; // Global variable have default value concept
	String s;
	static double d;

	public static void main(String[] args) {
		System.out.println("Main Start");
		// int a;// local variable do not have default value concept
//	System.out.println(a); //CTE
		System.out.println(new Hackthon().num);// 0 Default value
		System.out.println(new Hackthon().s); // null Default value
		System.out.println(Hackthon.d);// 0.0 Default value
		System.out.println(new p1().a);
		System.out.println(p1.b);
		p1.person();
		System.out.println("Main End");
	}
}
