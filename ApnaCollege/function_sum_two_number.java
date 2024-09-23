import java.util.Scanner;

public class function_sum_two_number {
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Sum of two numbers:"+calculateSum(a,b));
    }
    
}
