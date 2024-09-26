import java.util.*;

public class exponent_using_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.print(power(x,n));
    }
    public static double power(int x, int n) {
        double c = Math.pow(x, n);
        return c;
    }
    
}
