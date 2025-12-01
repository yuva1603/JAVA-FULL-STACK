package programs.interview;

public class SumOfEvenNumberDay7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int sum=0;
		for(i=1;i<=20;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("the sum is "+" "+sum);
	}
}
