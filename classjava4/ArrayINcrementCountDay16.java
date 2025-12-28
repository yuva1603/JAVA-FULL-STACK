package classjava4;

public class ArrayINcrementCountDay16 {

	public static void main(String[] args) {
		int num=4;
		for(int i=4;i>=1;i--) {
			for(int s=num;s>i;s--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
