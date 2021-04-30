package dataStructure;

public class ArrayQueueDemo {

	public static void main(String[] args) {
		

		QueueArray<String> queue= new QueueArray<String> (4);
		System.out.println("Front ="+queue.Front + "   Rear="+queue.Rear);
		queue.Queue("A");
		System.out.println("Queue of "+ queue.ArrayQueue[queue.Rear] + "  Front ="+queue.Front + "   Rear="+queue.Rear);
		queue.Queue("B");
		System.out.println("Queue of "+ queue.ArrayQueue[queue.Rear] + "  Front ="+queue.Front + "   Rear="+queue.Rear);
		queue.Queue("C");
		System.out.println("Queue of "+ queue.ArrayQueue[queue.Rear] + "  Front ="+queue.Front + "   Rear="+queue.Rear);
		queue.Queue("D");
		System.out.println("Queue of "+ queue.ArrayQueue[queue.Rear] + "  Front ="+queue.Front + "   Rear="+queue.Rear);
		
		System.out.println("DeQueue " + queue.DeQueue());
		System.out.println("Front ="+queue.Front + "   Rear="+queue.Rear);
		System.out.println("DeQueue " + queue.DeQueue());
		System.out.println("Front ="+queue.Front + "   Rear="+queue.Rear);
		System.out.println("DeQueue " + queue.DeQueue());
		System.out.println("Front ="+queue.Front + "   Rear="+queue.Rear);
		System.out.println("DeQueue " + queue.DeQueue());
		System.out.println("Front ="+queue.Front + "   Rear="+queue.Rear);
		
		System.out.println("DeQueue " + queue.DeQueue());
		System.out.println("Front ="+queue.Front + "   Rear="+queue.Rear);
		
		queue.Queue("E");
		System.out.println("Queue of "+ queue.ArrayQueue[queue.Rear] + "  Front ="+queue.Front + "   Rear="+queue.Rear);
		queue.Queue("F");
		System.out.println("Queue of "+ queue.ArrayQueue[queue.Rear] + "  Front ="+queue.Front + "   Rear="+queue.Rear);
	}

}
