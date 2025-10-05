package TwoDimensionalArrays;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int grid[][]=new int[3][3];
        // 10 20 30
        // 40 50 60
        // 70 80 90
        int m= grid.length;;
        int n=grid[0].length;

        //input
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
        }


        //output
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
