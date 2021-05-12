package dataStructure.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {
	// Array Size
	int size;
	// Create Adjacency List Array
	adjList[] array;

	public BFSGraph(int size) {
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
	public void BFSExplore(int StartVertex) {

		// use Stack to trace operations
		Boolean[] visited = new Boolean[size];

		// Initialize
		for (int i = 0; i < size; i++) {
			visited[i] = false;
		}
		Queue<Integer> q = new LinkedList<Integer>();

		// push and pop items to check them
		q.add(StartVertex);

		// checking Stack Nodes
		while (!q.isEmpty()) {
			// last item
			int n = q.poll();
			System.out.println("Visit :" + n);

			visited[n] = true;
			Node head = array[n].head;

			// Checking Child
			//Boolean isDone = true;
			while (head != null) {
				if (visited[head.dest] == false) {
					q.add(head.dest);
					visited[head.dest] = true;

				} else
					head = head.next;

			}

		}

	}

}
