package com.package2;
import java.util.Scanner;

public class Switch_with_simple_break {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a fruit");
        String fruit=inp.next();
       /* switch(fruit)
    {
        case "Mango":
            System.out.println("King of fruit");
            break;

        case "Apple":
            System.out.println("A sweet fruit");
            break;

        default:
            System.out.println("enter a valid fruit");
        }*/

        //Advanced switch here break is included by default
        switch(fruit){
            case "Mango"->System.out.println("King of fruit");
            case "Apple"->System.out.println("A sweet fruit");
            default->System.out.println("enter a valid fruit");
        }

    }
}
