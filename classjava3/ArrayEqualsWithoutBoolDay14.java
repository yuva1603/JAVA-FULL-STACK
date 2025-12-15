package classjava3;

public class ArrayEqualsWithoutBoolDay14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        int[] arr1 = {1, 2, 3, 4};
		        int[] arr2 = {1, 2, 3, 4};

		        int count = 0;

		        // Step 1: Check length
		        if (arr1.length == arr2.length) {

		            // Step 2: Compare elements
		            for (int i = 0; i < arr1.length; i++) {
		                if (arr1[i] == arr2[i]) {
		                    count++;
		                }
		            }

		            // Step 3: Final decision
		            if (count == arr1.length) {
		                System.out.println("Arrays are equal");
		            } else {
		                System.out.println("Arrays are NOT equal");
		            }

		        } else {
		            System.out.println("Arrays are NOT equal");
		        }
		    
	}

}
