public class DiscreteDistribution {

        public static void main(String[] args) {
                int m = Integer.parseInt(args[0]);
                int n = args.length;
                int[] cumulativeSum = new int[n];

                // read arguments from args_1 to args_n-1 and update cumulativeSum
                for (int j = 1; j < n; j++) {
                        // update cumulativeSum
                        cumulativeSum[j] = cumulativeSum[j - 1] + Integer.parseInt(args[j]);
                }

                // start point of the m samplings
                for (int i = 0; i < m; i++) {
                        // pick a random integer r uniformly between 0 and S_n
                        int r = (int) (Math.random() * cumulativeSum[n-1]);
                        // initialize index k to be the middle index between 0 to n.
                        int upperBound = n-1;
                        int lowerBound = 0;
                        int k = n / 2;
                        // find the unique index k between 1 and n such that S_k−1 ≤ r < S_k
                        while (k != 0 && (r < cumulativeSum[k - 1] || r >= cumulativeSum[k])) {
                                if (cumulativeSum[k - 1] > r) {
                                        upperBound = k;
                                        k = (upperBound + lowerBound) / 2;
                                } else {
                                        lowerBound = k;
                                        k = (upperBound + lowerBound) / 2;
                                        if (lowerBound == k) {
                                                k++;
                                        }
                                }
                        }
                        // print out index k
                        System.out.print(k + " ");
                }
        }

}
