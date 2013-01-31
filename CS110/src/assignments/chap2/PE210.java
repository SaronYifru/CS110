package assignments.chap2;

import java.util.Scanner;

public class PE210 {

	public static void main(String[] args) {
		
		final int energyConstant = 4184;
		
		Double weightOfWater;
		
		Double initialTemp;
		
		Double finalTemp;
		
		Double energy;
		
		System.out.println("Enter the amount oof water in kilograms: ");
		
		System.out.println("Enter the initial temperature: ");
		
		System.out.println("Enter the final temperature: ");
		
		Scanner scanner = new Scanner(System.in);
		
		weightOfWater = scanner.nextDouble();
		
		initialTemp = scanner.nextDouble();
		
		finalTemp = scanner.nextDouble();
		
		energy = weightOfWater * (finalTemp - initialTemp) * energyConstant;
		
		System.out.println("The energy needed is " + energy);
		
		
	}

}
