import java.util.*;

public class marks_menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;

        if(n==1){
            do{
                flag = 1;
                int a = sc.nextInt();
                if(a>=90){
                    System.out.println("This is Good");
                }
                else if(a <= 89 && a >= 60){
                    System.out.println("This is also Good");
                }
                else{
                    System.out.println("This is Good as well");
                }
                if (a == 0){
                    flag = 0;
                }
            }
            while(flag!=0) ;
        }
    }
    
}
