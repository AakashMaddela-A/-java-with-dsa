package strings;

import java.util.Scanner;

public class inputsting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String str=sc.nextLine();
        System.out.print("Hi ");
        System.out.println(str);
    }
}
