package dataStructure.GraphTree;

public class BinaryTreeDemo {

	public static void main(String[] args) {
				
		// create root node
		NodeTree root = new NodeTree(7,null,null);
		
		// create instance
		BinaryTree bt= new BinaryTree(root);
		
		// add nodes
		for (int i=1;i<=10;i++) {
		NodeTree newNode = new NodeTree(i,null,null);
		bt.AddNode(newNode, bt.root);
		}
		
		System.out.println("Try found 9");
		bt.Search(9, bt.root);
		
		System.out.println("Try found 15");
		bt.Search(15, bt.root);
		
	}

}
