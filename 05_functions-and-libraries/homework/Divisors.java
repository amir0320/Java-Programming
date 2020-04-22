public class Divisors {
        // returns the greatest common divisor of a and b
        public static int gcd(int a, int b) {
                int aAbs = Math.abs(a);
                int bAbs = Math.abs(b);
                while (bAbs != 0) {
                        int temp = aAbs;
                        aAbs = bAbs;
                        bAbs = temp % bAbs;
                }
                return aAbs;
        }
        // returns the least common multiple of a and b
        public static int lcm(int a, int b) {
                int aAbs = Math.abs(a);
                int bAbs = Math.abs(b);
                int gcdNum = gcd(a, b);
                if (gcdNum == 0) { return 0; }
                else { return aAbs / gcd(a, b) * bAbs; }
        }
        // returns true if a and b are relatively prime; false otherwise
        public static boolean areRelativelyPrime(int a, int b) {
                return gcd(a, b) == 1;
        }
        // returns the number of integers between 1 and n that are
        // relatively prime with n
        public static int totient(int n) {
                int count = 0;
                for (int i = 1; i < n+1; i++) {
                        if (areRelativelyPrime(i, n)) { count++; }
                }
                return count;
        }
        // takes two integer command-line arguments a and b and prints
        // each function, evaluated in the format (and order) given below
        public static void main(String[] args) {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                StdOut.println("gcd(" + a + ", " + b + ") = " + gcd(a, b));
                StdOut.println("lcm(" + a + ", " + b + ") = " + lcm(a, b));
                StdOut.println("areRelativelyPrime(" + a + ", " + b + ") = " + areRelativelyPrime(a, b));
                StdOut.println("totient(" + a + ") = " + totient(a));
                StdOut.println("totient(" + b + ") = " + totient(b));
        }
}
