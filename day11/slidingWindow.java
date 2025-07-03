package day11;

public class slidingWindow {
    public static int maxcount(int [] arr, int k){
        // if (arr) {
            
        // }      
        int sum = arr[0]+arr[1]+arr[2];
     for(int i = arr[0]; i <k; i++){
        if (sum<0) {
            return sum;
        }
        
     }
    return Math.max(sum, 0);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        // System.out.println(maxcount(0, 3));
        System.out.println(maxcount(arr, 0));
    }
}
