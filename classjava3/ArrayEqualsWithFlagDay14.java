package classjava3;

public class ArrayEqualsWithFlagDay14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int[] a = {1, 2, 3};
		        int[] b = {1, 2, 4};

		        int flag = 0; // assume equal

		        if (a.length != b.length) {
		            flag = 1;  // not equal
		        } else {
		            for (int i = 0; i < a.length; i++) {
		                if (a[i] != b[i]) {
		                    flag = 1;
		                    break;
		                }
		            }
		        }

		        if (flag == 0) {
		            System.out.println("Arrays are equal");
		        } else {
		            System.out.println("Arrays are NOT equal");
		        }
		    }
		}
	


