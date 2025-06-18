package day1;
import java.util.Scanner;
public class day1_deposits {
   public static void main(String[] args) {
      int data=0, deposits =0 , least = Integer.MAX_VALUE;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Today total deposits:");
      data=scanner.nextInt();
 while(data>0)
 {
    System.out.println("Enter the deposits:");
    deposits = scanner.nextInt();
    if(deposits<least){
      least = deposits;
    }
    data--;
 }
   System.out.println("The least amount is:" + least);
    scanner.close();
   }
 
}