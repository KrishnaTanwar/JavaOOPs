public class pascal_triangle {
    public static void main(String[] args) {
        int n =9;
        
        for(int i = 0; i<=n;i++){
            for(int j =1;j<=n-i;j++){
                //space
                System.out.print(" ");
            }
            int num = 1;
            for(int j = 1;j<=i;j++){
                System.out.print(num+" ");
                num = num*(i-j+1) / (j);
            }
            System.out.print(num+" ");
            System.out.println();
        }
    }
    
}
