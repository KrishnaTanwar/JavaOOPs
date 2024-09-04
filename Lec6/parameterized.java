package Lec6;

public class parameterized {
    public static void main(String[] args) {
        System.out.println("Hello");
        int a = 8;
        int b = 7;
        Add(a,b);
        System.out.println("Bye");
    
    }
    public static void Add(int a, int b) {

        int c = a + b;
        sub(c, a);
        System.out.println(c);
    }

    public static void sub(int a, int b) {
        int c = a - b;
        System.out.println(c);
        
    }
    
}
