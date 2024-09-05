package Lec7;

public class array_swap {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 7, 8, 9};
        System.out.println(arr[0] + " " + arr[1]);
        Swap(arr[0], arr[1]);
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static void Swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
        
    }
    
}
