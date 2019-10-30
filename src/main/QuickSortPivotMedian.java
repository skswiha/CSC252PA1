package main;
import java.util.Arrays;

public class QuickSortPivotMedian {

	public static int medianPivot(int arr[], int low, int high) {
		/*
		 * create subarray with low, high, and middle elements in the array sort the
		 * subarray and use index 1 as the median of 3
		 */

		int mid = (high) / 2;

		//System.out.println("\tMiddle of Arr at Index= " + mid + " : " + arr[mid]);
		int[] sortingArr = { arr[low], arr[mid], arr[high] };

		Arrays.sort(sortingArr);

		int middleValue = sortingArr[1];
		//System.out.println("\t"+Arrays.toString(sortingArr));
		//printArray(sortingArr);

		// swap with the last to serve as pivot
		int temp = arr[high];
		arr[high] = middleValue;
		if (middleValue == arr[low]) {
			arr[low] = temp;
		} else if (middleValue == arr[mid]) {
			arr[mid] = temp;
		}

		// System.out.println("median: ");
		//printArray(arr);
		return partition(arr, low, high);

	}

	// ----------------------------------------------------------------------
	/*  method for medianQuicksort */
	public static void medianQuickSort(int arr[], int low, int high) {
		if (low >= high)
			return;

		if (low < high) {

			int pi = medianPivot(arr, low, high);

			QuickSort(arr, low, high);

		}
	}

	// -----------------------------------------------------------------------
	public static void QuickSort(int arr[], int low, int high) {

		if (low < high) {
			int pi = partition(arr, low, high);

			// Recursively sort elements before
			// partition and after partition
			QuickSort(arr, low, pi - 1);
			QuickSort(arr, pi + 1, high);
		}
	}

	// ----------------------------------------------------------------------
	/* A utility function to print array of size n */
	public static void printArray(int arr[]) {
		int n = arr.length;
		System.out.print("\tarr[] = { ");
		for (int i = 0; i < n; ++i) {

			System.out.print(arr[i] + " ");

		}
		System.out.print("}\n");
	}

	// -----------------------------------------------------------------------
	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1); // index of smaller element

		for (int j = low; j < high; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (arr[j] <= pivot) {
				i++;

				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;

	}
}

//code modified from https://gist.github.com/epomp447/4c0d0676d9f013788647cbe6e60ae0df