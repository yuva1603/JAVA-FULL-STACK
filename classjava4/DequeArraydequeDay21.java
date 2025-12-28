package classjava4;
import java.util.*;

public class DequeArraydequeDay21 {
	public static void main(String[] args) {
		
	// Dequeue Operation
	    
		// addFirst() --
		// addLast() --
		// removeFirst() --
		// removeLast() --
		
	// Stack Operation 

		//push();
		//pop();
		//peek();

	// Queue Operation

		//offer();
		//poll();
		//peek();
		//element();
		//add();
		
		Deque<String> dq=new ArrayDeque<>();
		
		// Add a Element
		dq.add("Welcome to SLA");
		dq.addFirst("I am Adding First ");
		
		System.out.println("After add and addfirst  "+dq);

		dq.addLast("Last");
		System.out.println("After addLast  "+dq);

		// Remove a Element
		dq.removeFirst();
		System.out.println("After remove First "+dq);
		dq.removeLast();
		System.out.println("After remove Last  "+dq);
		
		dq.peekFirst();
		
		dq.offer("Hi Hello");
		dq.offerLast("Hey Hello");
		
		dq.pollFirst();
		dq.pollLast();
				
	}
}
