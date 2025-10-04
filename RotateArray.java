package Arrays;

public class RotateArray {
    public static void reverse(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        int n= arr.length;
        if(n==0) return;
        int k=2;
        k= k %n;
        if(k==0) return;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

        for(int num:arr){
            System.out.print(num +" ");
        }
    }
}
