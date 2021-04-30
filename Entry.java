package dataStructure;

public class Entry<T> { // linked list for each array index
	int key;
	T value;
	Entry next;

	public Entry(int key, T value) {
		this.key = key;
		this.value = value;
		next=null;
		
	}

	// new constructor for initializing
	public Entry() {
		next = null;
		//System.out.println(next);

	}

	public int GetKey() {
		return key;
	}

	public T getValue() {
		return value;
	}
}
