package assignments.chap2;

import java.util.Scanner;

public class PE25 {

	public static void main(String[] args) {
		
		Double tipRate;
		
		Double tip;
		
		Double totalBill;
		
		Double subTotalBill;
		
		System.out.println("Enter the tip rate in %: ");
		
		System.out.println("Enter the sub total of the bill: ");
		
		Scanner scanner = new Scanner(System.in);
		
		tipRate = scanner.nextDouble();
		
		subTotalBill = scanner.nextDouble();
		
		tip = (tipRate/100) * subTotalBill;
		
		totalBill = tip + subTotalBill;
		
		System.out.println("The tip is $" + tip + " and the total bill is $" + totalBill);
		
		
		
		
		}

}
