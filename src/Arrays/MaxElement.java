package Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int arr[]={23,4,56,87,67,90};
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
