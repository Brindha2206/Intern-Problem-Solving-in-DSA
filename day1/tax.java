package day1;
import java.util.Scanner;
public class tax {
    public static void main(String[] args) {
        int income = 0, firstMax = Integer.MIN_VALUE , secondMax = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        for(int payers = 1; payers<=10; payers++){
            System.out.println("Enter your income:");
            income = scanner.nextInt();
            if (firstMax<=income) {
                secondMax = firstMax;
                firstMax = income;
            }
            else if (secondMax<=income && income == firstMax) {
                secondMax = income;
            }
        }
        System.out.println("The tax payers are: " + firstMax + " and " + secondMax);
        scanner.close();
    }
    
}
