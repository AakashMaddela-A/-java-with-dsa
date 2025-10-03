package Arrays;

public class marksarray {
    public static void main(String[] args) {
        //printing index where marks less than 35
        int arr[]={45,34,67,89,65,43,32};
        for(int i=0;i<= arr.length-1;i++){
            if(arr[i]<35){
                System.out.println(i+" ");
            }
        }
    }
}
