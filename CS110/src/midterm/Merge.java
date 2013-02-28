package midterm;

import java.util.Scanner;

public class Merge {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int elementsinList1 = scanner.nextInt();
		int elementsinList2 = scanner.nextInt();
		int[] list1 = new int[elementsinList1];
		int[] list2 = new int[elementsinList2];
		for (int i, j = 0; i < elementsinList1; i++) {
			list1[i] = scanner.nextInt();
			
		}
		for (int j = 0; j < elementsinList2; j++) {
			list2[j] = scanner.nextInt();
		}
		

	}
	public static int[] merge(int[] list1, int[] list2) {
		int[] mergedList = new int[list1.length + list2.length];
		int max = 0;
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list2.length; j++){
				for (int k = list2.length + list1.length - 1; k >= 0; k--){
					if ((list1[i] > list2[i])){
						mergedList[k] = list1[i];
						max = list1[i];
						
				}
					
					
					
					
					
				}
			}
		}
		
	}

}
