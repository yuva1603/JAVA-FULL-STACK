package classjava4;
import java.util.*;


		class QueueArrayList {
		    private ArrayList<Integer> queue;

		    // Constructor
		    QueueArrayList() {
		        queue = new ArrayList<>();
		    }

		    // Enqueue (add element)
		    void offer(int data) {
		        queue.add(data);   // add at end
		    }

		    // Dequeue (remove element)
		    int poll() {
		        if (queue.isEmpty()) {
		            System.out.println("Queue is empty");
		            return -1;
		        }
		        return queue.remove(0); // remove from front
		    }

		    // Peek (front element)
		    int peek() {
		        if (queue.isEmpty()) {
		            System.out.println("Queue is empty");
		            return -1;
		        }
		        return queue.get(0);
		    }

		    // Check if empty
		    boolean isEmpty() {
		        return queue.isEmpty();
		    }

		    // Display queue
		    void display() {
		        System.out.println(queue);
		    }
		}
		public class QueueUsingArrayList {

			public static void main(String[] args) {
				

	}

}
