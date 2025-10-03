package Arrays;

public class sumOfElements {
    public static void main(String[] args) {
        int arr[]={34,56,78,97,53};
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
