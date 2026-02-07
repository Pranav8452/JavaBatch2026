package box5Programs;

public class Swapno {
	public static void main(String[] args) {
		int a = 50;
		int b = 100;

		int temp = a;
		a = b;
		b = temp;

		System.out.println("A value is " + a);
		System.out.println("B value is " + b);

		System.out.println("-------------------------------");

		int x = 111;
		int y = 222;

		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("X value is " + x);
		System.out.println("Y value is " + y);
	}
}
