package day5;

import java.util.Arrays;

public class prefixPostfix {
    public static int prefix(int [] array, int [] pref,int index){
        if (index ==0) {
            return 0;
        }
        else{
            return array[index]+  prefix(array, index+1);
        }
    }
    public static void main(String[] args) {
        int arr [] ={23,12,98,45,18,45,15,98};
        System.out.println(prefix(arr, 0));
    }
}
