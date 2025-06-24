package day5;

public class climbingStairs {
    public static int climb(int num){
        if (num<=0) {
            return 0;
        }
        else if (num==1) {
            return 1;
        }
        else if (num==2) {
            return 2;
        }
        else{
            return climb(num-1)+ climb(num - 2);
        }
    }
    public static void main(String[] args) {
        int num =5;
        System.out.println(climb(num));
    }
}
