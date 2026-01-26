package box7Array;

//WAJP to print All the even element in an array.
public class AllTheEvenElement {
	public static void main(String[] args) {
		int[] arr = { -5, -2, -6, 0, 6, 10, 26, -12, 80, 77, 55, 33 };
		for (int i = 0; i < arr.length; i++)

			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
	}
}
