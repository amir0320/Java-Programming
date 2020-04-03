public class WorldMap {

        public static void main(String[] args) {
                StdDraw.enableDoubleBuffering();
                int width = StdIn.readInt();
                int height = StdIn.readInt();

                StdDraw.setCanvasSize(width, height);
                StdDraw.setXscale(0, width);
                StdDraw.setYscale(0, height);
                while (!StdIn.isEmpty()) {
                        StdIn.readString();
                        int numberOfVertices = StdIn.readInt();
                        double[] xCoor = new double[numberOfVertices];
                        double[] yCoor = new double[numberOfVertices];

                        for (int i = 0; i < numberOfVertices; i++) {
                                xCoor[i] = StdIn.readDouble();
                                yCoor[i] = StdIn.readDouble();
                        }
                        StdDraw.polygon(xCoor, yCoor);
                }
                StdDraw.show();
        }

}
