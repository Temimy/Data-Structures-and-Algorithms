package dataStructure;

public class LinearSearch {

	public static void main(String[] args) {
		// define array with 1,000,000 order number
		int Size = 1000000;
		int[] numbers = new int[Size];

		// init array
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
		}

		// Linear Search  0(n)
		int ittNumber = 0;
		int searchNumber = 1254; // look for number 
		for (int i = 0; i < numbers.length; i++) { // 0(n)
			ittNumber++; // out of step counts
			if (numbers[i] == searchNumber) { //c1
				System.out.println("the number is found"); //c2
				System.out.println("After number of itterations :" + ittNumber); //c3
				break; //c4
			}
		}

	}

}
