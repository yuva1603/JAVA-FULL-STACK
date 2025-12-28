 package classjava5;

import java.util.HashMap;
import java.util.Map;

public class MapImplementationDay22 {

	public static void main(String[] args) {
		// Key - Value 
		
		Map<String,Integer> scores= new HashMap<>();
		scores.put("John",90);
		scores.put("Johnny", 80);
		scores.put("Jayanthi",70);
		
		System.out.println(scores);
		System.out.println("get Usage "+scores.get("John"));
		System.out.println("Contains Key "+scores.containsKey("Johnny"));
		System.out.println("Contains Values "+scores.containsValue(90));
		System.out.println(" Size "+scores.size());
		System.out.println("Removes the element "+scores.remove("John"));
	}

}
