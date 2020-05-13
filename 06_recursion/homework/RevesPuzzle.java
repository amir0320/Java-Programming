public class RevesPuzzle {
        // Frame-Stewart algorithm that returns moves of transfering n discs from the starting pole to the destination pole using 4 poles.
        private static void hanoi(int n, String from, String temp1, String temp2, String to) {
                if (n == 0) return;
                int k = (int) (Math.round(n + 1 - Math.sqrt(2 * n + 1)));
                hanoi(k, from, to, temp2, temp1);
                hanoiPole3(n, k, from, temp2, to);
                hanoi(k, temp1, from, temp2, to);
        }
        // classic algorithm that returns moves of transfering n discs from the starting pole to the destination pole using 3 poles.
        private static void hanoiPole3(int n, int k, String from, String temp, String to) {
                if (n == k) return;
                hanoiPole3(n-1, k, from, to, temp);
                StdOut.println("Move disc " + n + " from " + from + " to " + to);
                hanoiPole3(n-1, k, temp, from, to);
        }
        public static void main(String[] args) {
                int n = Integer.parseInt(args[0]);
                hanoi(n, "A", "B", "C", "D");
        }
}
