package lec9;

public class insertion_sort {
    public static void main(String[] args) {
        int  [] arr = {1, 2, 7, 8, 9, 11, 4};
        System.out.println(InsertLastElement(arr,arr.length - 1));
        for (int  i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int InsertLastElement(int[] arr, int i) {
        int item = arr[i];
        int j = i - 1;
        while(j >= 0 && arr[i] > item){
            arr[j+1] = arr[j];
            arr[j] = item;
            j--;
        }
        return j+1;
    }
    
}
