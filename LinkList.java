package dataStructure;

public class LinkList {

	Node head; // first node head
	public LinkList(Node head) {
		this.head=head;
				
	}
	
	public void Add(Node newNode) { // 0(1)
		newNode.next=head; // the new node will be the head
		head=newNode;// the head get into new position
		
	}
	
	public void Delete() { // 0(1)
		head=head.next; // the 2nd head will be instead of 1st head
		
	}
	
	public void Display() {
		Node n=head; // node number , index
		while (n !=null) {
			System.out.println(n.value);
			n=n.next;
		}
	}

}
