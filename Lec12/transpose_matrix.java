package Lec12;

public class transpose_matrix {
    public static void main(String[] args) {
        int[][] arr = { {2,3,4,5 },
                        {1,8,9,7},
                        {12,56,78,23},
                        {6,14,15,16}};
        transpose(arr);

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int [][] arr) {
        int n = arr.length; // Assuming it's a square matrix

        // Transpose the matrix in place
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap arr[i][j] and arr[j][i]
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
    