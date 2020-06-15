public class Huntingtons {
        // returns the maximum number of consecutive repeats of CAG in the DNA string.
        public static int maxRepeats(String dna) {
                int count = 0;
                int maxCount = 0;
                int len = dna.length();
                for (int i = 0; i < len; i++) {
                        if ((i+3) <= len && dna.substring(i, i+3).equals("CAG")) {
                                count++;
                                i += 2;
                        } else {
                                count = 0;
                        }
                        maxCount = Math.max(count, maxCount);
                }
                return maxCount;
        }
        // returns a copy of s, with all whitespace (spaces, tabs, and newlines) removed.
        public static String removeWhitespace(String s) {
                String newStr = s.replace(" ", "");
                newStr = newStr.replace("\t", "");
                newStr = newStr.replace("\n", "");
                return newStr;
        }
        // returns one of these diagnoses corresponding to the maximum number of repeats:
        // "not human", "normal", "high risk", or "Huntington's".
        public static String diagnose(int maxRepeats) {
                if (maxRepeats <= 9 || maxRepeats >= 181) return "not human";
                else if (maxRepeats <= 35) return "normal";
                else if (maxRepeats <= 39) return "high risk";
                else return "Huntington's";
        }
        // sample client (see below).
        public static void main(String[] args) {
                String filename = args[0];
                In in = new In(filename);
                String dna = in.readAll();
                dna = removeWhitespace(dna);
                int repeats = maxRepeats(dna);
                StdOut.println("max repeats = " + repeats);
                StdOut.println(diagnose(repeats));
        }
}
