package Conditionals;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number: ");
        int a=sc.nextInt();
        System.out.print("enter second number: ");
        int b=sc.nextInt();
        System.out.print("enter third number: ");
        int c=sc.nextInt();

        if(a>b){
            if(a>c)
                System.out.println("a is greater");
                else System.out.println("c is greater");
        }
        else {
            if (b > c)
                System.out.println("b is greater");
                else System.out.println("c is largest");
        }
    }
}
