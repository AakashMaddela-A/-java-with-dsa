package Arrays;

public class Sort0and1and2 {
    //two pass solution
    public static void main(String[] args) {
        int arr[]={1,2,0,0,2,1,0,0,1,2,};
        int n=arr.length;
        int noOfZeroes=0;
        int noOfOnes=0;
        int noOftwo=0;

        for(int i=0;i<n;i++){
            if(arr[i]==0) noOfZeroes++;
            else if(arr[i]==1) noOfOnes++;
            else noOftwo++;
        }
         for(int i=0;i<n;i++){
             if(i<noOfZeroes) arr[i]=0;
             else if(i<noOfZeroes+noOfOnes) arr[i]=1;
             else arr[i]=2;
         }

         for(int ele:arr){
             System.out.print(ele);
         }
    }
}
