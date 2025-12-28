package classjava4;

public class HollowDiamondArrayPattern {

	public static void main(String[] args) {
		
		        int n = 6; // height of the star

		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < n - i - 1; j++) {
		                System.out.print(" "); // leading spaces
		            }
		            for (int j = 0; j < 2 * i + 1; j++) {
		                if (j == 0 || j == 2 * i) {
		                    System.out.print("*"); // edges
		                } else {
		                    System.out.print(" "); // hollow inside
		                }
		            }
		            System.out.println();
		        }

		        // bottom part of the star
		        for (int i = n - 2; i >= 0; i--) {
		            for (int j = 0; j < n - i - 1; j++) {
		                System.out.print(" ");
		            }
		            for (int j = 0; j < 2 * i + 1; j++) {
		                if (j == 0 || j == 2 * i) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
		    }
		}
