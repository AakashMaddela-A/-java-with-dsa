package Arrays;

public class MinValue {
    public static void main(String[] args) {
        int arr[]={23,4,56,87,67,90};
        int min=arr[0];
//        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
