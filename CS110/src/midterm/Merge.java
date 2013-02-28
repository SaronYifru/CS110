package midterm;

import java.util.Scanner;

public class Merge {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter list1: ");
		int elementsinList1 = scanner.nextInt();
		System.out.print("Enter list2: ");
		int elementsinList2 = scanner.nextInt();
		int[] list1 = new int[elementsinList1];
		int[] list2 = new int[elementsinList2];
		for (int i = 0; i < elementsinList1; i++) {
			list1[i] = scanner.nextInt();
			
		}
		for (int j = 0; j < elementsinList2; j++) {
			list2[j] = scanner.nextInt();
		}
		System.out.println(merge(list1, list2));
		

	}
	public static int[] merge(int[] list1, int[] list2) {
		int[] mergedList = new int[list1.length + list2.length];
		int length = list1.length + list2.length;
		
		
		for ( int i = 0, j = 0, k = 0; i < list1.length && j < list2.length && k < length; i++, j++, k++) {
			if (list1[i] < list2[j]) {
				mergedList[k] = list1[i];
				
						
				}
			else {
				mergedList[k] = list2[j];
			}
			
		}
		for ( int i = 0, k = 0; i < list1.length && k < length; i++, k++) {
			
				mergedList[k] = list1[i];	
					
					
					
		}
		for ( int j = 0, k = 0; j < list2.length && k < length; j++, k++) {
			mergedList[k] = list2[j];
		}
		return mergedList;
		}
		
	}


