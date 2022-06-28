package com.package1;
import java.util.Scanner;
public class Checkcase {
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("enter a letter");
        char ch=inp.next().charAt(0);
        if(ch>='a' && ch<='z')
        {
            System.out.println("lowercase");
        }
        else {
            System.out.println("Uppercase");
        }





    }
}
