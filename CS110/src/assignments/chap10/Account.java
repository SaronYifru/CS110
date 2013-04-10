package assignments.chap10;

public class Account {

	private double accounts[] = new double[10];
	private int accountId;
	public Account(int accountId) {
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = 100;
		}
		this.accountId = accountId;
		
		

	}
	public boolean isAccountIdValid(int accountId) {
		if (accountId >= accounts.length || accountId < 0) {
			return false;
		}
		return true;
	}
	public double checkBalance() {
		return accounts[accountId];
	}
	public double deposit(double amountToDeposit) {
		accounts[accountId] += amountToDeposit;
		return accounts[accountId];
		
	}
	public double withDraw(double amountToWithDraw) {
		accounts[accountId] -= amountToWithDraw;
		return accounts[accountId];
	}
	public void printMainMenu() {
		System.out.println("Main menu");
		System.out.println("1: check balance" + "\n" + "2: withdraw" + "\n" + "3: deposit" + "\n" + "4: exit");
		System.out.println("Enter a choice: ");
	}

}
