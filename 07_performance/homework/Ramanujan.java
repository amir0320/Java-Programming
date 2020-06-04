public class Ramanujan {
        // is n a Ramanujan number?
        public static boolean isRamanujan(long n) {
                long nCubeRoot = (long) (Math.ceil(Math.cbrt(n)));
                int count = 0;
                long a2 = 0;
                for (long i = nCubeRoot; i > 1 && count != 2; i--) {
                        long temp = (long) (Math.ceil(Math.cbrt(n - i * i * i)));
                        if (temp < 0) continue;
                        if (i <= a2) break;
                        else {
                                if (temp * temp * temp + i * i * i == n) {
                                        count++;
                                        a2 = temp;
                                }
                        }
                }
                return (count == 2);
        }
        // takes a long integer command-line arguments n and prints true if
        // n is a Ramanujan number, and false otherwise.
        public static void main(String[] args) {
                long n = Long.parseLong(args[0]);
                StdOut.println(isRamanujan(n));
        }
}
