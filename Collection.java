package dataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Collection {

	public static void main(String[] args) {
	
		/* all Data Structure types are
		 * included in Java 
		 */
		
		// Dynamic Array    >>>> ArrayList
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Alaa");
		ar.remove(5);
		ar.get(6);
		
		// Linked List
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("Alaa");
		ls.push("Bedn");
		ls.remove("Temimy");
		
		// Stack  Dynamic Stack Array
		Stack<Integer> st = new Stack<Integer>();
		st.add(4);
		st.remove(6);
		st.isEmpty();
		
		// Queue
		Queue<String> q = new LinkedList<String>();
		q.add("Alaa");
		q.poll();
		
		// Important Queue
		// Items indexed based on high Priority
		PriorityQueue<String> pq = new PriorityQueue<String>(25);
		
		// Hash Map
		HashMap<Integer, String> hsm=new HashMap<Integer, String>();
		hsm.put(15, "Alaa");
		hsm.get(20);
		
	}

}
