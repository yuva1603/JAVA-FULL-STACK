package day17;

public class NumberDecreasingPyramid {

	public static void main(String[] args) {
		int i;
		for(i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
