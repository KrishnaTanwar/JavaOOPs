package Lec6;

public class array_demo {
    public static void main(String[] args) {
      
        // int [] arr = null; empyt array
        int [] arr = new int[5]; //Continuous series of 20byte values & stored in heap memory (as it is in the class)
       
        System.out.println(arr); // [I@4517d9a3 : [ --> represents 1d array & I --> Integer number & @ --> hexadecimal numbers
      
        int [] other = arr; // new reference to the same array arr
      
        System.out.println(other.length);

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;


        System.out.println(arr[2]);
        System.out.println(arr[0]);

    //      Initializing array ways

    //     1. int[] arr = [10, 5, 6, 8, 11] // Hard Coded array
    //     2. int[] ar1 = new int [] {10, 5, 6, 8, 9} 
     }
    
}
