package dataStructure;

public class HashTableArray<T> {
	Entry[] arrayHash; // create array
	int Size;

	public HashTableArray(int Size) {
		this.Size = Size;
		arrayHash = new Entry[this.Size];

		for (int i = 0; i < arrayHash.length; i++) {
			arrayHash[i] = new Entry<T>(); // create linked list at each index
		}

	}


	public void put(int key, T value) {
		System.out.println("key: "+key+" value:"+value);// debug

		int index = GetHash(key);
		System.out.println("index: "+index);// debug
		
		Entry ArrayValue = arrayHash[index];
		//System.out.println("1-Pointer ArrayValue "+ArrayValue);// debug
		
		Entry newItem = new Entry<T>(key, value);
		// Transferring Pointer
		//System.out.println("2-Pointer ArrayValue.next "+ArrayValue.next);// debug
		//System.out.println("3-Pointer newItem "+newItem);// debug
		newItem.next = ArrayValue.next;
		ArrayValue.next = newItem;
		//System.out.println("4-Pointer ArrayValue "+ArrayValue);// debug

	}
	
	int GetHash(int key) {
		//System.out.println(key % Size);
		return key % Size; // many ways
	}

	public T Get(int key) {
		T value = null;
		int index = GetHash(key);// get array index
		// get pointer location
		Entry ArrayValue = arrayHash[index];
		//System.out.println("5-Pointer ArrayValue "+ArrayValue);// debug
		//System.out.println("6-Pointer ArrayValue.next "+ArrayValue.next);// debug
		
		// ArrayValue is a linked list
		while (ArrayValue != null) {
			System.out.println("7-Pointer ArrayValue "+ArrayValue);// debug
			if (ArrayValue.GetKey() == key) {
				
				value = (T) ArrayValue.getValue();
				break;

			}
			// loop
			ArrayValue = ArrayValue.next;
		}

		return value;

	}

}
