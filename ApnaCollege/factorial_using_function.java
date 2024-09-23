import java.util.*;
public class factorial_using_function {
    public static void printFactorial(int n) {
        int fac = 1;
        if(n<0){
            System.out.println("Invalid");
            return;
        }
        for(int i = n; i>=1; i--){
            fac = fac*i;
        }
        System.out.print(fac);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printFactorial(a);
    }
    
}
