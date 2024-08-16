package com.saurabh.basics;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = scan.nextInt();
        int factorial = fact(num);
        System.out.println("Factorial of " + num + " is : " + factorial);
    }

    public static int fact(int num) {
        int fact = 1;
        if (num == 0 || num == 1)
            return 1;
        for (int cnt = 2; cnt <= num; cnt++) {
            fact = fact * cnt;
        }
        return fact;
    }

}
