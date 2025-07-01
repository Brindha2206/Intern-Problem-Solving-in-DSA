package day10;

import java.util.Scanner;

import day4.sort;

public class validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        int size = name.length();
        if (size<4) {
            System.out.println("Name should have more than 3 characters");
        }
        else {
            System.out.println(name);
        }

        sc.close();
    }
}
