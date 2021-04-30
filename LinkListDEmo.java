package dataStructure;

public class LinkListDEmo {

	public static void main(String[] args) {
		
		LinkList ls= new LinkList(new Node<Integer>(5,null));
		ls.Add(new Node<Integer>(2,null));
		ls.Add(new Node<Integer>(8,null));
		ls.Display();
		
		System.out.println("After Delet");
		ls.Delete();
		ls.Display();
		
		System.out.println("After Delet");
		ls.Delete();
		ls.Display();
		

	}

}
