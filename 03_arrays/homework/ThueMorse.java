public class ThueMorse {

        public static void main(String[] args) {
                int n = Integer.parseInt(args[0]);
                int[] sequence = new int[n];

                // generate the Thue-Morse sequence
                for (int i = 0; i < n; i++) {
                        if (i == 0) {
                                sequence[i] = 0;
                        } else {
                                // if i is even
                                if (i % 2 == 0) {
                                        sequence[i] = sequence[i/2];
                                } else {
                                        // if i is odd
                                        sequence[i] = 1 - sequence[i-1];
                                }
                        }
                }

                // print out the n by n pattern
                for (int i = 0; i < n; i++) {
                        // loop through every column of the row
                        for (int j = 0; j < n; j++) {
                                if (sequence[i] == sequence[j]) {
                                        System.out.print("+  ");
                                } else {
                                        System.out.print("-  ");
                                }
                        }
                        System.out.println();
                }
        }

}
