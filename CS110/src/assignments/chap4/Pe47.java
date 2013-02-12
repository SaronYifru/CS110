package assignments.chap4;

public class Pe47 {

	public static void main(String[] args) {
		double CURRENT = 10000;
		// accumulate total 4 year cost by first initializing it to the tenth year cost
		double total4YearCost = tuition10thYear(CURRENT);
		// keep track of the tuition every year starting from the tenth year
		double tuitionForAYear = tuition10thYear(CURRENT);
		for (int j = 1; j < 4; ++j) {
			tuitionForAYear = tuitionForAYear * 0.05 + tuitionForAYear;
		    total4YearCost = total4YearCost + tuitionForAYear;
		}
		System.out.printf("The total Cost for 4 years tuition starting 10 years from now is $%5.0f" 
		                   , total4YearCost);
		
	}
	public static double tuition10thYear(double CURRENT) {
		double tuition = CURRENT;
		
		for (int i = 1; i < 11; i++) {
			tuition = tuition + (tuition * 0.05);
		
		}
		return tuition;	
		
	}
   
   		
}
