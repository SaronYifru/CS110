package assignments.chap10;

public class Pe108 {

	public static void main(String[] args) {
		int[][] bracketsFor2001 = { { 27050, 65550, 136750, 297350 },
				{ 45200, 109250, 166501, 297350 },
				{ 22600, 54625, 83250, 148675 },
				{ 36250, 93650, 151650, 297350 } };
		int[][] bracketsFor2009 = { { 8350, 33950, 82250, 171550, 372950 },
				{ 16700, 67900, 137050, 20885, 372950 },
				{ 8350, 33950, 68525, 104425, 186475 },
				{ 11950, 45500, 117450, 190200, 372950 } };
		double[] ratesFor2009 = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 }; 
		double[]ratesFor2001 = {0.15, 0.275, 0.305, 0.355, 0.391};
	
		Tax taxFor2001 = new Tax(1, bracketsFor2001, ratesFor2001, 50000);
		Tax taxFor2009 = new Tax(1, bracketsFor2009, ratesFor2009, 50000);
		printTaxTable(taxFor2001, 2001, 50000, 60000, 1000);
		System.out.println();
		printTaxTable(taxFor2009, 2009, 50000, 60000, 1000);
		
		
		
	}	
	public static void printTaxTable(Tax tax, int year, int startOfTaxableIncome, int endOfTaxableIncome, int interval) {
		
		tax.setYear(year);
		tax.printHeader();
		for (int taxableIncome = startOfTaxableIncome; taxableIncome <= endOfTaxableIncome; taxableIncome += interval ) {
			
			tax.setTaxableIncome(taxableIncome);
			tax.setFilingStatus(0);
			int taxForStatus0 = (int) tax.getTax();
			tax.setFilingStatus(1);
			int taxForStatus1 = (int) tax.getTax();
			tax.setFilingStatus(2);
			int taxForStatus2 = (int) tax.getTax();
			tax.setFilingStatus(3);
			int taxForStatus3 = (int) tax.getTax();
			System.out.printf("%5d%15d%28d%25d%25d" , taxableIncome, taxForStatus0, taxForStatus1, taxForStatus2, taxForStatus3);
			System.out.println();
			
			

		}
	}
		
	}
