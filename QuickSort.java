package dataStructure;

public class QuickSort {

	static void QuickSort(int[] arr, int low, int high) {

		// to stop sorting from endless running
		if (low >= high)
			return;

		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
		int i = low;
		int j = high;

		// checking left side
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}

			// Checking right side
			while (arr[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}

		}

		// Continue sorting
		// dividing left side
		if (low < j)
			QuickSort(arr, low, j);

		// dividing right side
		if (high > i)
			QuickSort(arr, i, high);

	}

	public static void main(String[] args) {
		int[] arr = { 8, 6, 4, 9, 3, 1, 2 };

		System.out.println("Before Sort");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");

		QuickSort(arr, 0, arr.length - 1);

		System.out.println("\nAfter Sort");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
	}

}// last