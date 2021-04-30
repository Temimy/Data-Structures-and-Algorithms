package dataStructure;

public class StackArrayDemo {

	public static void main(String[] args) {
		StackArray<Integer> stack=new StackArray<Integer>(10);
		stack.push(3);
		stack.push(1);
		stack.push(8);
		System.out.println("Top :"+ stack.top);
		System.out.println("pop last item :"+stack.pop());
		System.out.println("Top :"+ stack.top);
		
		System.out.println("Add new Items");
		stack.push(10);
		stack.push(65);
		stack.push(23);
		System.out.println("Top :"+ stack.top);
		System.out.println("pop last item :"+stack.pop());
		System.out.println("Top :"+ stack.top);

	}

}
