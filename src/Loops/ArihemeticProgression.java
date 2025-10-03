package Loops;

import java.util.Scanner;

public class ArihemeticProgression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();

        //an = a + (n-1) d

        for(int i=1;i<=(2*n-1);i++){
            System.out.println(i);
        }
    }
}
