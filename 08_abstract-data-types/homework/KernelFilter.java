import java.awt.Color;
public class KernelFilter {
        // returns a new picture that applies a Gaussian blur filter to the given picture
        public static Picture gaussian(Picture picture) {
                double[][] filterKernel = {{1.0/16.0, 2.0/16.0, 1.0/16.0},
                                                      {2.0/16.0, 4.0/16.0, 2.0/16.0}, {1.0/16.0, 2.0/16.0, 1.0/16.0}};
                return kernel(picture, filterKernel);
        }
        // returns a new picture that applies a sharpen filter to the given picture
        public static Picture sharpen(Picture picture) {
                double[][] filterKernel = {{0.0, -1.0, 0.0},
                                                      {-1.0, 5.0, -1.0},
                                                      {0.0, -1.0, 0.0}};
                return kernel(picture, filterKernel);
        }
        // returns a new picture that applies an Laplacian filter to the given picture
        public static Picture laplacian(Picture picture) {
                double[][] filterKernel = {{-1.0, -1.0, -1.0},
                                                      {-1.0, 8.0, -1.0},
                                                      {-1.0, -1.0, -1.0}};
                return kernel(picture, filterKernel);
        }
        // returns a new picture that applies an emboss filter to the given picture
        public static Picture emboss(Picture picture) {
                double[][] filterKernel = {{-2.0, -1.0, 0.0},
                                                      {-1.0, 1.0, 1.0},
                                                      {0.0, 1.0, 2.0}};
                return kernel(picture, filterKernel);
        }
        // returns a new picture that applies a motion blur filter to the given picture
        public static Picture motionBlur(Picture picture) {
                double[][] filterKernel = {{1.0/9.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                                                     {0.0, 1.0/9.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                                                     {0.0, 0.0, 1.0/9.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                                                     {0.0, 0.0, 0.0, 1.0/9.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                                                     {0.0, 0.0, 0.0, 0.0, 1.0/9.0, 0.0, 0.0, 0.0, 0.0},
                                                     {0.0, 0.0, 0.0, 0.0, 0.0, 1.0/9.0, 0.0, 0.0, 0.0},
                                                     {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0/9.0, 0.0, 0.0},
                                                     {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0/9.0, 0.0},
                                                     {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0/9.0}};
                return kernel(picture, filterKernel);
        }
        // returns the rgb value after rounding and clamping
        private static int roundClamp(double val) {
                int result = (int) Math.round(val);
                result = Math.max(result, 0);
                result = Math.min(result, 255);
                return result;
        }
        // returns a new picture that applies an arbitrary kernel filter to the given picture
        private static Picture kernel(Picture picture, double[][] weights) {
                int filterRow = weights.length;
                int filterCol = weights[0].length;
                int width = picture.width();
                int height = picture.height();
                Picture target = new Picture(width, height);

                double sumRed, sumGreen, sumBlue;
                int red, green, blue, targetRed, targetGreen, targetBlue;
                Color sourceColor, targetColor;

                for (int row = 0; row < height; row++) {
                        for (int col = 0; col < width; col++) {
                                sumRed = 0.0;
                                sumGreen = 0.0;
                                sumBlue = 0.0;
                                for (int i = 0; i < filterRow; i++) {
                                        for (int j = 0; j < filterCol; j++) {
                                                // periodic boundry conditions:
                                                // the leftmost column wraps around the rightmost column
                                                // and the top row wraps around to the bottom
                                                sourceColor = picture.get((col - filterCol/2 + j + width) % width, (row - filterRow/2+i+height) % height);
                                                red = sourceColor.getRed();
                                                green = sourceColor.getGreen();
                                                blue = sourceColor.getBlue();
                                                sumRed += weights[i][j] * red;
                                                sumGreen += weights[i][j] * green;
                                                sumBlue += weights[i][j] * blue;
                                        }
                                }
                                targetRed = roundClamp(sumRed);
                                targetGreen = roundClamp(sumGreen);
                                targetBlue = roundClamp(sumBlue);
                                targetColor = new Color(targetRed, targetGreen, targetBlue);
                                target.set(col, row, targetColor);
                        }
                }
                return target;
        }
        // Test client
        public static void main(String[] args) {
                Picture picture = new Picture(args[0]);
                picture.show();

                Picture gaussianPic = gaussian(picture);
                gaussianPic.show();
                Picture sharpenPic = sharpen(picture);
                sharpenPic.show();
                Picture laplacianPic = laplacian(picture);
                laplacianPic.show();
                Picture embossPic = emboss(picture);
                embossPic.show();
                Picture motionPic = motionBlur(picture);
                motionPic.show();
        }
}
