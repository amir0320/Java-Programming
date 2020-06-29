public class Clock {
        private static final int HOURS_PER_DAY = 24;
        private static final int MINUTES_PER_HOUR = 60;
        private int hour, minute;
        // creates a clock whose initial time is h hours and m minutes.
        public Clock(int h, int m) {
                validate(h, m);
                hour = h;
                minute = m;
        }
        // creates a clock whose initial time is specified as a string, using the format HH:MM.
        public Clock(String s) {
                String regex = "^\\d{2}:\\d{2}";
                if (!s.matches(regex))
                        throw new IllegalArgumentException("the time format must be HH:MM");
                int h = Integer.parseInt(s.substring(0, 2));
                int m = Integer.parseInt(s.substring(3));
                validate(h, m);
                hour = h;
                minute = m;
        }
        // throws an exception if the given time is invalid.
        private static void validate(int h, int m) {
                if (h < 0 || h >= HOURS_PER_DAY)
                        throw new IllegalArgumentException("the hour must be between 0 and 23");
                if (m < 0 || m >= MINUTES_PER_HOUR)
                        throw new IllegalArgumentException("the minute must be between 0 and 59");
        }
        // returns a string representation of this clock, using the format HH:MM.
        public String toString() {
                String clock = "";
                if (this.hour < 10) clock += "0";
                clock = clock + this.hour + ":";
                if (this.minute < 10) clock += "0";
                clock += this.minute;
                return clock;
        }
        // is the time on this clock earlier than the time on that one?
        public boolean isEarlierThan(Clock that) {
                if (this.hour > that.hour) return false;
                if (this.hour == that.hour && this.minute >= that.minute) return false;
                return true;
        }
        // adds 1 minute to the time on this clock.
        public void tic() {
                toc(1);
        }
        // adds ∆ minutes to the time on this clock.
        public void toc(int delta) {
                if (delta < 0)
                        throw new IllegalArgumentException("delta must be a positive integer");
                int temp = this.minute + delta;
                this.minute = temp % MINUTES_PER_HOUR;
                this.hour = (this.hour + temp / MINUTES_PER_HOUR) % HOURS_PER_DAY;
        }
        // test client
        public static void main(String[] args) {
                Clock clock1 = new Clock(7, 26);
                Clock clock2 = new Clock("08:08");

                StdOut.println("Clock 1: " + clock1.toString());
                StdOut.println("Clock 2: " + clock2.toString());

                StdOut.print("Clock 1 is ");
                if (!clock1.isEarlierThan(clock2)) StdOut.print("not ");
                StdOut.println("earlier than Clock 2.");

                clock1.tic();
                StdOut.println("Tic. Clock 1: " + clock1.toString());

                clock2.toc(88);
                StdOut.println("Toc. Clock 2: " + clock2.toString());
        }
}
