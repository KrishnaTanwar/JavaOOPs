import java.util.*;
public class sum_odd_using_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(oddsum(n));
    }
    public static int oddsum(int n) {
        int sum = 0;
        for(int i = 1; i<=n;i++){
            sum+=i;
        }
        return sum;
        
    }
    
}
