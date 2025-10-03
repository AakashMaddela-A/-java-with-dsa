package Arrays;

import java.util.*;
public class CopyOfArray {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,3,7};
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int nums[]=arr;       // shallow copy
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        // if we change in the shallow copy so it
        // will effect the array of arr


        //deeep copy
        int brr[]=Arrays.copyOf(arr,arr.length);

        // int this there is no change in the array
        brr[0]=70;
        System.out.println();
        System.out.print(arr[0]);
    }
}
