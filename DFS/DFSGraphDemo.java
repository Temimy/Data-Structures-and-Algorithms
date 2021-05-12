package dataStructure.DFS;

public class DFSGraphDemo {

	public static void main(String[] args) {
		DFSGraph g= new DFSGraph(6);
		
		// Add Nodes
		//            (0)
		//            / \
		//           /   \
		//         (1)   (2)
		//         / \     \
		//        /   \     \
		//      (3)   (4)   (5)
		
		// Last Added = Near Index
		g.AddNode(0, 2);
		g.AddNode(0, 1);
		g.AddNode(1, 4);
		g.AddNode(1, 3);
		g.AddNode(1, 0);
		g.AddNode(2, 5);
		g.AddNode(2, 0);
		g.AddNode(3, 1);
		g.AddNode(4, 1);
		g.AddNode(5, 2);
		
		// Explore
		System.out.println("Explore :");
		g.DFSExplore(0);
		System.out.println("      ");
		
		// Search
		System.out.println("Search :");
		g.DFSSearch(0, 6);
		
	}

}
