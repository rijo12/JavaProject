package inheritance;

public class BankMainClass {

	public static void main(String[] args) {
		ChequingAccount chqAccount = new ChequingAccount();

		boolean ischequingpin = chqAccount.authorization(1235, "Chequing");

		if (ischequingpin) {

			chqAccount.depositMoney(1000);
		}

		SavingsAccount svngAccount = new SavingsAccount();

		TFSA tfsa = new TFSA();

		boolean isTfsapin = chqAccount.authorization(1235, "Chequing");
		
		if(isTfsapin) {

		tfsa.depositMoney(5000);
		}
		System.out.println("Balance in chequing : " + chqAccount.balance);

		System.out.println("Balance in Saving : " + svngAccount.balance);

		System.out.println("Balance in TFSA : " + tfsa.balance);

	}

}
