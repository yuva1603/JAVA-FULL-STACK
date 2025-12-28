package classjava4;

public class StringHandlinDay17 {

	public static void main(String[] args) //Class
	{
		String first = "Hello"; //Class
		String second = "World";
		
		String sec=new String("Hai"); //Object
		
	//Length of String
		int length=first.length();
		System.out.println("The length of Output is "+length);
		
	//Joining the String Concat or (+)
		String joinString=first.concat(second);
		String joinString1=first+" "+second;
		
		System.out.println("The Joined String is "+joinString);
		System.out.println("The Joined String is "+joinString1);
		
	//Compare two Strings equals or (==)
		boolean result=first.equals(second);  //Way 1
		System.out.println("Both Strings are Equal : "+result);
		
	//Using a new Operator create String Object 
		String one=new String("How Are You ? ");
		System.out.println("String Through Object "+" "+one);
		
	// Replace
		String str1="bat ball";
		  // replace b with c
		System.out.println("Replace b with c "+str1.replace('b','c'));
		
	//Replace All
		String str2 = "basket ball";
		System.out.println("Replace basket with volley "+str2.replaceAll("basket", "Volley"));
		
			//Upper Case
		System.out.println("Upper Case "+str2.toUpperCase());
		
			//Lower Case
		System.out.println("Lower Case "+str2.toLowerCase());
		
	//Character at Position
		System.out.println("Character at Position "+str2.charAt(3));
		
	//SubString 
		System.out.println("Sub String "+str2.substring(0,6));
	}

}
