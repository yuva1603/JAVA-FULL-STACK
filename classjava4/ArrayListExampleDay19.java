package classjava4;

import java.util.ArrayList;

public class ArrayListExampleDay19 {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		
		//Add Elements 
		names.add("java");
		names.add("Python");
		names.add("C++");
		System.out.println("The List "+names);
		
		//Add via Index
		names.add(1,"JavaScript");
		System.out.println("The Updated List "+names);
		
		//Access element
		System.out.println(names.get(2));
		
		//Update element
		names.set(0, "Core Java");
		System.out.println("The Updates ELement "+names);
		
		//Remove Element through index
		names.remove(3);
		System.out.println("The Removed List is "+names);
		
		//Remove Element Throuugh String
		names.remove("Python");
		System.out.println("The Removed List in String "+names);
		
		// Size
		System.out.println("Size : "+names.size());
		
		// Iterate
		for(String s : names) {
			System.out.println(s);
		}		
	}
}
