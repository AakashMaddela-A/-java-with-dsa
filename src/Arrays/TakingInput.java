package Arrays;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //intialization and declaration
        int arr[]=new int[7];

        //input by loop

        for(int i=0;i<=6;i++){
            arr[i]=sc.nextInt();
        }

        //output by loop

        for(int i=0;i<=6;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
