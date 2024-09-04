package Lec6;
public class method {

    public static void main(String[] args) {
        System.out.println("Hello");

        Add();

        System.out.println("Bye");
    }

    // There are two types of memory:
    // 1. Stack : Method execute in this memory.
    // 2. Heap

    public static void Add() {
        int a = 8;
        int b = 7;
        int c = a + b;
        Sub();
        System.out.println(c);
        
    }

    public static void Sub() {
        int a = 8;
        int b = 7;
        int c = a - b;
        System.out.println(c);
        
    }

    
}