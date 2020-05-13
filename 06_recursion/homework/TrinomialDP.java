public class TrinomialDP {
        // returns the trinomial coefficient T(n, k)
        public static long trinomial(int n, int k) {
                long[][] t = new long[n+2][n+2];
                t[0][0] = 1;
                for (int i = 0; i <= n+1; i++) {
                        for (int j = 0; j < i; j++) {
                                if (j == 0) {
                                        t[i][j] = t[i-1][j] + 2*t[i-1][j+1];
                                } else {
                                        t[i][j] = t[i-1][j-1] + t[i-1][j] + t[i-1][j+1];
                                }
                        }
                }
                if (k < -n || k > n) return 0;
                else if (k < 0) return t[n+1][-k];
                else return t[n+1][k];
        }
        // takes two integer command-line arguments n and k and prints T(n, k)
        public static void main(String[] args) {
                int n = Integer.parseInt(args[0]);
                int k = Integer.parseInt(args[1]);
                StdOut.println(trinomial(n, k));
        }
}
