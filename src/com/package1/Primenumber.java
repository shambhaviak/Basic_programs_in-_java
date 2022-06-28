package com.package1;
import java.util.Scanner;
public class Primenumber {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number which is to be checked for prime");
        int num = n.nextInt();
        int backup = num;
        int rem, res = 0;
        while (num>0) {
            rem = num % 10;
            num = num / 10;
            res = res * 10 + rem;
        }
        if (res == backup) {
            System.out.println("The given number is prime");
        } else {
            System.out.print("The given number is not prime");
        }
    }
}

