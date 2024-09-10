package Lec7;

public class reverse_range {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 7, 8, 6, 9, 11, 15, 17, 18, 16, 23, 27 };
        Reverse(arr, 3, 6); // Reverse the array from index 3 to 6
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Printing the array after reversing
        }
    }

    // Method to reverse the portion of the array between indices 'i' and 'j'
    public static void Reverse(int[] arr, int i, int j) {
        while (i < j) {
            // Swap the elements at indices 'i' and 'j'
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            // Move the pointers towards the center
            i++;
            j--;
        }
    }
}
