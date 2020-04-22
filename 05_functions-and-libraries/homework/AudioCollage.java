public class AudioCollage {
        // returns a new array that rescales a[] by a multiplicative factor of alpha.
        public static double[] amplify(double[] a, double alpha) {
                double[] newAudio = new double[a.length];
                for (int i = 0; i < a.length; i++) {
                        newAudio[i] = alpha * a[i];
                }
                return newAudio;
        }
        // returns a new array that is the reverse of a[].
        public static double[] reverse(double[] a) {
                double[] newAudio = new double[a.length];
                for (int i = 0; i < a.length; i++) {
                        newAudio[a.length-1-i] = a[i];
                }
                return newAudio;
        }
        // returns a new array that is the concatenation of a[] and b[].
        public static double[] merge(double[] a, double[] b) {
                double[] newAudio = new double[a.length + b.length];
                for (int i = 0; i < a.length; i++) {
                        newAudio[i] = a[i];
                }
                for (int i = 0; i < b.length; i++) {
                        newAudio[a.length + i] = b[i];
                }
                return newAudio;
        }
        // returns a new array that is the sum of a[] and b[],
        // padding the shorter arrays with trailing 0s if necessary.
        public static double[] mix(double[] a, double[] b) {
                int sizeA = a.length;
                int sizeB = b.length;
                double[] newAudio;
                if (sizeA > sizeB) { newAudio = new double[a.length]; }
                else { newAudio = new double[b.length]; }
                for (int i = 0; i < newAudio.length; i++) {
                        if (i < sizeA && i < sizeB) { newAudio[i] = a[i] + b[i]; }
                        else if (i >= sizeA) { newAudio[i] = b[i]; }
                        else { newAudio[i] = a[i]; }
                }
                return newAudio;
        }
        // returns a new array that changes the speed by the given factor.
        public static double[] changeSpeed(double[] a, double alpha) {
                int n = (int) (a.length / alpha);
                double[] newAudio = new double[n];
                for (int i = 0; i < n; i++) {
                        newAudio[i] = a[(int) (i * alpha)];
                }
                return newAudio;
        }
        // creates an audio collage and plays it on standard audio.
        public static void main(String[] args) {
                double alpha = 0.5;
                double[] bbSound = StdAudio.read("beatbox.wav");
                double[] pianoSound = StdAudio.read("piano.wav");
                double[] singerSound = StdAudio.read("singer.wav");
                double[] cowSound = StdAudio.read("cow.wav");
                double[] harpSound = StdAudio.read("harp.wav");
                StdAudio.play(amplify(bbSound, alpha));
                StdAudio.play(reverse(pianoSound));
                StdAudio.play(merge(singerSound, bbSound));
                StdAudio.play(mix(cowSound, bbSound));
                StdAudio.play(changeSpeed(harpSound, alpha));
        }
}
