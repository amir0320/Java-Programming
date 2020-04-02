public class RandomWalkers {

    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int totalSteps = 0;
        double averageSteps = 0;

        // start looping through the trials
        for (int i = 0; i < trials; i++) {
            // initialize the starting point for the current trial
            int xPosition = 0;
            int yPosition = 0;
            int steps = 0;

            // keeps looping untill it's r distance from the starting point
            while ((Math.abs(xPosition) + Math.abs(yPosition)) != r) {

                // randomly choose a integer between 0 and 3
                double direction = Math.random();

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

                steps += 1;
            }

            // update total steps taken at the end of the current trial
            totalSteps += steps;
        }

        averageSteps = totalSteps / (double) (trials);
        System.out.println("average number of steps = " + averageSteps);
    }

}
