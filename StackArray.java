package dataStructure;

public class StackArray<T> {

	int Size;
	int top = -1;
	Object[] ArrayStack;

	public StackArray(int Size) {
		this.Size = Size;
		ArrayStack = new Object[this.Size];

	}

	// add elements
	public void push(Object newItem) {
		if (isFull()) {
			System.out.println("Stack is Full");
			return;
		}
		top = top + 1;
		ArrayStack[top] = newItem;

	}

	// delete elements
	// pop item returns as generic T
	public T pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return null;
		}
		T item = (T) ArrayStack[top];
		top = top - 1;
		return item;
	}

	// check full stack
	public Boolean isFull() {
		// top start from 0
		// size start from 1
		return (top == Size - 1); // ex. size=10 = top=9
	}

	// check empty stack
	public Boolean isEmpty() {
		return (top == -1);
	}

}
