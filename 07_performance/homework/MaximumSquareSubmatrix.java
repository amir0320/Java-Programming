public class MaximumSquareSubmatrix {
        // returns the size of the largest contiguous square submatrix
        // of a[][] containing only 1s.
        public static int size(int[][] a) {
                int n = a.length;
                int size = 0;
                int[][] dp = new int[n][n];
                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                                dp[i][j] = a[i][j];
                                size = Math.max(size, dp[i][j]);
                                if (i >= 1 && j >= 1) {
                                        if (a[i-1][j-1] + a[i-1][j] + a[i][j-1] + a[i][j] == 4) {
                                                dp[i][j] = Math.min(Math.min(dp[i-1][j-1], dp[i-1][j]), dp[i][j-1]) + 1;
                                                size = Math.max(size, dp[i][j]);
                                        }
                                }
                                // StdOut.print(dp[i][j] + " ");
                        }
                        // StdOut.println();
                }
                return size;
        }
        // reads and n-by-n matrix of 0s and 1s from standard input
        // and prints the size of the largest contiguous square submatrix
        // containing only 1s.
        public static void main(String[] args) {
                int n = StdIn.readInt();
                int[][] matrix = new int[n][n];
                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                                matrix[i][j] = StdIn.readInt();
                        }
                }
                StdOut.println(size(matrix));
        }
}
