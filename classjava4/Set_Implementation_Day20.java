package classjava4;

import java.util.HashSet;
import java.util.Set;

public class Set_Implementation_Day20 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		// add Element 
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		
		System.out.println("Set Elements "+set);
		
		// Remove Elements 
		set.remove(30);
		
		// Checking Presence
		System.out.println("contains 20? "+set.contains(20));
		
		// Size
		// Checking Presence
		
		System.out.println("Size of the set "+set.size());
	}

}
