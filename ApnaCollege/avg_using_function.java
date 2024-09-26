import java.util.*;

public class avg_using_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(average(a, b, c));
    }
    public static int average(int x, int y, int z){
        int avg = (x+y+z)/3;
        return avg;

    }
    
}
