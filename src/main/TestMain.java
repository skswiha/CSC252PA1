package main;

import java.util.Random;

public class TestMain {
	public static void main(String[]args) {
		int[] a = generateArray(8);
		QuickSortPivotLast ob = new QuickSortPivotLast();
		ob.sort(a, 0, a.length-1);
		System.out.println();
		System.out.print("Sorted Array: ");
		QuickSortPivotLast.printArray(a);
	
	}
	
	public static int[] generateArray(int arraySize) {
		int[] a = new int [arraySize];
		Random r = new Random();
		for(int i = 0; i < arraySize; i++) {
			a[i]=r.nextInt(100);
		}
		System.out.print("Unsorted Array: ");
		for(int i = 0; i < arraySize; i++) {
			System.out.print(a[i] + " ");
		}
		return a;
	}
}
