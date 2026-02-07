package box5Programs;

public class ReverseNO {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a no for reverse");
//		int u = sc.nextInt();
		int num = 1432;
		int rev = 0;

		while (num > 0) {
			int rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}

		System.out.println("Reverse is " + rev);
	}
}
