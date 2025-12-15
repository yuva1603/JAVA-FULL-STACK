package classjava3;

public class SwapArrayDay13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("Before Swappinga "+a+" "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping "+a+" "+b);
		
		// Alternative Method 
		int c=6;
		int d=7;
		int[] temparray = {c,d};
		System.out.println("Before Swapping "+c+" "+d);
		c=temparray[1];
		d=temparray[0];
		System.out.println("After Swapping "+c+" "+d);
	}

}
