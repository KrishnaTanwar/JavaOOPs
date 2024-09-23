import java.util.Scanner;

public class print_name_using_function {
    public static void printMyName(String name){
        System.out.print(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);
    } 

    
    
}
