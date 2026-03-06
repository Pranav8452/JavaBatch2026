package box20Interface;

public class SBIBank implements ATM1, ATM2, ATM3 {

	int totalBal;// Non-static global variable

	@Override
	public void deposit(int amt1) {
		if (amt1 > 0) {
			totalBal += amt1;
			System.out.println(amt1 + "Deposited Successful");
		} else {
			System.out.println("Enter Valid Deposit Amount");
		}
	}

	@Override
	public void withdraw(int amt2) {
		if (amt2 <= totalBal) {
			totalBal -= amt2;
			System.out.println(amt2 + "Withdraw Successful");
		} else {
			System.out.println("Tera bap chod ke gya tha ya teri maa");
		}
	}

	@Override
	public void checkBal() {
		System.out.println("Total Avaliable bal is " + totalBal);
	}

}
