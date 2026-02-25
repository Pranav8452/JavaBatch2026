package box16TypeCasting;

//TYpe Casting
public class PuneetSuperstar {
	public static void main(String[] args) {

		double d = 80; // widening
		System.out.println(d);

		int i = (int) 55.55; // Narrowing
		System.out.println(i); // .55 Data loss

		char ch = (char) 65;
		System.out.println(ch); // A

		// int a = 66.66;

		float l1 = 65789456123789456f;
		System.out.println(l1);// 6.5789454E16

		float f2 = 100000000000000000000f;
		System.out.println(f2);// 1.0E20
	}
}
