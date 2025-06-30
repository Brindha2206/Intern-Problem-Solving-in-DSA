package day8;

public class factorialdp {
    public static int fact(int number){
        int arr[] = new int[number+1];
        if (number <=0) {
            return 0;
        }
        else {
            arr[0]=1;
            for(int index=1;index<arr.length;index++){
                arr[index] = index*arr[index-1];
            }
            
        }
        return arr[number];
    }
    public static void main(String[] args) {
        int number = 5;
        System.out.println(fact(number));
    }
}
