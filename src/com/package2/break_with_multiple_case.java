package com.package2;
import java.util.Scanner;
public class break_with_multiple_case {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter a day's digit");
        int day = inp.nextInt();
        switch (day) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekdays");
                break;
            case 7:
            case 1:
                System.out.println("Weekends");
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
