package dataStructure;

import java.util.Arrays;

// public class DynamicArray {
public class DynamicArray<T> { //<T> generic = any data type
	// array name and size
	// without initialization
	//int[] data;
	Object[] data;
	int size;

	public DynamicArray() {

		// array init
		size = 0;
		//data = new int[1];
		data = new Object[1];

	}

	// returning size
	public int getSize() {
		return data.length;
	}

	// get array size
	// for array operations set & put
	//public int get(int index) {
	public T get(int index) {
		// data casting of object with (T)
		return (T) data[index];
	}

	// adding elements
	public void put(int element) {
		// checking array size before adding
		ensureCapacity(size + 1);
		data[size++] = element;

	}

	// checking array size before adding
	// Receive min Capacity and check if array need to dublicate

	public void ensureCapacity(int minCapacity) {
		int oldCapcity = data.length;
		if (minCapacity > oldCapcity) {
			// Duplicate array size
			int newCapacity = oldCapcity * 2;

			// in delete args cases
			if (newCapacity < minCapacity) {
				newCapacity = minCapacity;

			}

			// build function for arrays
			// copy old args to the new array
			data = Arrays.copyOf(data, newCapacity);

		}
	}

}
