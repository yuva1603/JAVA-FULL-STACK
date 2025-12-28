package classjava4;

import java.util.*;

public class StackImplementaionDay20 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		// Push a Elements
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		
		System.out.println("Stack : "+stack);
		
		// Peek (Top elements)
		System.out.println("Peek : "+stack.peek());
		
		// Pop (Removes last inserted elements )
		System.out.println("Popped "+stack.pop());
		System.out.println("After Pop "+stack);
		
		// Search Element (1-base index)
		System.out.println("Position of B : "+stack.search("B"));
		
		// Check Empty
		System.out.println("Is Stack Empty : "+stack.empty());
	}

}
