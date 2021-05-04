package dataStructure;

public class HeapSort {
	static int total;// global variable

	public static void main(String[] args) {
		int[] arr = {6,5,2,1,3,15,9};
		System.out.println("Befor Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		// System.out.println(arr.length);
		// calling PreSorting
		PreSorting(arr);

		System.out.println("\n After Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

	static void Heapify(int[] arr, int ParentIndex) {
		int LeftNodeIndex = ParentIndex * 2;
		int RightNodeIndex = ParentIndex * 2 + 1;
		int NewIndex = ParentIndex;// for comparison

		// checking
		// Left< parent for indexing
		if (LeftNodeIndex < total && arr[LeftNodeIndex] > arr[ParentIndex])
			NewIndex = LeftNodeIndex;

		// Right > parent for indexing
		if (RightNodeIndex < total && arr[RightNodeIndex] < arr[ParentIndex])
			NewIndex = RightNodeIndex;

		// When changing in index is happened
		if (NewIndex != ParentIndex) { 
			swap(arr, ParentIndex, NewIndex);

			// to continue heapify
			Heapify(arr, NewIndex);
		}

	}

	// Swapping to build tree
	static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	// Sorting
	static void PreSorting(int[] arr) {
		total = arr.length-1;
		System.out.println("\ntotal :" +total);// debug

		// Arrange the tree
		for (int i = total / 2; i >= 0; i--) {
			Heapify(arr, i);
		}
		
		// debug
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		// Swapping to the last node to get out
		for (int i = total; i >= 0; i--) {
			swap(arr, 0, i);
			// debug
			System.out.print("\n");
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + "\t");
			}

			total--;// after sorting reduce total
			Heapify(arr, 0); // Re-arrange the array
		}
	}

}// last
