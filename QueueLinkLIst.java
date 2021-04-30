package dataStructure;

import javax.management.ValueExp;

public class QueueLinkLIst<T> {
	NodeDouble<T> Rear; // Last node head
	NodeDouble<T> Front; // First node head

	public QueueLinkLIst(NodeDouble newNode) {
		Rear = newNode; // at startup
		Front = newNode; // at startup

	}

	public void queue(NodeDouble newNode) { // 0(1)
		// the new node will be at the end of link list Rear
		newNode.next = null; // last node
		newNode.previuos = Rear; // take last node index
		Rear.next = newNode; // Take the new index instead of null of Rear
		Rear = newNode; // Rear be the last node

	}

	public T deQueue() {
		
		// the link should be checked isEmpty
		// Home work
		T value = Front.value;
		Front = Front.next; // the 2nd head will be instead of 1st head
		Front.previuos = null;
		return value;

	}

}
