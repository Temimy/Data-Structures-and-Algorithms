package dataStructure;

public class MergeSort {
	int[] array;
	int[] TempArray;

	public static void main(String[] args) {

		int[] arr = { 1, 5, 3, 15, 4, 6,8,20 };
		System.out.println("Befor Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		// not static method
		new MergeSort().PrepareForSorting(arr);

		System.out.println("\n After Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

	// Prepare for Sorting
	void PrepareForSorting(int[] arr) {
		this.array = arr;
		this.TempArray = new int[arr.length];
		doMergeSort(0, arr.length - 1);

	}

	// Divide to small problems
	void doMergeSort(int lowerIndex, int HigherIndex) {

		// to stop dividing
		if (lowerIndex < HigherIndex) {
			int middle = lowerIndex + (HigherIndex - lowerIndex) / 2;

			// ReCursione function
			doMergeSort(lowerIndex, middle); // ex 10 (1-5)
			doMergeSort(middle + 1, HigherIndex);// ex 10 (6-10)

			// Merge parts
			MergePart(lowerIndex, middle, HigherIndex);
		}

	}

	// Merge small problems and sort

	void MergePart(int lowerIndex, int middle, int HigherIndex) {
		for (int i = lowerIndex; i <= HigherIndex; i++) {
			TempArray[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;

		// Merging

		while (i <= middle && j <= HigherIndex) {
			if (TempArray[i] <= TempArray[j]) {
				array[k] = TempArray[i];
				i++;
			} else {
				array[k] = TempArray[j];
				j++;
			}
			k++;

		}

		// for already sorted items
		while (i <= middle) {
			array[k] = TempArray[i];
			k++;
			i++;
		}

	}

}// last
