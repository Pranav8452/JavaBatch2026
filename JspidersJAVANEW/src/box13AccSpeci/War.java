package box13AccSpeci;

//Access Specifiers
//Same Class Same Package

public class War {
//non-Static global variable
	public int a = 100;
	protected int b = 200;
	int c = 300;
	private int d = 400;

	public void fight1() {

		System.out.println("public Access method");
	}

	protected void fight2() {

		System.out.println("protected Access method");
	}

	void fight3() {

		System.out.println("pkg/Default Access method");
	}

	private void fight4() {

		System.out.println("private Access method");

	}

	public static void main(String[] args) {
		System.out.println("Main Start");
		War w1 = new War();
		System.out.println(w1.a);
		System.out.println(w1.b);
		System.out.println(w1.c);
		System.out.println(w1.d);
		System.out.println("---------------------");
		w1.fight1();
		w1.fight2();
		w1.fight3();
		w1.fight4();
		System.out.println("Main End");
	}
}
