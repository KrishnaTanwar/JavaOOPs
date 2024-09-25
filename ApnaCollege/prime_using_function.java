public class prime_using_function {

    public static void main(String[] args) {
        int n = 1001;
        System.out.print(prime_check(n));
    }
    
    public static String prime_check(int a) {
        int count = 0;
        for(int i = 2; i<(a/2)+1;i++){
            
            if(a%i==0){
                count++;
            }
        }
        if(count>=1){
            return "NOT Prime";
        }
        else{
            return "Prime";
        }
        
    }
    
    
}
