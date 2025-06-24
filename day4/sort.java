package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sort {
    public static void main(String[] args) {
        int arr[] = {1,2,8,5,4,7,10};
        //odd
        List <Integer> oddList =  new ArrayList<>();
        List <Integer> evenList = new ArrayList<>();
        
        // System.out.println(oddList);
        // //ascending order
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // // descending order
        Arrays.sort(arr, Collections.reverseOrder());
       
    }
}
