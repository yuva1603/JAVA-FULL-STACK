package classjava3;
import java.util.Scanner;
public class ArrayDuplicationMamDay14 {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Array Size: ");
		        int size = sc.nextInt();
		        int[] a = new int[size];

		        System.out.println("Enter " + size + " elements:");
		        for (int i = 0; i < size; i++) {
		            a[i] = sc.nextInt();
		        }
		        System.out.println("Array elements:");
		        for (int i = 0; i < size; i++) {
		            System.out.print(a[i] + " ");
		        }
		        // Remove duplicates manually
		        int[] temp = new int[size];
		        int j = 0; // index for temp
		        for (int i = 0; i < size; i++) {
		            boolean duplicate = false;
		            // check if a[i] already exists in temp[]
		            for (int k = 0; k < j; k++) {
		                if (a[i] == temp[k]) {
		                    duplicate = true;
		                    break;
		                }
		            }
		            // if not duplicate → add to temp
		            if (!duplicate) {
		                temp[j] = a[i];
		                j++;
		            }
		        }
		        // Print unique values
		        System.out.println("Array after removing duplicates:");
		        for (int i = 0; i < j; i++) {
		            System.out.print(temp[i] + " ");
		        }
			}
		}
