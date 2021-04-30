package dataStructure;

public class QueueArray<T> {

	Object[] ArrayQueue;
	int Front; // first added/queue item
	int Rear; // last added item
	int Size;

	public QueueArray(int Size) {
		this.Size = Size;
		// Initialize Array size
		ArrayQueue = new Object[this.Size];
		Front = -1;
		Rear = -1;

	}

	Boolean IsFull() {
		return (Rear == Size - 1);
	}

	Boolean IsEmpty() {
		return (Front == -1 || Front > Rear);
	}

	public void Queue(Object newItem) {
		if (IsFull()) {
			System.out.println("Queue is Full");
			return;
		}
		Rear = Rear + 1;
		ArrayQueue[Rear] = newItem;
		if(Front==-1) Front=0; // only first time
			

	}

	public T DeQueue() {
		if (IsEmpty()) {
			System.out.println("Queue is Empty");
//			just in circular queue
//			when empty
//			return Front and Rear to original location 
//			Front=-1;
//			Rear=-1;
			
			
			return null;
		}
		T objectOut = (T)ArrayQueue[Front];
		Front = Front + 1;
		return objectOut;

	}

}
