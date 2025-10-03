package Conditionals;

import java.util.Scanner;

public class TerneryOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        //condition ? if true : if false
        System.out.println((n%2==0) ? "Even": "Odd");
    }
}
