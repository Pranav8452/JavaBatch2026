package box11Blocks;

public class CID {

	static String str;
	int num;
	{
//non-static block-1
//		str = "Abhijit";
		/* We can initialize static variable but it its not a goood practice */
		num = 500;
		System.out.println("Non-static block -1");
	}
	{// Non-static block-2
		num = 600;
		System.out.println("Non-static block -2");

	}

	CID() {
		num = 720;
		System.out.println("CID class constructor");
	}

	public static void main(String[] args) {
		System.out.println("Mian Start");
		CID c1 = new CID(); // object-1
//		System.out.println(c1.num);
		System.out.println("-----------------");
		CID c2 = new CID();// object-2
		System.out.println(c1.num);
		System.out.println("Main End");
	}

	{// Non-static block -3
		System.out.println("Non-static block -3");

	}
}
