package Lec7;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 8, 9};
        Reverse(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
// TWO - POINTER APPROACH
    public static void Reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i<j) {

            int temp = arr[i];
            arr [i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            
        }
        
    }
    
}
