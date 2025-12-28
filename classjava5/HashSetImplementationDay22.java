package classjava5;

import java.util.HashSet;
import java.util.Set;

public class HashSetImplementationDay22 {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Mango");
		hashSet.add("Apple");  // Duplicate ignored
		
		System.out.println("HashSet (no specific order) : "+hashSet);
		
		//Operation
		hashSet.remove("Banana");
		System.out.println("After removing Banana : "+hashSet);
		
		System.out.println("Contains Mango ?"+hashSet.contains("Mango"));
		System.out.println("Size : "+hashSet.size());
		
		// Iteration
		System.out.println("\n Iterating HashSet : ");
		for(String item : hashSet) {
			System.out.println(item);
		}
		
	}

}
