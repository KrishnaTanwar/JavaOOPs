import java.util.*;

public class greet_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // if (button == 1)
        // System.out.println("Hello");

        // else if(button == 2)
        // System.out.println("Nmaste");

        // else if(button==3)
        // System.out.println("Bonjoure");

        // else
        // System.out.println("Invalid button");

        switch (button) {
            case 1: System.out.println("Hello");
            break;
                
            case 2: System.out.println("Namaste");
            break;

            case 3: System.out.println("Bonjiure");
            break;

            default: System.out.println("Invalid button");  
            break;
        }
    }
    
}
