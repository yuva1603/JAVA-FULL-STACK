package classjava4;

public class ArrayReversePyramidDay16 {

	public static void main(String[] args) {
		int num=5;
		for(int i=5;i>=1;i--) {
			for(int s=num;s>i;s--) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}


	}

}
