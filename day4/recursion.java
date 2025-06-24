package day4;

public class recursion { 
    public static int findSum(int [] data, int current){
        if (current>=data.length) {
            return 0;
        }
        else{
            return data[current]+ findSum(data, current+1);
        }
    }
    public static void main(String[] args) {
        int[] arr ={250,45,60,75,90};
        System.out.println(findSum(arr, 0));
    }
}
