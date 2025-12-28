package classjava5;

public class StringSplitDay23 {

	public static void main(String[] args) {
		String text="J@ava";
		
		// Parts[0] Before @--J
		// Parts[1] After @--ava
		
		String[] parts =text.split("@");
		String result = parts[0]+parts[1];
		System.out.println(result);

	}

}
