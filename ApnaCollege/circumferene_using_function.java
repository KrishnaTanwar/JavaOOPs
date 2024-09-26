import java.util.*;
public class circumferene_using_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        circumference(r);
    }
    public static void circumference(int r) {
       double c = 2*Math.PI*r ;
       System.out.print(c);
    }
    
}
