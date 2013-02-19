package assignments.chap4;

public class Pe425 {

	public static void main(String[] args) {
		
	    final int MAXIMUMI = 100000;
	    double[] piValuesAtEachI = new double[MAXIMUMI];
	    double piValue = 0;
		int i;
		int index;
		// calculate pi for each 'i' and accumulate in an array
		for (i = 1, index = 0; i <= MAXIMUMI && index < MAXIMUMI; i++, index++) {
		    	piValue = piValue + 4 * (Math.pow(-1, i + 1))/(2 * i - 1);
		    	piValuesAtEachI[index] = piValue;
		}
	    for (i = 10000; i <= MAXIMUMI; i += 10000) {
	    	index = i - 1;
	    	System.out.println("The pi value at i = " + i + " is " + piValuesAtEachI[index]);
	    }
	}   

   
	   
	   
	}


