import java.util.*;
public class greatest_two_using_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(maxoftwo(a,b));
    }
    public static int maxoftwo(int x, int y) {
        if(x>y){
            
            return x;
            
        } 
        else{
            return y;
        }
        
    }
    
}
