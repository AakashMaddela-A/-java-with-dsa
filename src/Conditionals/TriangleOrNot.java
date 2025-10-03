package Conditionals;

import java.util.Scanner;

public class TriangleOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first side: ");
        int a=sc.nextInt();
        System.out.print("enter second side: ");
        int b=sc.nextInt();
        System.out.print("enter third side: ");
        int c=sc.nextInt();

        if((a+b)>c && (b+c)>a && (c+a)>b){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Not a valid triangle");
        }
    }
}
