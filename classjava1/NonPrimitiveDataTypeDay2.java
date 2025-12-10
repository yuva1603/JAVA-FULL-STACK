package classjava1;

public class NonPrimitiveDataTypeDay2 {

	public static void main(String[] args) {
		
		// 1. String 
		String s="Hello";
		System.out.println("The String is"+" "+s);
		
		// 2. Array
		int [] numbers= {10,20,30};
		System.out.println("The Array is "+ numbers[2]);
		
		int[] arr=new int[5];
			arr[0]=60;
			arr[1]=120;
			arr[2]=180;
			arr[3]=240;
			arr[4]=300;
			 
			System.out.println("The array is"+" "+arr[3]);
			arr[3]=280; //Array is Mutable(Reassign values)
			
			System.out.println("The array is"+" "+arr[3]);
			
			//Strings in Array
			String[] names= {"John","Ram","Patrick"};
			System.out.println("The Array Value"+" "+names[2]);
		
			//Floats In String
		Float[] f= {0.35f,2.50f};
		System.out.println(f[0]);
		System.out.println(f[1]);
		
			//Double in String
			double[] Values= {10000,20000,30000};
			System.out.println(Values[0]);
			System.out.println(Values[1]);
			System.out.println(Values[2]);
			
			
		//String Input 
			
			
	}
}
