package box10Constructor;
//Constructor Overloading

class login {

	String email;
	long phno;
	int pass;

	// constructor 1
	public login(String email, int pass) {

		this.email = email;
		this.pass = pass;
	}

	// constructor 2
	public login(long phno, int pass) {

		this.phno = phno;
		this.pass = pass;
	}

	void details() {
		System.out.println(" User Email is " + email + " phone no. is " + phno + "password is " + pass);
	}

}

public class Gmail {
	public static void main(String[] args) {
		System.out.println("Gmail start");
		login l1 = new login("pranav@gmailcom", 8452);// Object 1
		l1.details();
		System.out.println("-------------------");
		login l2 = new login(8452084448L, 8452);// Object 2
		l2.details();

		System.out.println("Gmail End");
	}
}
