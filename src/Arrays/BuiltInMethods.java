package Arrays;
import java.util.*;
public class BuiltInMethods {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,3,7};
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

//        for each loop
//        for(int ele:arr){
//            System.out.println(ele+" ");
//        }

        //sorting
        Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
