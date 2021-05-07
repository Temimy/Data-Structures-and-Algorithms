package dataStructure.GraphTree;

public class BinaryTree {

	// Always give root only
	NodeTree root;

	public BinaryTree(NodeTree root) {
		this.root = root;

	}

	// Add Method

	public void AddNode(NodeTree NewNode, NodeTree rootExplore) {
		// if there's no more Nodes
		if (rootExplore == null)
			return;

		// checking right side
		if (NewNode.value > rootExplore.value) {
			if (rootExplore.right == null) {
				rootExplore.right = NewNode;
				return;
			} else {
				// rootExplore.right == new root
				AddNode(NewNode, rootExplore.right);
			}
		}

		// checking left side
		if (NewNode.value < rootExplore.value) {
			if (rootExplore.left == null) {
				rootExplore.left = NewNode;
				return;
			} else {
				// rootExplore.left == new root
				AddNode(NewNode, rootExplore.left);
			}
		}
	}

	// Search Method

	public void Search(int value, NodeTree rootExplore) {

		// value is found
		if (rootExplore.value == value) {
			System.out.println("Value is founded");
			return;

		}

		// if there's no more Nodes

		if (rootExplore.left == null & rootExplore.right == null) {
			System.out.println("Value is not founded");
			return;
		}

		// checking right side
		if (value > rootExplore.value) {
			Search(value, rootExplore.right);

		}

		// checking left side
		if (value < rootExplore.value) {
			Search(value, rootExplore.left);
		}

	}
}// last
