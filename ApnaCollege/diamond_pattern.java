public class diamond_pattern {
    public static void main(String[] args) {
        int n =4;

        //upper half
        for(int i =1;i<=n;i++){
            int space = n-i;
            for(int j =1;j<=space;j++){
                System.out.print(" ");
            }
            int star = 2*i-1;
            for(int j = 1;j <=star;j++){
                System.out.print("*");
            }
            System.out.println();

        }

        //lower half
        for(int i =n;i>=1;i--){
            int space = n-i;
            for(int j =1;j<=space;j++){
                System.out.print(" ");
            }
            int star = 2*i-1;
            for(int j = 1;j <=star;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}
