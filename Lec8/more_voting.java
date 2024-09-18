package Lec8;

public class more_voting {
    public static void main(String[] args) {
        int [] arr = {2, 2, 1, 1, 2, 2};

    }
    public static int Moore_voting(int[] arr) {
        int e = arr[0];
        int v = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == 0){
                v++;
            }
            else{
                v--;
                if (v ==0 ){
                    e = arr[i];
                    v = 1;
                }
            }
        }
        return e;
        
    }
}
