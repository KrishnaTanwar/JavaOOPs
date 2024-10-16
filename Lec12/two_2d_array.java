
import java.util.Scanner;

public class two_2D_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // Scanner object to take input from the user
        
        // Reading dimensions of the 2D array (number of rows `n` and number of columns `m`)
        int n = sc.nextInt();  // Number of rows
        int m = sc.nextInt();  // Number of columns

        // Initializing a 2D array with `n` rows and `m` columns
        int[][] arr = new int[n][m];

        // Loop through each element of the 2D array and read user input
        for (int i = 0; i < arr.length; i++) {         // Loop through each row
            for (int j = 0; j < arr[0].length; j++) {   // Loop through each column in the current row
                arr[i][j] = sc.nextInt(); 
		}
		Display(arr);
	}
	public static void Display(int[][]arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
    
