package Lec6;

public class return_method {

    static int val = 100; // Stored in Heap Memory
    public static void main(String[] args) {
        System.out.println("Hello");
        int a = 8;
        int b = 7;
        Add(a,b);
        System.out.println(val);
        System.out.println(Add(a,b));
        System.out.println("Bye");
    
    }
    public static int Add(int a, int b) {
        int val = 90;
        return_method.val = val - 5; // Accessing Global variable in presence of local variable
        int c = a + b;
        return c + sub(c, a);
    }

    public static int sub(int a, int b) {
        return a-b;
        
    }
}