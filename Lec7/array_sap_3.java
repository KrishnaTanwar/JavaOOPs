package Lec7;

public class array_sap_3 {

    //JAVA ALWAYS CALL BY VALUE
    // Changes only occurs in main array when we access the index of that array in any function
    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 7, 8, 9};
        int[] other = { 31, 51, 11, 71, 81};
        System.out.println(arr[0] + " " + other[0]);
        swap(arr, other);
        System.out.println(arr[0] + " " + other[0]);
    }
    public static void swap(int[] arr, int[] other) {
        int[] temp = arr;
        arr = other;
        other = temp;
        
    }
    
}
