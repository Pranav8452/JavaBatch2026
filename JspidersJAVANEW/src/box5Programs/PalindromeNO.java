package box5Programs;

public class PalindromeNO {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a no for rev & palin :");
//		int n = sc.nextInt();
		int num = 121;
		int temp = num;
		int rev = 0;

		while (num > 0) {
			int rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}
		System.out.println("Reverse is " + rev);

		if (temp == rev) {
			System.out.println(temp + " is palindrome");
		} else {
			System.out.println(temp + " is not palindrome");
		}
	}
}
