public class ShannonEntropy {

        public static void main(String[] args) {
                int m = Integer.parseInt(args[0]);

                double h = 0;
                // inputs are integers from 1 to m
                int[] frequency = new int[m+1];
                int count = 0;

                while (!StdIn.isEmpty()) {
                        int value = StdIn.readInt();
                        frequency[value]++;
                        count++;
                }

                for (int i = 1; i < m+1; i++) {
                        if (frequency[i] != 0) {
                                double pi = (double) (frequency[i]) / count;
                                double piLog = Math.log(pi) / Math.log(2);
                                h -= pi * piLog;
                        }
                }

                StdOut.printf("%.4f\n", h);
        }

}
