package day6;

import java.util.Arrays;

public class trends {
    public static int position(String[] arr, int start, int end, String target){
        if(start<end){
            int mid = start + (end - start)/2;
            if (arr[mid].compareTo(target)==0) {
                return mid;
            }
            else if (arr[mid].compareTo(target)>0) {
                return position(arr, start, end, target);
            }
            else{
                return position(arr, mid+1, end, target);
            }           
        }
        return -1;
    }
    public static void main(String[] args) {
        String target = "data analyst";
        String [] google = {"Java developer", "cloud architect", "data analyst", "devops engineer","full stack developer", "network associate"};
        System.out.println(position(google, 0,google.length-1, target)+1);
    }
}
