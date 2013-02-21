package assignments.chap4;

public class Pe425 {

	public static void main(String[] args) {
		final int MAXIMUMI = 100000;
	    double piValue = 0;
		for (int i = 1; i <= MAXIMUMI;i++) {
		    	piValue = piValue + 4 * (Math.pow(-1, i + 1))/(2 * i - 1);
		    	if (i%10000 == 0) {
		    		System.out.println("The pi value at i = " + i + " is " + piValue);
		    	}
		}
	    
	}   

   
	   
	   
	}


