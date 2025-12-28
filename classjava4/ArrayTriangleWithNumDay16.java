package classjava4;

public class ArrayTriangleWithNumDay16 {

	public static void main(String[] args) {
		int num=1;
		int i;
		for(i=1;i<=4;i++) {
			for(int s=4;s>i;s--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}	
	}

}
