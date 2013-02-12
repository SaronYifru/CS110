package assignments.chap4;

public class Pe43 {
	public static void main(String[] args) {
		int kilograms;
		Double pounds;
		System.out.println("Kilograms \t Pounds");
		int rangeOfKilograms = 199;
		for (kilograms = 1; kilograms <= rangeOfKilograms; kilograms += 2) {
			pounds = kilograms * 2.2;
			System.out.printf(kilograms + "%20.1f", pounds);
			System.out.println();	
		}
			
			
			
			
			
		}
		
	}


