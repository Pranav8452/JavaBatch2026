package box6Mtds;

//WAJP to find area of circle(3.142*r*r)
public class Dominos {
	public static void area(double r) {
		double res = 3.142 * r * r;
		System.out.println("Area is " + res);
	}

	public static void main(String[] args) {
		area(4);
		area(5);
	}

}
