package Lec7;

public class arra_swap_2 {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 7, 8, 9};
        System.out.println(arr[0] + " " + arr[1]);

        Swap(arr, 0 ,1);
        
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static void Swap(int[] arr,int i, int j) {
        int c = arr[i]; // Changes done in heap memory will reflect everywhere
        arr[i] = arr[j];
        arr[j] = c;
        
    }
    
}
