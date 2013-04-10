package assignments.chap10;

import java.util.Scanner;

public class Pe107 {

	public static void main(String[] args) {
		while (true) {
			System.out.print("Enter an id: ");
			Scanner scanner = new Scanner(System.in);
			int accountId = scanner.nextInt();
			Account account1 = new Account(accountId);
			if (!account1.isAccountIdValid(accountId)) {
				System.out.println("The account Id you entered is invalid! Please try again.");
				continue;
			}
			
			int choice = 0;
			while(choice != 4){
				account1.printMainMenu();
				choice = scanner.nextInt();
				switch(choice) {
				case(1):
					System.out.println("The balance is " + account1.checkBalance());
		    		break;
				case(2):
					System.out.print("Enter an amount to withdraw: ");
		    		double amountToWithDraw = scanner.nextDouble();
		    		account1.withDraw(amountToWithDraw);
		    		break;
				case(3):
					System.out.print("Enter an amount to deposit: ");
					double amountToDeposit = scanner.nextDouble();
					account1.deposit(amountToDeposit);
					break;
				case(4):
					break;
			}
		}
		}

	}

}
