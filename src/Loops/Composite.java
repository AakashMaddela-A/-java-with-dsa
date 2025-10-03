package Loops;

import java.util.Scanner;

public class Composite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(n==0) System.out.println("Invalid");
        else if(n==1) System.out.println("Not prime or composite");
        else if(count==2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Composite Number");
        }
    }
}
