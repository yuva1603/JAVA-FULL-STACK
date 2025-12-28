package classjava4;

public class ArrayJaggedTriangleDay16 {

	public static void main(String[] args) {
		int i;
		for(i=1;i<=4;i++) {
			for(int s=4;s>i;s--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}

}
