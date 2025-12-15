package classjava3;
import java.util.Scanner;
public class CountDuplicatesManualDay14 {		
		    public static int countDuplicates(int[] arr) {
		        int n = arr.length;
		        boolean[] visited = new boolean[n];
		        int duplicateCount = 0;

		        for (int i = 0; i < n; i++) {
		            if (visited[i]) continue;

		            int count = 1;
		            for (int j = i + 1; j < n; j++) {
		                if (arr[i] == arr[j]) {
		                    visited[j] = true;
		                    count++;
		                }
		            }
		             if (count > 1) {
		                duplicateCount++;
		            }
		        }

		        return duplicateCount;
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // Take array size from user
		        System.out.print("Enter number of elements: ");
		        int n = sc.nextInt();

		        int[] arr = new int[n];

		        // Take array elements from user
		        System.out.println("Enter " + n + " elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        int duplicates = countDuplicates(arr);
		        System.out.println("Number of duplicate elements: " + duplicates);

		        sc.close();
		    }
		}
	
