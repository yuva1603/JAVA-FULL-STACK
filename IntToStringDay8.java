package classjava2;

public class IntToStringDay8 {
	public static String convert(int n) {
		if(n==0) {return "0";}
		
		boolean neg = n<0;
		if(neg)n=-n;
		
		String s="";
		while(n>0)
		{
			s=(char)('0')+(n%10)+s;
			n/=10;
		}
	return neg?"-"+s:s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(convert(123));
		System.out.println(convert(0));
			
		System.out.println(convert(-456));
		System.out.println(convert(12785));
	}

}
