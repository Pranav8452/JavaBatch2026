package box20Interface;

public class User {
	public static void main(String[] args) {
		ATM1 u1 = new SBIBank();// upcasting
		u1.checkBal();
		u1.deposit(20000);
		u1.withdraw(5000);
		u1.checkBal();

		System.out.println("******************");
		ATM2 u2 = new SBIBank();
		u1.checkBal();

	}
}
