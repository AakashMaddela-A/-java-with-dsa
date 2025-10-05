package TwoDimensionalArrays;

public class SquareMatrixTranspose {
    public static void print(int arr[][]){
        int m = arr.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 2,7}, {3, 4,8}, {5, 6,9}};
        int m = arr.length;

        print(arr);
        for(int i=0;i<m;i++){
            for(int j=0;j<=i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        print(arr);

        //rotate image
        // first transpose and then reverse

        for (int i = 0; i <m ; i++) {
            int start=0,end=m-1;
            while(start<=end){
                int temp=arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
                start++;
                end--;
            }
        }
        print(arr);
    }
}
