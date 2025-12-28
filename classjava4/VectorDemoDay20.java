package classjava4;
import java.util.*;
public class VectorDemoDay20 {
	// What is vector ?
	// Vector is a legacy class in java (available from JDK 1.0).
	// It is dynamic - grows automatically when elements exceed capacity.
	// Synchronized -> Thread-safe(Slower throw ArrayList)
	// Allows duplicate values and follows insertion order . 
	
	public static void main(String[] args) {
		
		// Creating a vector
		Vector<Integer> vec=new Vector<>();
		
		//Adding Elements
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		
		// INserting at a specific index
		vec.add(1,15);
		
		// Accessing elements 
		System.out.println("Elements at index 2: "+vec.get(2));
		
		// Updating Values
		vec.set(0, 5);
		
		// Removing elements 
		vec.remove(2);
		
		// Displaying vector 
		System.out.println("Vector : "+vec);
		
		// Vector Size and Capacity
		System.out.println("Size : "+vec.size());
		System.out.println("Capacity : "+vec.capacity());
		
		// Checking presence 
		System.out.println("Contains 20? "+vec.contains(20));
		
		// Iternating using for-each
		for(int x : vec) {
			System.out.println("Value : "+x);
		}
		
		
	}

}
