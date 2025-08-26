package uebung9;

public class BankMain {

	public static void main(String[] args) {
		Konto konto = new Konto(700);
		DepositThread deposit = new DepositThread(konto, 100);
		WithdrawThread withdraw = new  WithdrawThread(konto, 1000);
		deposit.start();
		withdraw.start();

	}

}
