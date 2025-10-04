package Arrays;

public class Sort0and1 {
    public static void main(String[] args) {
        int arr[]={1,0,1,1,1,0,0,1,0,0};
        int n=arr.length;
        int noOfZeroes=0, noOfOnes=0;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                noOfZeroes++;
            }
            else{
                noOfOnes++;
            } 
        }
        for(int i=0;i<n;i++){
            if(i<noOfZeroes) arr[i]=0;
            else arr[i]=1;
        }

        for(int ele:arr){
            System.out.print(ele);
        }
    }
}
