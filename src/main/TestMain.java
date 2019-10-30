package main;

import java.util.Random;

public class TestMain {
	public static void main(String[]args) {
		int[] a;
		//Loop to test QuickSortPivotLast, uncomment to run
		/*for (int i = 0; i < 20; i++) {
			a = generateArray(100000);
			QuickSortPivotLast ob = new QuickSortPivotLast();
			long startTime = System.nanoTime();
			ob.sort(a, 0, a.length-1);
			long endTime = System.nanoTime();

			double duration = (endTime - startTime) * 0.000001;
			//System.out.println();
			//System.out.print("Quick Sorted Array: ");
			//QuickSortPivotLast.printArray(a);
			System.out.println(duration);
		}*/
		//Loop to test QuickSortPivotMedian (uncomment to run
		/*for (int i = 0; i < 20; i++) {
			a = generateArray(100000);
			long startTime = System.nanoTime();
			QuickSortPivotMedian.medianQuickSort(a, 0, a.length-1);
			long endTime = System.nanoTime();

			double duration = (endTime - startTime) * 0.000001;
			//System.out.println();
			//System.out.print("Quick Sorted Array: ");
			//QuickSortPivotLast.printArray(a);
			System.out.println(duration);
		} */
		//Loop to test MergeSort
		for (int i = 0; i < 20; i++) {
			a = generateArray(50000);
			MergeSort ob = new MergeSort();
			long startTime = System.nanoTime();
			ob.sort(a, 0, a.length-1);
			long endTime = System.nanoTime();

			double duration = (endTime - startTime) * 0.000001;
			//System.out.println();
			//System.out.print("Quick Sorted Array: ");
			//QuickSortPivotLast.printArray(a);
			System.out.println(duration);
		}
	}
	
	public static int[] generateArray(int arraySize) {
		int[] a = new int [arraySize];
		Random r = new Random();
		for(int i = 0; i < arraySize; i++) {
			a[i]=r.nextInt();
		}
		/*System.out.print("Unsorted Array: ");
		for(int i = 0; i < arraySize; i++) {
			System.out.print(a[i] + " ");
		}*/
		return a;
	}
}
