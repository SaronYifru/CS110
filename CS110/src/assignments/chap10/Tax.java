package assignments.chap10;

public class Tax {
	private int filingStatus;
	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;
	private int year;
	private int[][] brackets;
	private double[] rates;
	private double taxableIncome;

	public Tax() {

	}

	public Tax(int filingStatus, int[][] brackets, double[] rates,
			double taxableIncome) {
		this.filingStatus = filingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;

	}

	public int getFilingStatus() {
		return filingStatus;
	}

	public int[][] getBrackets() {
		return brackets;
	}

	public double[] getRates() {
		return rates;
	}

	public double getTaxableIncome() {
		return taxableIncome;
	}

	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}

	public void setBrackets(int[][] brackets) {
		this.brackets = brackets;
	}

	public void setRates(double[] rates) {
		this.rates = rates;
	}

	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}

	public double getTax() {
		// calculate tax in the first bracket
		double tax = 0;
		if (taxableIncome <= brackets[filingStatus][0]) {
			return tax = taxableIncome * rates[0];
		} else {
			tax = brackets[filingStatus][0] * rates[0];

		}
		// calculate tax for the middle brackets
		int i;
		for (i = 1; i < brackets[0].length; i++) {
			if (taxableIncome > brackets[filingStatus][i]) {
				tax = tax
						+ (brackets[filingStatus][i] - brackets[filingStatus][i - 1])
						* rates[i];
			} else {
				tax = tax + (taxableIncome - brackets[filingStatus][i - 1])
						* rates[i];
				break;
			}
		}

		return tax;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void printHeader() {
		System.out.println(year + " United States Federal Personal Tax");
		System.out
				.println("__________________________________________________________________________________________________________");
		System.out.printf("%7s%52s%21s", "Taxable", "Married filing jointly",
				"Married filing");
		System.out.println();
		System.out.printf("%6s%20s%34s%16s%28s", "income", "Single filers",
				"or qualifying widow(er)", "separately", "Head of household");
		System.out.println();
		System.out
				.println("__________________________________________________________________________________________________________");
	}

}
