package dataStructure;

public class DynamicArrayDemo {

	public static void main (String[] args) {
		// create new instance
		// using generic for Integer
		DynamicArray<Integer> dArray=new DynamicArray<Integer>();
		dArray.put(4);
		System.out.println("Size :"+dArray.getSize());
		dArray.put(43);
		System.out.println("Size :"+dArray.getSize());
		dArray.put(14);
		System.out.println("Size :"+dArray.getSize());
		dArray.put(4);
		System.out.println("Size :"+dArray.getSize());
		dArray.put(4);
		System.out.println("Size :"+dArray.getSize());
	}

}
