package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //max element is calculated
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max && arr[i]>secondmax)
                secondmax=arr[i];
        }
        System.out.println(secondmax);
    }
}
