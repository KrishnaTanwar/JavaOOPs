import java.util.*;

public class even_odd_usiing_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(num_check(n));
    }

    public static String num_check(int a) {
        if(a%2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
        
    }
    
}
