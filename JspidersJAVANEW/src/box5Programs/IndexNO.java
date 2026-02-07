package box5Programs;

public class IndexNO {
	public static void main(String[] args) {
		String str = "pranav";
		System.out.println(str.length());
		System.out.println("--------------------");
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(5));

		System.out.println("--------------------------");

		// REVERSE A STRING.........

		String str2 = "pranav";
		String rev = " ";

		for (int i = 0; i < str2.length(); i++) {
			rev = str2.charAt(i) + rev;
		}
		System.out.println("Reverse is : " + rev);

	}
}
