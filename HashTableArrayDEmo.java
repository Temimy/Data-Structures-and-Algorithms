package dataStructure;

public class HashTableArrayDEmo {

	public static void main(String[] args) {
		
		HashTableArray<String> hash = new HashTableArray<String>(10);
		hash.put(15, "Alaa");
		hash.put(8, "Bedn");
		hash.put(35, "Temimy");
		System.out.println("Get key 15 value :"+hash.Get(15));
		System.out.println("Get key 8 value :"+hash.Get(8));
		System.out.println("Get key 35 value :"+hash.Get(35));

	}

}
