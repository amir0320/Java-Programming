import java.util.Arrays;
public class Bar implements Comparable<Bar> {
        // instance variables
        private final String name;
        private final int value;
        private final String category;

        // creates a new Bar
        public Bar(String name, int value, String category) {
                if (name == null)
                throw new IllegalArgumentException("name is invalid");
                if (value < 0)
                throw new IllegalArgumentException("value is negative");
                if (category == null)
                throw new IllegalArgumentException("category is invalid");
                this.name = name;
                this.value = value;
                this.category = category;
        }
        // returns the name of this Bar
        public String getName() {
                return this.name;
        }
        // returns the value of this Bar
        public int getValue() {
                return this.value;
        }
        // returns the category of this Bar
        public String getCategory() {
                return this.category;
        }
        // compare two bars by value
        public int compareTo(Bar that) {
                if (that == null)
                throw new NullPointerException("invalid Bar object");
                if (this.getValue() < that.getValue())                  return -1;
                else if (this.getValue() == that.getValue())        return 0;
                else                                                                   return 1;
        }
        // sample client
        public static void main(String[] args) {
                // create an array of 10 bars
                Bar[] bars = new Bar[10];
                bars[0] = new Bar("Beijing",     22674, "East Asia");
                bars[1] = new Bar("Cairo",       19850, "Middle East");
                bars[2] = new Bar("Delhi",       27890, "South Asia");
                bars[3] = new Bar("Dhaka",       19633, "South Asia");
                bars[4] = new Bar("Mexico City", 21520, "Latin America");
                bars[5] = new Bar("Mumbai",      22120, "South Asia");
                bars[6] = new Bar("Osaka",       20409, "East Asia");
                bars[7] = new Bar("São Paulo",   21698, "Latin America");
                bars[8] = new Bar("Shanghai",    25779, "East Asia");
                bars[9] = new Bar("Tokyo",       38194, "East Asia");

                // sort in ascending order by weight
                Arrays.sort(bars);
                for (Bar bar : bars) {
                        StdOut.println(bar.name + ", " + bar.value + ", " + bar.category);
                }
        }
}
