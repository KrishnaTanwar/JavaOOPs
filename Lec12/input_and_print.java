import java.util.Scanner;

public class input_and_print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading dimensions of the array
        int n = sc.nextInt(); // number of rows
        int m = sc.nextInt(); // number of columns
        
        // Initializing the array
        int[][] arr = new int[n][m];
        
        // Reading elements into the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { // Use arr[i].length to get the correct column size
                arr[i][j] = sc.nextInt();
            }
        }
        
        // Calling the display method to print the array
        Display(arr);
        
        // Closing the scanner
        sc.close();
    }

    // Display method to print the 2D array
    public static void Display(int[][] arr) { // Change parameter name to arr for clarity
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { // Use arr[i].length to get the correct column size
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
