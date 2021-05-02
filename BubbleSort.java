package dataStructure;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr= {1,5,3,15,4,6};
		System.out.println("Befor Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		int x=0;
		int xj=0;
		// Bubble Sorting 0(n^2)  
		for (int i = 0; i < arr.length; i++) { //n-time
			x=arr[i];
			for (int j = 1; j < arr.length; j++) { // n- time
				
				if (arr[j-1]>arr[j]) {
					x=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=x;
				}
				
			}
		}
		
		System.out.println("\n After Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");

	}
	}

}
