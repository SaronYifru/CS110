package assignments.chap2;

import java.util.Scanner;

public class PE225 {

	public static void main(String[] args) {
		String name;
		Double hoursWorked;
		Double payRate;
		Double federalTaxRate;
		Double stateTaxRate;
        Double grossPay;
        Double federalWithholding;
        Double stateWithholding;
        Double totalDeduction;
        Double netPay;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee's name: ");
        System.out.println("Enter number of hours worked in a week: ");
        System.out.println("Enter hourly pay rate: ");
        System.out.println("Enter federal tax withholding rate: ");
        System.out.println("Enter state tax withholding rate: ");
        name = scanner.next();
        hoursWorked = scanner.nextDouble();
        payRate = scanner.nextDouble();
        federalTaxRate = scanner.nextDouble();
        stateTaxRate = scanner.nextDouble();
        grossPay = hoursWorked * payRate;
        federalWithholding = federalTaxRate * grossPay;
        stateWithholding = stateTaxRate * grossPay;
        totalDeduction = stateWithholding + federalWithholding;
        netPay = grossPay - totalDeduction;
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: " + payRate + "$");
        System.out.println("Gross Pay: " + grossPay + "$");
        System.out.println("Deductions:");
        System.out.println("\t" + "Federal withholding " + (federalTaxRate) + ": " + federalWithholding + "$");
        System.out.println("\t" + "State withholding " + (stateTaxRate) + ":" + stateWithholding + "$");
        System.out.println("\t" + "Total deduction: " + totalDeduction + "$");
        System.out.println("Net pay: " + netPay + "$");
        
        
        
        
		
		
	}

}
