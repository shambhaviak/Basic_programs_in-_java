package com.package1;
import java.util.Scanner;
public class Fibonacci{
    public static void main(String args[])
    {
        System.out.println("enter number of fibonacci numbers to be printed");
        Scanner inp=new Scanner(System.in);
        int limit=inp.nextInt();
        int first_fib=0;
        int second_fib=1;
        int new_fib,i;
        System.out.println("the fibonacci series is");
        System.out.println("0\n1");
        for(i=0;i<limit;i++)
        {
            new_fib=first_fib+second_fib;
            first_fib=second_fib;
            second_fib=new_fib;
            System.out.println(new_fib);

        }

    }
}

