package Arrays;

public class ProductArray {
    public static void main(String[] args) {
        int arr[]={34,56,78,97,53};
        int product=1;
        for(int i=0;i<=arr.length-1;i++){
            product=product*arr[i];
        }
        System.out.println(product);
    }
}
