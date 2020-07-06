import java.util.Arrays;

public class BarChartRacer {
        public static void main(String[] args) {
                StdDraw.setCanvasSize(1000, 700);
                StdDraw.enableDoubleBuffering();

                In dataFile = new In(args[0]);
                int k = Integer.parseInt(args[1]);

                String title = dataFile.readLine();
                String xAxisLabel = dataFile.readLine();
                String dataSource = dataFile.readLine();

                BarChart chart = new BarChart(title, xAxisLabel, dataSource);
                Bar[] bars = null;
                int recordsPerGroup = 0;
                String caption = "";

                while (dataFile.hasNextLine()) {
                        String currentLine = dataFile.readLine();               // ignore the blank line
                        recordsPerGroup = Integer.parseInt(dataFile.readLine());
                        bars = new Bar[recordsPerGroup];
                        // iterate through all records within the same group
                        for (int i = 0; i < recordsPerGroup; i++) {
                                currentLine = dataFile.readLine();
                                String[] data = currentLine.split(",");
                                if (i == 0) {
                                        caption = data[0];
                                        chart.setCaption(caption);
                                }
                                String name = data[1];
                                int value = Integer.parseInt(data[3]);
                                String category = data[4];
                                Bar bar = new Bar(name, value, category);
                                bars[i] = bar;
                        }

                        Arrays.sort(bars);
                        // add the first k bars to the bar chart in descending order
                        for (int i = 0; i < k; i++) {
                                Bar bar = bars[recordsPerGroup-1-i];
                                chart.add(bar.getName(), bar.getValue(), bar.getCategory());
                        }
                        // draw the bars, pause, and reset
                        StdDraw.clear();
                        chart.draw();
                        StdDraw.show();
                        StdDraw.pause(10);
                        chart.reset();
                        bars = null;
                }
        }
}
