package Arrays;

public class NextGreatestElement {
    public static void main(String[] args) {
        int arr[]={12,8,41,37,2,49,16,28,21};
        int n=arr.length;
        int ans[]=new int[n];
        ans[n-1]=-1;
//        for(int i=0;i<n-1;i++){
//            int maxi=Integer.MIN_VALUE;
//            for(int j=i+1;j<n;j++){
//                maxi=Math.max(maxi,arr[j]);
//            }
//            ans[i]=maxi;
//        }

        //optimised version
        int nextge=arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]=nextge;
            nextge=Math.max(nextge,arr[i]);
        }

        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
