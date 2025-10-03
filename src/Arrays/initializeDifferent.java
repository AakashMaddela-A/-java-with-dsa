package Arrays;

import java.util.Scanner;

public class initializeDifferent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        //taking input
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }

        //output
        for(int i=0;i<=n-1;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
