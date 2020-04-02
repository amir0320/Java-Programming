public class Birthday {

        public static void main(String[] args) {
                int n = Integer.parseInt(args[0]);
                int trials = Integer.parseInt(args[1]);

                // n+2 because index 0 is meanless and we need 1 extra birthday for the worst case
                int[] birthdayTracker = new int[n+2];

                // start point of trials
                for (int i = 0; i < trials; i++) {
                        // initialize array of n birthdays
                        boolean[] birthdays = new boolean[n+1];
                        boolean found = false;
                        int peopleEnteredRoom = 0;

                        while (!found) {
                                // randomly choose the next person's birthday
                                int peopleBirthday = (int) (Math.random() * n) + 1;
                                if (birthdays[peopleBirthday]) {
                                        found = true;
                                } else {
                                        birthdays[peopleBirthday] = true;
                                }
                                peopleEnteredRoom++;
                        }
                        birthdayTracker[peopleEnteredRoom]++;
                }

                // print out the result table
                double cumulativeSum = 0;
                int count = 1;
                // keep printing until we reach a fraction >= 0.5
                while (cumulativeSum / trials < 0.5) {
                        cumulativeSum += birthdayTracker[count];
                        double fraction = cumulativeSum / trials;
                        System.out.print(count + " " + birthdayTracker[count] + " " + fraction);
                        System.out.println();
                        count++;
                }
        }

}
