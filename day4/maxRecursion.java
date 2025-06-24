package day4;

public class maxRecursion {
    // public static int maxValue (int [] maxi, int current){
    //     if (current == maxi.length-1) {
    //         return maxi[current];
    //     }
    //     else
    //     {
    //         int currentMax = maxValue(maxi, current+1);
    //         return Math.max(maxi[current], currentMax);
    //     }
    // }
    public static int maxValue(int [] maxi, int current,int end){
if (current == maxi.length-1) {
    return maxi[current];
}
else{
    int currentMax = maxValue(maxi, current+1,end);
    return Math.max(maxi[current], currentMax);
}
    }
    public static void main(String[] args) {
        int[] arr = {0,4,5,3,7,2,1};
        System.out.println(maxValue(arr, 1, 5......................));
    }
}
