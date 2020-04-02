public class Minesweeper {

        public static void main(String[] args) {
                int m = Integer.parseInt(args[0]);
                int n = Integer.parseInt(args[1]);
                int k = Integer.parseInt(args[2]);

                boolean[][] containMine = new boolean[m+2][n+2];
                int[][] grid = new int[m+2][n+2];

                // generating mines
                while (k > 0) {
                        int pos = (int) (Math.random() * (n+2) * (m+2));
                        int mineRow = pos % (m+2);
                        int mineCol = pos / (m+2);

                        if (!containMine[mineRow][mineCol] && 0 < mineRow && mineRow < (m+1) && 0 < mineCol && mineCol < (n+1)) {
                                containMine[mineRow][mineCol] = true;
                                k--;
                        }
                }

                for (int row = 1; row < (m+1); row++) {
                        for (int col = 1; col < (n+1); col++) {
                                if (containMine[row][col]) {
                                        grid[row-1][col-1]++;
                                        grid[row-1][col]++;
                                        grid[row-1][col+1]++;
                                        grid[row][col-1]++;
                                        grid[row][col+1]++;
                                        grid[row+1][col-1]++;
                                        grid[row+1][col]++;
                                        grid[row+1][col+1]++;
                                }
                        }
                }

                for (int row = 1; row < (m+1); row++) {
                        for (int col = 1; col < (n+1); col++) {
                                if (containMine[row][col]) {
                                        System.out.print("*  ");
                                } else {
                                        System.out.print(grid[row][col] + "  ");
                                }
                        }
                        System.out.println();
                }
        }

}
