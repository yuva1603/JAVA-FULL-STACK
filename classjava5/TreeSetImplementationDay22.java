package classjava5;

import java.util.*;

public class TreeSetImplementationDay22 {

	public static void main(String[] args) {
		
		// Creating TreeSet (Stores unique elements in sorted order)
		Set<Integer> numbers = new TreeSet<>();
		
		// Adding Elements 
		numbers.add(50);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10);
		numbers.add(20);   // Duplicate Ignored
		
		System.out.println("Tree Set elements (Sorted) : "+numbers);
		
		// check Existence
		System.out.println("Contains 30? "+numbers.contains(30));
		System.out.println("Contains 100? "+numbers.contains(100));
		
		// Remove Element
		numbers.remove(20);
		System.out.println("After removing 20: "+numbers);
		
		// Size of TreeSet
		System.out.println("TreeSet Size: "+numbers.size());
		
		// Iteration (Sorted order)
		System.out.println("\n Iterating TreeSet : ");
		for(int value : numbers) {
			System.out.println(value);
		}
		
		// Clearing TreeSet
		numbers.clear();
		System.out.println("\n TreeSet after clear(): "+numbers);
	}
}