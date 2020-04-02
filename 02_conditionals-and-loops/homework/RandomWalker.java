public class RandomWalker {

    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);

        // initializing the starting point
        int xPosition = 0;
        int yPosition = 0;
        int steps = 0;

        // print out the starting point
        System.out.println("(" + xPosition + ", " + yPosition + ")");

        // keeps looping untill it's r distance from the starting point
        while ((Math.abs(xPosition) + Math.abs(yPosition)) != r) {

            // randomly choosing a double between 0 and 1
            double direction = Math.random();

            // if direction <= 0.25, walk north
            if (direction <= 0.25) { yPosition += 1; }
            else {
                // if direction <= 0.5, walk south
                if (direction <= 0.50) {
                    yPosition -= 1;
                } else {
                    // if direction <= 0.75, walk east
                    if (direction <= 0.75) {
                        xPosition += 1;
                    } else {
                        // if direction <= 1, walk west
                        xPosition -= 1;
                    }
                }
            }

            // print out current position
            System.out.println("(" + xPosition + ", " + yPosition + ")");
            steps += 1;
        }

        // print out steps walked
        System.out.println("steps = " + steps);
    }

}
