package day17;

public class NumberTriangular {

	public static void main(String[] args) {
		int num=7;
		for(int i=1;i<=5;i++) {
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
