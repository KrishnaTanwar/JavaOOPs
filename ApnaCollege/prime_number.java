import java.util.*;
public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 2;i<(n/2 + 1);i++){
            if(n%i==0){
                count+=1;
            }            
        }
        System.out.println(count);
        if(count==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not PRime");
        }
    }
    
}
