import java.util.*;
public class function_product_two_number {

    public static int productTwoNumbers (int a, int b){
        return a*b;
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Product of to numbers: "+productTwoNumbers(x, y));
    }
}
