package classjava5;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetImplementationDay22 {

	public static void main(String[] args) {
		Set<String> linkedSet = new LinkedHashSet<>();
		
		linkedSet.add("Red");
		linkedSet.add("Blue");
		linkedSet.add("Green");
		linkedSet.add("Red"); // Duplicate Ignored
		
		System.out.println("Linked HashSet (Insertion order) : "+linkedSet);
		
		// Operation
		linkedSet.remove("Blue");
		System.out.println("After removing Blue : "+linkedSet);
		
		System.out.println(" Cointains Green ? "+linkedSet.contains("Green"));
		System.out.println("Size : "+linkedSet.size());
		
		// Iteration 
		System.out.println(" Iterating LinkedHashSet : ");
		for(String item : linkedSet) {
			System.out.println(item);
		}
	}

}
