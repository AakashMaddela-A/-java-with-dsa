package Conditionals;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter marks number: ");
        int n=sc.nextInt();

        if(n>=81) System.out.println("very good");
        else if(n>=61 && n<=80)
            System.out.println("good");
        else if(n>=41 && n<=60)
            System.out.println("Average");
        else System.out.println("Fail");
    }
}
