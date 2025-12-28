package classjava4;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueArrayDequeDay21 {

	public static void main(String[] args) {
    Queue<Integer> q=new ArrayDeque<>();
		
		//Add
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		System.out.println("The Queue List is "+q);
		
		//Remove 
		System.out.println("The Queue Remove is "+q.remove());
		System.out.println("The Queue Poll is "+q.poll());
		
		// Shows Last Element 
		System.out.println("The Queue Peek is "+q.peek());
		System.out.println("The After Queue List is "+q);
		
		// Adds the Element at last
		System.out.println("The Queue Offer is "+q.offer(60));
		System.out.println("The Queue Element is "+q.element());
		System.out.println("The Queue List After Alternative methods is "+q);

	}

}
