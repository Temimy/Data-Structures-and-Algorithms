package dataStructure;

public class InterpolationSearch {

	public static void main(String[] args) {
		// define array with 1,000 order number
		int Size = 100000;
		int[] numbers = new int[Size];

		// init array
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
		}
		int low = 0;
		int high = Size - 1;
		int mid;

		// Interpolation Search 0(log n)
		int ittNumber = 0;
		int searchNumber = 888; // look for number

		Boolean isFound = false;

		while (!isFound) {
			if (low>high) {
				System.out.println("The number is not found");
			}
			ittNumber++; // out of step counts
			mid = low + ((high - low) / (numbers[high]-numbers[low]))*(searchNumber*numbers[low]);
			System.out.println("ittNumber:"+ittNumber+"  "+high + " " + mid + " " + low);
			if (numbers[low] == searchNumber || numbers[mid] == searchNumber || numbers[high] == searchNumber) {
				// if (numbers[mid] == searchNumber) {
				System.out.println("the number is found");
				System.out.println("After number of itterations :" + ittNumber);
				break;
			} else {
				if (numbers[mid] > searchNumber) {
					high = --mid;
				} else {
					low = ++mid;

				}

			}
		}

	}

}
