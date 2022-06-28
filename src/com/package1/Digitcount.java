package com.package1;
import java.util.Scanner;
public class Digitcount{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=inp.nextInt();
        int rem,count=0;
        System.out.println("Enter a key to be searched");
        int key=inp.nextInt();
        while(num>0)
        {
            rem=num%10;
            num=num/10;
            if(rem==key)
            {
                count++;
            }

        }
        System.out.println("No of times the given digit appears = "+count);


    }
}
