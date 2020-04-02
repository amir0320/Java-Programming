public class BandMatrix {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        // rows loop
        for (int i = 0; i < n; i++) {

            // initializing an empty row
            String currentRow = "";

            // columns loop
            for (int j = 0; j < n; j++) {
                if (j <= (i + width) && j >= (i - width)) {
                    currentRow += "*  ";
                } else {
                    currentRow += "0  ";
                }
            }
            // print out the current row
            System.out.println(currentRow);
        }
    }
}
