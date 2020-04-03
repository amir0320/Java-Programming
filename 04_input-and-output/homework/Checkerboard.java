public class Checkerboard {

        public static void main(String[] args) {
                StdDraw.enableDoubleBuffering();
                int n = Integer.parseInt(args[0]);

                StdDraw.setXscale(0, n);
                StdDraw.setYscale(0, n);

                boolean colorIsBlue = false;

                // iterating through n rows
                for (int row = 0; row < n; row++) {
                        // iterating through n columns' midpoint
                        for (int col = 0; col < n; col++) {
                                if (colorIsBlue) {
                                        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                                        colorIsBlue = false;
                                } else {
                                        StdDraw.setPenColor(StdDraw.BLUE);
                                        colorIsBlue = true;
                                }
                                StdDraw.filledSquare(col + 0.5, row + 0.5, 0.5);
                        }
                        if (row % 2 == 0) {
                                colorIsBlue = true;
                        } else {
                                colorIsBlue = false;
                        }
                }
                StdDraw.show();
        }

}
