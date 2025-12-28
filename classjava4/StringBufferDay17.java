package classjava4;

public class StringBufferDay17 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		
	// 1. append()
		sb.append(" Welcome to SLA");
		System.out.println("The Append Result is "+sb);

	//2. insert()
		sb.insert(13," the World");
		System.out.println("The Insert Result is "+sb);
		
	//3. replace()
		sb.replace(0, 6, " Hello All ");
		System.out.println("The Replace All  is "+sb);
	
	//4. delete()
		sb.delete(0, 6);
		System.out.println("The Delete Result "+sb);
		
	//5. reverse()
		sb.reverse();
		System.out.println("The STring Reverse is "+sb);
		
	//6. Length & Capacity
		sb.length();
		System.out.println("The Length Result is "+sb.length());
		System.out.println("The Capacity Result is "+sb.capacity());
		
	}
}
