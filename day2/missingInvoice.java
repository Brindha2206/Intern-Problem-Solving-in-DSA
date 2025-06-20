package day2;

import java.util.Scanner;

public class missingInvoice {
    public static boolean isMatched(int []num, int temp){
        for(int current : num){
            if(current == temp)
                return true;          
        }
        return false;
    }
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Enter");
    // }
    
    public static void main(String[] args) {
        int[] invoices = {10,5,7,6,2,3};
        int missing = invoices[0];
        for(int each : invoices){
            if(missing>=each){
                missing = each;
            }
        }
        while (true) {
            int temp = missing + 1;
            // System.out.println(temp);
            if (isMatched(invoices, temp)) {
                // System.out.println(tempc"found");
                missing = temp;
            }
            else{
                System.out.println("The missing invoice is:" + temp);
                break;
            }
        }
    }
}
