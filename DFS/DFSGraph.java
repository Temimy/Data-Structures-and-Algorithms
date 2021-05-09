package dataStructure.DFS;

import java.util.Stack;

public class DFSGraph {

// Array Size
	int size;
//Create Adjacency List Array
	adjList[] array;

	public DFSGraph(int size) {
		this.size = size;

		// Initialize Create Adjacency List Array
		array = new adjList[this.size];

		for (int i = 0; i < size; i++) {
			array[i] = new adjList();
			array[i].head = null;

		}

	}

	// Add Nodes
	// last added node = near src
	public void AddNode(int src, int dest) {
		Node n = new Node(dest, null);

		// change head pointer
		n.next = array[src].head;
		array[src].head = n;

	}

	// Explore graph
	public void DFSExplore(int StartVertex) {

		// use Stack to trace operations
		Boolean[] visited = new Boolean[size];

		// Initialize
		for (int i = 0; i < size; i++) {
			visited[i] = false;
		}
		Stack<Integer> s = new Stack<Integer>();

		// push and pop items to check them
		s.push(StartVertex);

		// checking Stack Nodes
		while (!s.isEmpty()) {
			// last item
			int n = s.pop();
			s.push(n);// may be have child
			visited[n] = true;
			Node head = array[n].head;

			// Checking Child
			Boolean isDone = true;
			while (head != null) {
				if (visited[head.dest] == false) {
					s.push(head.dest);
					visited[head.dest] = true;
					isDone = false;
					break;

				} else
					head = head.next;

			}
			// for Back Tracking
			if (isDone == true) {
				int outN = s.pop();
				System.out.println("Visited Node :  " + outN);
			}

		}

	}

	public void DFSSearch(int StartVertex, int Search) {

		// use Stack to trace operations
		Boolean[] visited = new Boolean[size];
		Boolean isFound = false;

		// Initialize
		for (int i = 0; i < size; i++) {
			visited[i] = false;
		}
		Stack<Integer> s = new Stack<Integer>();

		// push and pop items to check them
		s.push(StartVertex);

		// checking Stack Nodes
		while (!s.isEmpty()) {
			// last item
			int n = s.pop();
			s.push(n);// may be have child
			visited[n] = true;
			Node head = array[n].head;

			// Checking Child
			Boolean isDone = true;
			while (head != null) {
				// found Node
				if (Search == head.dest) {
					System.out.println("Node is Found");
					isFound = true;
					break;

				}

				if (visited[head.dest] == false) {
					s.push(head.dest);
					visited[head.dest] = true;
					isDone = false;
					break;

				} else
					head = head.next;

			}

			// Stack Break
			if (isFound == true) {
				break;
			}

			// for Back Tracking
			if (isDone == true) {
				int outN = s.pop();
				System.out.println("Visited Node :  " + outN);
			}

		}
		
		// not founded Node
		if (isFound==false) {
			System.out.println("Node can not Founded");


		}

	}

}
