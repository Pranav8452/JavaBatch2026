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
		u2.checkBal();
		u2.withdraw(500);
		u2.deposit(1500);
		u2.withdraw(500);
		u2.checkBal();

		System.out.println("========================");

		ATM2 u3 = new SBIBank();
		u3.checkBal();
		u3.withdraw(500);
		u3.deposit(1500);
		u3.withdraw(500);
		u3.checkBal();
	}
}
