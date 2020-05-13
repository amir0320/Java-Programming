public class TrinomialBrute {
        // returns the trinomial coefficient T(n, k)
        public static long trinomial(int n, int k) {
                if (n == 0 && k == 0) { return 1; }
                else if (k < -n || k > n) { return 0; }
                else { return trinomial(n-1, k-1) + trinomial(n-1, k) + trinomial(n-1, k+1); }
        }
        // takes two integer command-line arguments n and k and prints T(n, k)
        public static void main(String[] args) {
                int n = Integer.parseInt(args[0]);
                int k = Integer.parseInt(args[1]);
                StdOut.println(trinomial(n, k));
        }
}
