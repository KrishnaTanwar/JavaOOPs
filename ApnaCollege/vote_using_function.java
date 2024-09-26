import java.util.*;
public class vote_using_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(check(a));
    }
    public static String check(int a) {
        if(a>=18){
            return "Eligible to vote";
        }
        else{
            return "NOT Eligible to vote";

        }
    }
    
}
