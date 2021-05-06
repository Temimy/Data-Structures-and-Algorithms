package dataStructure;

public class HeapSort {
	static int total;
	
	// Swapping
	static void swap(int[] arr, int a, int b){
		int temp= arr[a];
		arr[a]= arr[b];
		arr[b]= temp;
	}
	
	// Heapify the array
	static void heapify(int[] arr, int ParentINdex){
		int LeftNodeIndex= ParentINdex*2;
		int RightNodeIndex=ParentINdex*2+1;
		int NewIndex=ParentINdex;
		
		
		if( LeftNodeIndex<= total && arr[LeftNodeIndex] >= arr[NewIndex])
			NewIndex=LeftNodeIndex;
		
		
		if( RightNodeIndex<= total && arr[RightNodeIndex] >= arr[NewIndex])
			NewIndex=RightNodeIndex;
		
		// Index changed
		if( NewIndex!=ParentINdex){
			swap(arr,ParentINdex,NewIndex);
			// Recursion heapify
			heapify(arr, NewIndex);
		}
	}

	static void sort(int[] arr){
		total=arr.length-1;
		
		// Prepare Tree
		for(int i=total/2;i>=0;i--)
			heapify(arr, i);
		
		// Heapify
		for(int i=total;i>0;i--){
			swap(arr,0,i);
			total--;
			heapify(arr, 0);
		}
	}
	
	public static void main(String[] args) {
		 int[] arr={8,6,4,9,3,1,2};
		 
		 System.out.println("Before Sort");
		 for(int i=0;i<arr.length;i++)
		 System.out.print(arr[i] +"\t");
		 
		 sort(arr);
		 
		 System.out.println("\nAfter Sort");
		 for(int i=0;i<arr.length;i++)
		 System.out.print(arr[i] +"\t");
		}

	}// last