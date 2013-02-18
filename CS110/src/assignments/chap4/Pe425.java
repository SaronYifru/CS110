package assignments.chap4;

public class Pe425 {

	public static void main(String[] args) {
		double piValue = 0;
	    int i;
	    for (i = 1; i < 10000; i++) {
	    	piValue = piValue + 4 * (Math.pow(-1, i + 1))/(2 * i - 1);
	    }
	    
	    for (i = 10000; i < 100000; i = i + 10000) {
	    	piValue = piValue + 4 * (Math.pow(-1, i + 1))/(2 * i - 1);
	    	System.out.println("The pi value for i = " + i + " is " + piValue);
	    }
	   


	}

}
