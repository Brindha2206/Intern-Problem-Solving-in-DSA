package day10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class kthPackage {
    public static void main(String[] args) {
       Integer [] input = {14,23,7,15,20};
       int K= 4;
        Arrays.sort(input, Collections.reverseOrder());
        System.out.println(Arrays.toString(input));
        System.out.println(input[K-1]);
        // System.out.println(Arrays.toString(input));

        
    }
}
