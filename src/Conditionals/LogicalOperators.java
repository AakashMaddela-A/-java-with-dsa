package Conditionals;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n>99 && n<1000){
            System.out.println("three digit number");
        }else{
            System.out.println("not a three digit number");
        }
    }
}
