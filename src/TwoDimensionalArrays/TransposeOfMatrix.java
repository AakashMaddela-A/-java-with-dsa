package TwoDimensionalArrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        // 1 2
        // 3 4
        // 5 6

        int arr[][] = {{1, 2}, {3, 4}, {5, 6}};
        int m = arr.length, n = arr[0].length;

            int[][] transpose = new int[n][m];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    transpose[j][i]=arr[i][j];
                }
            }

        // Step 2: Print the transposed matrix properly
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        }
    }
