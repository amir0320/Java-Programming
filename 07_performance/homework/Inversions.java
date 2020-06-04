public class Inversions {
        // return the number of inversions in the permutation a[].
        public static long count(int[] a) {
                long count = 0;
                for (int i = 0; i < a.length; i++) {
                        for (int j = i+1; j < a.length; j++) {
                                if (a[i] >  a[j]) count++;
                        }
                }
                return count;
        }
        // return a permutation of length n with exact k inversions.
        public static int[] generate(int n, long k) {
                /** method 1: slower approach, easy to comprehend,
                     but fails several timing tests.
                // initialize a sorted array of length n
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                        a[i] = i;
                }
                // iterating the array and do inversions until numbers match
                long inversionsToGenerate = k;
                int firstIndex = 0;
                int lastIndex = n-1;
                while (inversionsToGenerate > 0 && firstIndex <= lastIndex) {
                        if (lastIndex != firstIndex) {
                                int temp = a[lastIndex];
                                a[lastIndex] = a[lastIndex-1];
                                a[lastIndex-1] = temp;
                                inversionsToGenerate--;
                                lastIndex--;
                        } else {
                                firstIndex++;
                                lastIndex = n-1;
                        }
                }
                return a;
                **/
                int[] a = new int[n];
                int firstIndex = 0, lastIndex = n-1;
                while (n > 0) {
                        if (k >= n-1) {
                                a[firstIndex] = n-1;
                                k -= n-1;
                                firstIndex++;
                        } else {
                                a[lastIndex] = n-1;
                                lastIndex--;
                        }
                        n--;
                }
                return a;
        }
        // takes an integer and a long k as command-line arguments,
        // and prints a permutation of length n with exact k inversions.
        public static void main(String[] args) {
                int n = Integer.parseInt(args[0]);
                long k = Long.parseLong(args[1]);
                int[] a = generate(n, k);
                for (int i = 0; i < n; i++) {
                        StdOut.print(a[i] + " ");
                }
        }
}
