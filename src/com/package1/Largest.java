package com.package1;
import java.util.Scanner;

public class Largest {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=inp.nextInt();
        int b=inp.nextInt();
        int c=inp.nextInt();
        int largest=Math.max(c,Math.max(a,b));
        System.out.println("largest of three numbers="+largest);

    }
}
