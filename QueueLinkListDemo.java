package dataStructure;

public class QueueLinkListDemo {

	public static void main(String[] args) {
		NodeDouble<Integer> node = new NodeDouble<Integer>(12,null,null);
		
		QueueLinkLIst<Integer> queuels= new QueueLinkLIst<Integer>(node);
		queuels.queue(new NodeDouble<Integer>(11, null, null));
		queuels.queue(new NodeDouble<Integer>(14, null, null));
		queuels.queue(new NodeDouble<Integer>(45, null, null));
		System.out.println(queuels.deQueue());
		System.out.println(queuels.deQueue());

	}

}
