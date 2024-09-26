import java.util.*;
public class input_user_want {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int b;
        int pos = 0;
        int sub = 0;
        int zero = 0;
        
        
        do{
            System.out.print("Enter number: ");
            int a = sc.nextInt();
            if(a>0){
                pos++;
            }
            else if(a<0){
                sub++;
            }
            else{
                zero++;
            }
            System.out.print("Want to write (0/1): ");
            b = sc.nextInt();

        
        }
        
        while(b == 1);
        System.out.println("Positive numbers Entered "+pos);
        System.out.println("Subtract numbers Entered "+sub);
        System.out.println("Zero numbers Entered "+zero);
        
    }
    
}
