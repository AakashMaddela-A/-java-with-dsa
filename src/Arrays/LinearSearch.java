package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter target element: ");
        int x=sc.nextInt();
        System.out.print("Enter Array size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter elements of array: ");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        boolean flag=false;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println("Element found at: "+i);
                flag=true;
            }
        }

        if(!flag) System.out.println("Element Not found");
    }
}
